package day2selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println();System.out.println();System.out.println();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click();
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		driver.findElement(By.id("checkBoxOption2")).click();

		textbox.sendKeys("Sandeep");
		
		/*List<WebElement> list = driver.findElements(By.xpath("//input[@name='radioButton']"));
		System.out.println(list);
		System.out.println(list.size());*/
		
		/*//Navigate 
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");*/
		
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(5000);
		
		String currentWindow=driver.getWindowHandle();
		
		System.out.println(currentWindow);
		
		
		Set<String> list2 = driver.getWindowHandles();
		
		System.out.println(list2);
		System.out.println(list2.size());
		
		
		Thread.sleep(5000);
		
		//closing current focus window
		driver.close();
		
		Thread.sleep(3000);
		
		//closing all window
		driver.quit();
	}

}
