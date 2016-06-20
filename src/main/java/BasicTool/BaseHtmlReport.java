package BasicTool;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.VelocityContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.uncommons.reportng.HTMLReporter;

public class BaseHtmlReport extends HTMLReporter implements ITestListener {

    private static final String UTILS_KEY = "utils";
    private static final ReportUtils REPORT_UTILS = new ReportUtils();
    private static Logger log = LogFactory.getLogger(BaseHtmlReport.class);

    protected VelocityContext createContext() {
        final VelocityContext context = super.createContext();
        context.put(UTILS_KEY, REPORT_UTILS);
        return context;
    }

    public void createScreenshot(final ITestResult result, final WebDriver driver) {
        final DateFormat timeFormat = new SimpleDateFormat("MM.dd.yyyy HH-mm-ss");
        final String fileName = result.getMethod().getMethodName() + "_" + timeFormat.format(new Date());
        try {
            File scrFile;

            if (driver.getClass().equals(RemoteWebDriver.class)) {
                scrFile = ((TakesScreenshot) new Augmenter().augment(driver)).getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            }

            String outputDir = result.getTestContext().getOutputDirectory();
            outputDir = outputDir.substring(0, outputDir.lastIndexOf('\\')) + "\\html";

            final File saved = new File(outputDir, fileName + ".png");
            FileUtils.copyFile(scrFile, saved);

            result.setAttribute("screenshot", saved.getName());
        } catch (IOException e) {
            result.setAttribute("reportGeneratingException", e);
        }

        result.setAttribute("screenshotURL", driver.getCurrentUrl());
    }

    private static List<String> list = new ArrayList<String>();

    public static void createScreenshots(final WebDriver driver) {
        final String fileName = String.valueOf(System.currentTimeMillis()) + getRandomString(9);
        try {
            File scrFile;

            if (driver.getClass().equals(RemoteWebDriver.class)) {
                scrFile = ((TakesScreenshot) new Augmenter().augment(driver)).getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            }

            final File saved = new File("resources/", fileName + ".png");
            FileUtils.copyFile(scrFile, saved);
            //Thumbnails.of("resources/" + fileName + ".png").size(2000, 1000).toFile("resources/" + fileName + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.add("resources/" + fileName + ".png");

    }

    public static void takeScreenshots(final ITestResult result) {
        List<String> list1 = new ArrayList<String>();
        list1.addAll(list);
        result.setAttribute("screenshots", list1);
        list.clear();

    }

    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult result) {
        createScreenshots(DriverFactory.getCurrentDriver());
        log.info("TestCases Failure!!!!");
        takeScreenshots(result);

    }

    public void onTestSkipped(ITestResult result) {
        createScreenshots(DriverFactory.getCurrentDriver());
        log.info("TestCases Skipped!!!!");
        takeScreenshots(result);

    }

    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult result) {
        createScreenshots(DriverFactory.getCurrentDriver());
        log.info("TestCases Success!!!!");
        takeScreenshots(result);
    }

    public static String getRandomString(int length) { // length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

}
