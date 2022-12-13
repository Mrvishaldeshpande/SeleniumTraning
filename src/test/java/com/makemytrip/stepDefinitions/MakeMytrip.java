package com.makemytrip.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class MakeMytrip {
	
	public static  final String url="https://www.makemytrip.com/";
	public static  String lang="(//span[contains(text(),'eng')])[1]";
	public static String SInput="//p[@class='selectConInput']";
	public static String selectcountrty="//p[contains(text(),'USA')]";
	public static String Apply="//button[contains(text(),'Apply') and @type='button']";
	public static String country="//span[contains(text(),'USA')]";
	public static WebDriver d;
	
	/*@Before(order=-1) public void firstBefore() {
		System.out.println("I am first Before method");
	}*/
	@Before (order=0)
	public void ivoke() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		d= new ChromeDriver();
		
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
			
		Thread.sleep(1500);
		d.get(url);
		
	}
	
	
	@Given("^Baljeet land on MakeMytrip Page$")
	public void baljeet_land_on_MakeMytrip_Page() throws Exception  {
		
		d.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
	}

	@When("^Baljeet Click on Country button$")
	public void baljeet_Click_on_Country_button()   {
		d.findElement(By.xpath(lang)).click();
		
	}

	@Then("^Rahul click on Select Country button$")
	public void rahul_click_on_Select_Country_button()  {
	    
	}

	@Then("^Rushikant Click on USA Country$")
	public void rushikant_Click_on_USA_Country()  {
		d.findElement(By.xpath(SInput)).click();
		d.findElement(By.xpath(selectcountrty)).click();
		
	}

	@Then("^Vishal Click on Apply Buttton$")
	public void vishal_Click_on_Apply_Buttton() throws Exception  {
		d.findElement(By.xpath(Apply)).click();
		
		
		Thread.sleep(1500);
		
	}

	@Then("^everyone Verified USA is displayed$")
	public void everyone_Verified_USA_is_displayed()  {
	    
		boolean displayed =d.findElement(By.xpath(country)).isDisplayed();
		
		Assert.assertEquals(true, displayed);
		
		
		
		
	}

	
	@After()
	public void quit(){
		
		d.quit();
		
	}
}
