package com.imbruvica.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import url.list.Url;

public class SupHomePage {
	
	
	
  private static WebElement element = null;
  private static String start_url = Url.url1+Url.sup_home; 
    
   // static By prescr_inf = By.xpath("//a[contains(@id, 'Desk') and contains(text(), 'Prescribing')]");
    
   // static By sign_up = By.xpath("//*[contains(text(), 'Sign Up')]");
    
	static By bucket_cll = By.xpath("//div[@class='hero-block cll']");
	
	static By bucket_mcl = By.xpath("//div[@class='hero-block mcl']");
	static By bucket_wm = By.xpath("//div[@class='hero-block wm']");
	
	
	
	
	/*  public static WebElement home_sign_up (WebDriver driver){
		driver.get(start_url);
		element = driver.findElement(sign_up);
		return element;
	} */
	/*  public static WebElement home_prescr_inf (WebDriver driver){
		driver.get(start_url);
		element = driver.findElement(prescr_inf);
				return element;
	}*/
		public static WebElement bucket_cll(WebDriver driver){
		driver.get(start_url);
		element = driver.findElement(bucket_cll);
		return element;
	}
	public static WebElement bucket_mcl(WebDriver driver){
		driver.get(start_url);
		element = driver.findElement(bucket_mcl);
		return element;
	}
	public static WebElement bucket_wm(WebDriver driver){
		driver.get(start_url);
		element = driver.findElement(bucket_wm);
		return element;
	}
	
  
  
}
