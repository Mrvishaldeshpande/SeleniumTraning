package com.makemytrip.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class SelectionBuses  {
	
	public static String Buses="(//span[@class='chNavText darkGreyText'])[6]";
	public static String FromTexs="fromCity";
	public static String selectfromCity="//span[contains(text(),'";
	public static String selectfromcity2=", Maharashtra') and @class='sr_city blackText']";

	
	
	@When("^Baljeet click on Buses$")
	public void baljeet_click_on_Buses()  {
	
		
		MakeMytrip.d.findElement(By.xpath(Buses)).click();
	}

	@Then("^Baljeet Will select City (.*)$")
	public void baljeet_Will_select_City_Pune(String location) throws Exception  {
		MakeMytrip.d.findElement(By.id(FromTexs)).click();
		MakeMytrip.d.findElement(By.xpath(selectfromCity+location+selectfromcity2)).click();
		
		Thread.sleep(2000);
	}
	
	@Given("^Rahul land on MakeMytrip Page$")
	public void rahul_land_on_MakeMytrip_Page()  {
	    System.out.println("Rahul");
	}
	

	@Before("@Rahul")public void conditionlHooks() 
	{
		System.out.println(" I am before scenario of @Rahul");
	}
	
	
	
	@When("^Rahul click on bus$")
	public void rahul_click_on_bus()  {
	    System.out.println("I am Click on bus");
	}
}
