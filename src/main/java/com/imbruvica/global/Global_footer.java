package com.imbruvica.global;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.imbruvica.home.SupHomePage;

import url.list.Url;

public class Global_footer {
	
	private static WebElement element = null;
	
	static By prescr_inf_upper = By.xpath(".//*[@id='isi']//strong/a");
	static By legal_upper = By.xpath(".//*[@id='isi']/div[3]/div/div/p[1]/a[1]");
	static By privacy_upper = By.xpath(".//*[@id='isi']/div[3]/div/div/p[1]/a[2]");
	static By pharmacyclics_logo = By.xpath(".//*[@id='isi']/div[4]/div[2]/div/div/a[1]/img");
	static By janssen_logo = By.xpath(".//*[@id='isi']/div[4]/div[2]/div/div/a[2]/img");
	static By prescr_inf_footer = By.xpath(".//*[@id='isi']/div[5]/div/div/a[1]");
	static By fda_side = By.xpath("//*[@id='isi']/div[5]/div/div/a[2]");
	static By unsubscribe = By.xpath("//*[@id='isi']/div[5]/div/div/a[3]");
	static By privacy_footer = By.xpath(".//*[@id='isi']/div[5]/div/div/a[4]");
	static By legal_footer = By.xpath("//*[@id='isi']/div[5]/div/div/a[5]");
	static By contact_us = By.xpath(".//*[@id='isi']/div[5]/div/div/a[6]");
	
	
	
	
	public static By toggle = By.xpath(".//*[@class='toggle']");
	public static By Pr_IN = By.xpath(".//*[@id='floatingIsi']//strong/a");
	static By ok_inter = By.xpath("//*[@id='lso']/div/div/div[2]/div[1]");
	static By isi = By.xpath(".//*[@id='DesktopTopNav_T29B52313001_ctl00_ctl00_A0']");
	                  
	
	

	
	
	public static WebElement prescr_inf_upper (WebDriver driver, String ext){
		
		driver.get(Url.url1 + ext);
		element = driver.findElement(prescr_inf_upper);
		return element;
	}
	
	public static WebElement legal_upper (WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(legal_upper);
		return element;
	}
	public static WebElement privacy_upper (WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(privacy_upper);
		return element;
	}
	public static WebElement pharmacyclics_logo(WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(pharmacyclics_logo);
		return element;
	}
	public static WebElement janssen_logo(WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(janssen_logo);
		return element;
	}
	public static WebElement prescr_inf_footer (WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(prescr_inf_footer);
		return element;
	}
	
	public static WebElement fda_side (WebDriver driver, String ext){
		driver.get(Url.url1 + ext);
		driver.findElement(fda_side).click();
		element = driver.findElement(ok_inter);
				return element;
	}
	
	
	public static WebElement unsubscribe (WebDriver driver, String ext){
		driver.get(Url.url1 + ext);
		element = driver.findElement(unsubscribe);
				return element;
	}
	public static WebElement privacy_footer (WebDriver driver, String ext){
		driver.get(Url.url1 + ext);
		element = driver.findElement(privacy_footer);
				return element;
	}
	
	public static WebElement legal_footer (WebDriver driver, String ext){
		driver.get(Url.url1 + ext);
		element = driver.findElement(legal_footer);
				return element;
	}
	
	public static WebElement contact_us (WebDriver driver, String ext){
		driver.get(Url.url1 + ext);
		element = driver.findElement(contact_us);
				return element;
	}
		
	
	
	
	
	
	
	
	public static void just(WebDriver driver, String ext, WebDriverWait wait){
		
		driver.get(Url.url1+ext);
		
		//element = driver.findElement(toggle);
			if( driver.findElement(toggle).isDisplayed()){
				
				driver.findElement(isi).click();
				//wait.until(ExpectedConditions.elementToBeClickable(Global_footer.Pr_IN)).click();
				
				
				//SupHomePage.bucket_cll(driver).click();
				//wait.until(ExpectedConditions.urlMatches(Url.url1+Url.cll_home));
			//	Assert.assertEquals(Titles.cll_home, driver.getTitle());
			}
			
				
				
				
			
		}
	
	
	
	
	

}
