package day1selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import basePackage.BaseClass;

public class LocatersPractice extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		openchrome();
		driver.findElement(By.id("autocomplete")).sendKeys("Baljeet");
		driver.findElement(By.name("checkBoxOption1")).click();
		driver.findElement(By.className("inputs")).sendKeys("Rahul");
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		
		System.out.println(" Link count is ---> "+list.size());
		
		for(WebElement n:list) {
			
			System.out.println(n);
		}
		
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		
		Select select = new Select(drop);
		
	
		
		Thread.sleep(4000);
		select.selectByIndex(1);
		Thread.sleep(4000);
		select.selectByValue("option2");
		Thread.sleep(4000);
		select.selectByVisibleText("Option3");
		
		
		driver.findElement(By.id("name")).sendKeys("Baljeet");
		driver.findElement(By.id("alertbtn")).click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		Thread.sleep(2000);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		js.executeScript("window.scroll(0,1300)");	
		Thread.sleep(3000);
		
		WebElement target = driver.findElement(By.id("mousehover"));
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
	
		
		//driver.quit();
		
	}

}
