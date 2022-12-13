package day2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static  final String url="https://www.makemytrip.com/";
	public static  String lang="(//span[contains(text(),'eng')])[1]";
	public static String SInput="//p[@class='selectConInput']";
	public static String selectcountrty="//p[contains(text(),'UAE')]";
	public static String Apply="//button[contains(text(),'Apply') and @type='button']";
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		
		//"div.searchCountryDiv"

		
		
		
		Thread.sleep(1500);
		
		
		d.get(url);
		
		d.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);

		d.findElement(By.xpath(lang)).click();
		d.findElement(By.xpath(SInput)).click();
		d.findElement(By.xpath(selectcountrty)).click();
		d.findElement(By.xpath(Apply)).click();
		
	}

}
