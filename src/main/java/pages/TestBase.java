package pages;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

public static WebDriver driver; 
public static void initDriver() {
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://techfios.com/billing/?ng=login");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//return driver;
}

public void takeScreenshot(WebDriver driver)  {		
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);	
	String currentDirectory = System.getProperty("user.dir");		
	SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
	Date date = new Date();
	String label = formatter.format(date);		
	try {
		FileUtils.copyFile(sourceFile, new File( currentDirectory + "/screenshot/" + label + ".png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

/* public void takeScreenshort(WebDriver driver) throws IOException {
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File file = ts.getScreenshotAs(OutputType.FILE);
	 
	 SimpleDateFormat formatter = new SimpleDateFormat("MMMMM.dd.yyyy_hh:mm aaa");
	 Date date = new Date();
	 String label = formatter.format(date);
	 
	 FileUtils.copyFile(file,new File(System.getProperty("user.dir") + "/screenshot/" + label + ".png"));
	 
 }*/







public static void tearDown() {
	driver.close();
	driver.quit();
}

	
}

