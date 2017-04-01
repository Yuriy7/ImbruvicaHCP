package com.imbruvica.global;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import com.imbruvica.home.SupHomePage;

import url.list.Url;

public class Global_isi {
	
	private static WebElement element = null;
	
	static By isi_prescr_inf_upper = By.xpath(".//*[@id='floatingIsi']//strong/a");
	static By isi_legal_upper = By.xpath(".//*[@id='floatingIsi']/div[2]/div[3]/div/div/p[1]/a[1]");
	static By isi_privacy_upper = By.xpath(".//*[@id='floatingIsi']//a[2]");
	static By isi_pharmacyclics_logo = By.xpath(".//*[@id='floatingIsi']//a[1]/img");
	static By isi_janssen_logo = By.xpath(".//*[@id='floatingIsi']//a[2]/img");
	static By isi_prescr_inf_footer = By.xpath(".//*[@id='floatingIsi']//a[1]");
	static By isi_fda_side = By.xpath(".//*[@id='floatingIsi']/div[2]/div[5]/div/div/a[2]");
	static By isi_unsubscribe = By.xpath("//*[@id='floatingIsi']//a[3]");
	static By isi_privacy_footer = By.xpath(".//*[@id='floatingIsi']//a[4]");
	static By isi_legal_footer = By.xpath("//*[@id='floatingIsi']//a[5]");
	static By isi_contact_us = By.xpath(".//*[@id='floatingIsi']//a[6]");
	static By ok_inter = By.xpath("//*[@id='lso']/div/div/div[2]/div[1]");
	
	public static By toggle = By.xpath(".//*[@class='toggle']");
	
		static By isi = By.xpath(".//*[@class='main-header']//a[text()='Important Safety Information']");
	
		
	public static WebElement isi_prescr_inf_upper (WebDriver driver, String ext, WebDriverWait wait ){
		driver.get(Url.url1 + ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_prescr_inf_upper));
		element = driver.findElement(isi_prescr_inf_upper);
		return element;
	}
	
	public static WebElement isi_legal_upper (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1+ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_legal_upper));
		element = driver.findElement(isi_legal_upper);
		return element;
	}
	public static WebElement isi_privacy_upper (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1+ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_privacy_upper));
		element = driver.findElement(isi_privacy_upper);
		return element;
	}
	public static WebElement isi_pharmacyclics_logo(WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1+ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_pharmacyclics_logo));
		element = driver.findElement(isi_pharmacyclics_logo);
		return element;
	}
	public static WebElement isi_janssen_logo(WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1+ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_janssen_logo));
		element = driver.findElement(isi_janssen_logo);
		return element;
	}
	public static WebElement isi_prescr_inf_footer (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1+ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_prescr_inf_footer));
		element = driver.findElement(isi_prescr_inf_footer);
		return element;
	}
	
	public static WebElement isi_fda_side (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1 + ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_fda_side));
		driver.findElement(isi_fda_side).click();
		element = driver.findElement(ok_inter);
		return element;
	}
	
	
	public static WebElement isi_unsubscribe (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1 + ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_unsubscribe));
		element = driver.findElement(isi_unsubscribe);
		return element;
	}
	public static WebElement isi_privacy_footer (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1 + ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_privacy_footer));
		element = driver.findElement(isi_privacy_footer);
		return element;
	}
	
	public static WebElement isi_legal_footer (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1 + ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_legal_footer));
		element = driver.findElement(isi_legal_footer);
				return element;
	}
	
	public static WebElement isi_contact_us (WebDriver driver, String ext, WebDriverWait wait){
		driver.get(Url.url1 + ext);
		driver.findElement(isi).click();
		wait.until(ExpectedConditions.elementToBeClickable(isi_contact_us));
		element = driver.findElement(isi_contact_us);
				return element;
	}
		
	
}
