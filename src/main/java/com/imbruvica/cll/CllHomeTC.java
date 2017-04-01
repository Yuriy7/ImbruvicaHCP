package com.imbruvica.cll;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import support.Get_response;
import support.SetDr;
import url.list.Url;
import verify_page.Page_verification;

import com.imbruvica.global.Global_footer;
import com.imbruvica.global.Global_header;
import com.imbruvica.global.Global_isi;
import com.imbruvica.global.Titles;
import com.imbruvica.home.SupHomePage;

public class CllHomeTC {
	
	WebElement element;
	WebDriver driver;
	WebDriverWait wait;
	String ext = Url.cll_home;
	
	/*@Parameters("browser")
	@BeforeTest
	public void set_driver (String browser){
		driver = SetDr.set_driver(browser);
		 wait = new WebDriverWait(driver, 30);
		 
		}*/
	@BeforeTest
	public void set_driver (){
		driver = SetDr.set_driver();
		 wait = new WebDriverWait(driver, 15);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	
// GLOBAL HEADER ***************************************************************
	
	
	@Test()
	  public void cll_home_prescr_inf_header() throws IOException {
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_header.prescr_inf (driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.prescr_inf_PDF));
				Assert.assertEquals(200, Get_response.getHTTPResponseStatusCode(Url.prescr_inf_PDF) );
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
	
	@Test
	public void cll_home_patient_site(){
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_header.patient_site(driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				
				if(driver.getCurrentUrl().contains(Url.now_approved)){
					driver.findElement(By.xpath("//*[text()='Enter the Site']")).click();
				}
								
				wait.until(ExpectedConditions.urlMatches(Url.patient_site));
				Assert.assertEquals(Titles.patient_site, driver.getTitle());
				
		} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
	}
	
	@Test
	public void cll_home_sign_up() {
		//driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Global_header.sign_up(driver, ext).click();
	//WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.urlMatches(Url.url1+Url.cll_sign_up));
	Assert.assertEquals(Titles.cll_sign_up, driver.getTitle());
	//Assert.assertEquals(driver.getCurrentUrl(), "https://imbruvicahcp.pcycspops.com/cll/sign-up");
	//driver.quit();
	}
	
	@Test
	public void cll_home_imbr_logo() {
		Global_header.global_imbr_logo(driver, ext).click();
		
		if(driver.getCurrentUrl().contains(Url.now_approved)){
			driver.findElement(By.xpath("//*[text()='Enter the Site']")).click();
		}
		
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.sup_home));
		Assert.assertEquals(Titles.sup_home, driver.getTitle());
	}
	
// BUCKETS *************************************************************************
	@Test 
	public void home_bucket_cll(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SupHomePage.bucket_cll(driver).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1+Url.cll_home));
		Assert.assertEquals(Titles.cll_home, driver.getTitle());
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(Page_verification.cll_homePage_mainTitle, Page_verification.cll_homePage_text));
		Page_verification.cll_homePage_text(wait);
	}
	@Test
	public void home_bucket_mcl(){
		SupHomePage.bucket_mcl(driver).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1+Url.mcl_home));
		Assert.assertEquals(Titles.mcl_home, driver.getTitle());
		}
	@Test
	public void home_bucket_wm(){
		SupHomePage.bucket_wm(driver).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.wm_home));
		Assert.assertEquals(Titles.wm_home, driver.getTitle());
		}
	
	
	
// ***********  FOOTER *************************************************************************	
	@Test()
	  public void cll_home_prescr_inf_upper() throws IOException {
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.prescr_inf_upper (driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.prescr_inf_PDF));
				Assert.assertEquals(200, Get_response.getHTTPResponseStatusCode(Url.prescr_inf_PDF) );
			} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
			
	
	@Test
	public void cll_home_legal_upper(){
		Global_footer.legal_upper(driver, ext).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_legal));
		wait.until(ExpectedConditions.titleIs(Titles.cll_legal));
	}
	@Test
	public void cll_home_privacy_upper(){
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.privacy_upper(driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.privacy_policy_page));
				wait.until(ExpectedConditions.titleIs(Titles.privacy_policy_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
	@Test
	public void cll_home_pharmacyclics_logo(){
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.pharmacyclics_logo(driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.pharmacyclics_page));
				wait.until(ExpectedConditions.titleIs(Titles.pharmacyclics_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
	
	@Test()
	public void cll_home_janssen_logo(){
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.janssen_logo(driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.janssen_page));
				wait.until(ExpectedConditions.titleIs(Titles.janssen_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
	
	@Test()
	  public void cll_home_prescr_inf_footer() throws IOException {
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.prescr_inf_footer (driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.prescr_inf_PDF));
				Assert.assertEquals(200, Get_response.getHTTPResponseStatusCode(Url.prescr_inf_PDF) );
			} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
	
	
	@Test
	public void cll_home_fda_side(){
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.fda_side(driver, ext).click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				//WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.urlMatches(Url.footer_fda));
				wait.until(ExpectedConditions.titleIs(Titles.fda_side));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
		
	@Test
	public void cll_home_unsubscribe() {
		Global_footer.unsubscribe(driver, ext).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_unsubscribe));
		Assert.assertEquals(Titles.cll_unsubscribe, driver.getTitle());
		}
	@Test
	public void cll_home_privacy_footer(){
		driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		Global_footer.privacy_footer(driver, ext).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.privacy_policy_page));
				wait.until(ExpectedConditions.titleIs(Titles.privacy_policy_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
		}
	
	@Test
	public void cll_home_legal_footer(){
		Global_footer.legal_footer(driver, ext).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_legal));
		wait.until(ExpectedConditions.titleIs(Titles.cll_legal));
		}
	@Test
	public void cll_home_contact_us(){
		Global_footer.contact_us(driver, ext).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_contact_us_page));
		wait.until(ExpectedConditions.titleIs(Titles.cll_contact_us_title));
		}
	
//**************  ISI  *********************************************************************************
//******************************************************************************************************		
	
	/*
	@Test()  // This TC execute if isi is visible 
	 void isi_test () throws IOException{
		driver.get(Url.url1+ext);
		if( driver.findElement(Global_isi.toggle).isDisplayed()){
		home_isi_prescr_inf_upper();
		home_isi_legal_upper();
		home_isi_privacy_upper();
		home_isi_pharmacyclics_logo();
		home_isi_janssen_logo();
		home_isi_prescr_inf_footer();
		home_isi_fda_side();
		home_isi_unsubscribe();
		home_isi_privacy_footer();
		home_isi_legal_footer();
		home_isi_contact_us();
		
	}   
	}*/
	@Test
	  public void cll_home_isi_prescr_inf_upper() throws IOException {
		  driver.get(Url.url1+ext);
		if( driver.findElement(Global_isi.toggle).isDisplayed()){
			
		
		//driver.get(Url.url1+ext);
		String parent_window = driver.getWindowHandle();
		
		Global_isi.isi_prescr_inf_upper (driver, ext, wait).click();
				
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.prescr_inf_PDF));
				Assert.assertEquals(200, Get_response.getHTTPResponseStatusCode(Url.prescr_inf_PDF) );
			} } 
		 driver.close();
		 driver.switchTo().window(parent_window);}
		else System.out.println("Skiped");
		
		}
			
	
	@Test
	public void cll_home_isi_legal_upper(){
		    driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
				
		Global_isi.isi_legal_upper(driver, ext, wait).click();
		
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_legal));
		wait.until(ExpectedConditions.titleIs(Titles.cll_legal));
			}
	}
	@Test
	public void cll_home_isi_privacy_upper(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		String parent_window = driver.getWindowHandle();
		Global_isi.isi_privacy_upper(driver, ext, wait).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.privacy_policy_page));
				wait.until(ExpectedConditions.titleIs(Titles.privacy_policy_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
			}
		}
	@Test
	public void cll_home_isi_pharmacyclics_logo(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		String parent_window = driver.getWindowHandle();
		Global_isi.isi_pharmacyclics_logo(driver, ext, wait).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.pharmacyclics_page));
				wait.until(ExpectedConditions.titleIs(Titles.pharmacyclics_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
			}
		}
	
	@Test
	public void cll_home_isi_janssen_logo(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		String parent_window = driver.getWindowHandle();
		Global_isi.isi_janssen_logo(driver, ext, wait).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.janssen_page));
				wait.until(ExpectedConditions.titleIs(Titles.janssen_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
			}
		}
	
	@Test
	  public void cll_home_isi_prescr_inf_footer() throws IOException {
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		String parent_window = driver.getWindowHandle();
		Global_isi.isi_prescr_inf_footer (driver, ext, wait).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.prescr_inf_PDF));
				Assert.assertEquals(200, Get_response.getHTTPResponseStatusCode(Url.prescr_inf_PDF) );
			} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
			}
		}
	
	
	@Test
	public void cll_home_isi_fda_side(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		String parent_window = driver.getWindowHandle();
		Global_isi.isi_fda_side(driver, ext, wait).click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				//WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.urlMatches(Url.footer_fda));
				wait.until(ExpectedConditions.titleIs(Titles.fda_side));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
			}
		}
		
	@Test
	public void cll_home_isi_unsubscribe() {
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		Global_isi.isi_unsubscribe(driver, ext, wait).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_unsubscribe));
		Assert.assertEquals(Titles.cll_unsubscribe, driver.getTitle());
			}
		}
	@Test
	public void cll_home_isi_privacy_footer(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		String parent_window = driver.getWindowHandle();
		Global_isi.isi_privacy_footer(driver, ext, wait).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext()){
			String chiled_window=i1.next();
			if (!parent_window.equalsIgnoreCase(chiled_window)){
				driver.switchTo().window(chiled_window);
				wait.until(ExpectedConditions.urlMatches(Url.privacy_policy_page));
				wait.until(ExpectedConditions.titleIs(Titles.privacy_policy_title));
				} } 
		 driver.close();
		 driver.switchTo().window(parent_window);
			}
		}
	
	@Test
	public void cll_home_isi_legal_footer(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		Global_isi.isi_legal_footer(driver, ext, wait).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_legal));
		wait.until(ExpectedConditions.titleIs(Titles.cll_legal));
		}
	}
	@Test
	public void cll_home_isi_contact_us(){
		  driver.get(Url.url1+ext);
			if( driver.findElement(Global_isi.toggle).isDisplayed()){
		Global_isi.isi_contact_us(driver, ext, wait).click();
		wait.until(ExpectedConditions.urlMatches(Url.url1 + Url.cll_contact_us_page));
		wait.until(ExpectedConditions.titleIs(Titles.cll_contact_us_title));
		}
     }
	
}
