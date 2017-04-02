package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SetDr{
	
	static WebDriver driver;
	//public static String set_driver = "Chrome";
	public static String set_driver = "FireFox";
	//public static String set_driver = "ie";
	//public static String set_driver = "Edge";
	//static WebDriver driver;
	
	
	public static WebDriver set_driver (){
		
		if(set_driver.equals("FireFox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else if (set_driver.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (set_driver.equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (set_driver.equals("Edge")){
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\MicrosoftWecDriver\\MicrosoftWecDriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		return driver;
		}
		

	
	
	public static WebDriver set_driver (String browser){
		
		     if(browser.equals("FireFox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else if (browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\IE32\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
			return driver;
		}
		
	

}
