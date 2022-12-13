package day1selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BaseClass;

public class SelectPractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		openchrome();//open chrome-->delete cookie-->maxi-->wait
		
		
		WebElement select = driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(select);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByIndex(0);
		
JavascriptExecutor js = (JavascriptExecutor)driver; 
		

		js.executeScript("window.scroll(0,1200)");	
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement target = driver.findElement(By.id("mousehover"));
		
		act.moveToElement(target).build().perform();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(target));
		
		
		
		
		
		
		
		
	}

}
