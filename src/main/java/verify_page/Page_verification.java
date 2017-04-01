package verify_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_verification {
	
private static WebElement element = null;
	
	public static By homePage_mainTitle = By.xpath("");
	
	// CLL ******************************************************************************************
	            // CLL Home
	public static By cll_homePage_mainTitle = By.xpath(".//*[@id='home']/div[1]/div/h1");
	public static String cll_homePage_text = "Chronic Lymphocytic Leukemia (CLL)";
	
	
	
	
	public static void cll_homePage_text (WebDriverWait wait){
		wait.until(ExpectedConditions.textToBePresentInElementLocated(Page_verification.cll_homePage_mainTitle, Page_verification.cll_homePage_text));
		
	}

}
