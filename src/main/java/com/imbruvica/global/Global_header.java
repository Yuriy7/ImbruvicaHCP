package com.imbruvica.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import url.list.Url;

public class Global_header {
	
	private static WebElement element = null;
	
	public static By prescr_inf = By.xpath("//a[contains(@id, 'Desk') and contains(text(), 'Prescribing')]");
	public static By patient_site = By.xpath("//a[text()='Patient Site']");
	public static By sign_up = By.xpath("//*[contains(text(), 'Sign Up')]");
	public static By specialty_pharmacies;
	public static By home_imbr_logo = By.xpath("//*[@class='logo-holder rounded-bottom']");
	public static By global_imbr_logo = By.xpath(".//div[@class='large-2 columns']//a[@class='logo']");
	public static By condition_home;
	

	
	
	
	    public static WebElement prescr_inf (WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(prescr_inf);
		return element;
	}
	    public static WebElement patient_site (WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(patient_site);
		return element;
	}
	    public static WebElement sign_up (WebDriver driver, String ext){
		driver.get(Url.url1+ext);
		element = driver.findElement(sign_up);
		return element;
	}
	    public static WebElement home_imbr_logo (WebDriver driver, String ext){
	    	driver.get(Url.url1+ext);
	    	element = driver.findElement(home_imbr_logo);
	    	return element;
	}
// CLL *****************************************************************
	    public static WebElement global_imbr_logo (WebDriver driver, String ext){
	    	driver.get(Url.url1+ext);
	    	element = driver.findElement(global_imbr_logo);
	    	return element;
	}


	

	
}
