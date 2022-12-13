package day1selenium;





import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import basePackage.BaseClass;

public class SwitchWindow extends BaseClass {

	public static void main(String[] args) throws Exception {
		BaseClass.openchrome();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		Set<String> Windolist = driver.getWindowHandles();
		Iterator<String> it = Windolist.iterator();
			it.next();
			String childwindow = it.next();
		
		
		System.out.println("Parent window ---> "+parent );
		System.out.println();
		System.out.println(Windolist);
		
		driver.switchTo().window(childwindow);
		
		Thread.sleep(10000);
		
		//driver.quit();
		driver.close();
		
	}

}
