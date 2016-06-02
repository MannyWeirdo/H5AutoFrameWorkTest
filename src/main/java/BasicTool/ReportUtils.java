package BasicTool;

import java.util.List;

import org.testng.ITestResult;
import org.uncommons.reportng.ReportNGUtils;

public class ReportUtils extends ReportNGUtils {

    public List<String> getTestOutput(final ITestResult result) {
        final List<String> output = super.getTestOutput(result);
        final Exception error = (Exception) result.getAttribute("reportGeneratingException");

        if (error != null) {
            output.add("Generating report error: " + error);
            return output;
        }

//        final String screenshot = (String) result.getAttribute("screenshot");

//        if (screenshot != null) {
//            String str = "<a href=\"" + screenshot + "\" target=\"_blank\">Screenshot</a> for a page "
//                    + result.getAttribute("screenshotURL");
//            output.add(str);
//        }
        List<String> screenshots = (List<String>) result.getAttribute("screenshots"); 
        if(!screenshots.isEmpty()){
            for(String str:screenshots){
                String str1 = "<a href=\"../../" + str + "\" target=\"_blank\">Screenshot</a>";
                output.add(str1);
            }
        }
        return output;
    }
}
