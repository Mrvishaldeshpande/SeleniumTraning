package day1selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basePackage.BaseClass;

public class OpenChrome  {
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		/*driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		
		String Title = driver.getTitle();
		System.out.println();
		System.out.println(Title.equals("Practice page"));
		
		System.out.println();
		System.out.println(Title.equalsIgnoreCase("Practice page"));
		
		String url = driver.getCurrentUrl();
		System.out.println();
		System.out.println(url);
		
		String pagesource = driver.getPageSource();
		System.out.println();System.out.println(pagesource);
		
		driver.quit();
		
		
		

	}

}
