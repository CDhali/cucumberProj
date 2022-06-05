package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LogingPage {
	WebDriver driver;
	public LogingPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement Username_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement Password_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SignIn_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER;

//	Intractable methods
	
	public void insertUsername(String username) {
		Username_Element.sendKeys(username);
	}
	
	public void insertPassword(String password) {
		Password_Element.sendKeys(password);
	}
	
	public void clickSignINButton() {
		SignIn_Element.click();
	}
	
	public void varifydashboardpage() {
		Assert.assertEquals("wrong page",DASHBOARD_HEADER.getText() , "Dashboard");
	}
	
}
	
//	another way to do this
	/*public void performLogin(String username, String password) {
		Username_Element.sendKeys(username);
		Password_Element.sendKeys(password);
		SignIn_Element.click();
	}*/
	
	