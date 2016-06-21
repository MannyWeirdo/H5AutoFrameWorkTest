package BasicTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Report.BaseHtmlReport;

public class baiduPage {
	WebDriver wd;
	
	@FindBy(css = "#kw")
	private WebElement searchTextField;

	@FindBy(css = "#su")
	private WebElement clickButton;

	@FindBy(css = "#sb_form_q")
	private WebElement bSearchTextField;

	@FindBy(css = "#sb_form_go")
	private WebElement bClickButton;

	public baiduPage(WebDriver driver) {
		this.wd = driver;
		PageFactory.initElements(wd, this);
	}

	public void MyTestFunction() throws InterruptedException {
		searchTextField.sendKeys("Symbio大傻逼公司");
		clickButton.click();
		BaseHtmlReport.createScreenshots(wd);
		wd.get("http://www.bing.com");
		Thread.sleep(3000);
		bSearchTextField.sendKeys("Symbio大傻逼公司");
		bClickButton.click();
		BaseHtmlReport.createScreenshots(wd);
	}

}
