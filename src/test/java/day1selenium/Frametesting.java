package day1selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import basePackage.BaseClass;

public class Frametesting extends BaseClass {

	public static void main(String[] args) throws Exception {
		openchrome();
		

		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		js.executeScript("window.scroll(0,1500)");	
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframe-name");
		
		driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scroll(0,-1500)");
		driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();

	}

}
