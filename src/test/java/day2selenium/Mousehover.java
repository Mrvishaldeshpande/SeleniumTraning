package day2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousehover {
	
	

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		
		
		
		
		Thread.sleep(1500);
		
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		d.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		
		
		JavascriptExecutor js = (JavascriptExecutor)d;//TypeCasting
		js.executeScript("window.scrollBy(0,1800)");
		
		
		/*Actions a = new Actions(d);
				a.moveToElement(d.findElement(By.id("mousehover"))).build().perform();*/
		
				
				d.switchTo().frame("iframe-name");
				Thread.sleep(1000);
		d.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		
		
		
				//d.close();
		
		
		
		
		
	}

}
