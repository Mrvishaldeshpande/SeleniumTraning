package day2selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println();System.out.println();System.out.println();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		String Title="Practice Page";
		
		String WepPagetTiel= driver.getTitle();
		if(Title.equals(WepPagetTiel)) {System.out.println("True");}
		else {System.out.println("Fail");}
		
		
	}

}
