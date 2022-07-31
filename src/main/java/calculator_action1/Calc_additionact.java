package calculator_action1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class Calc_additionact {
	
	
	WindowsDriver driver;
//	@AndroidFindBy(accessibility = "equalButton")
//	MobileElement equal;
	
	
	public Calc_additionact(WindowsDriver driver) {
		this.driver=driver;
	}
	
	
	public void adding_numbers(String num1,  String operation , String num2) throws Exception {
		MobileElement ele = (MobileElement) driver.findElementByName(num1);
//		//List<WebElement> eles = driver.findElementsByXPath("//*[@ClassName='Button']");
//				//driver.findElement(By.name("One"));
//		
//		System.out.println(eles.size());
//		eles.stream().forEach(System.out::println); 
		
		ele.click();
		driver.findElement(By.name(operation)).click();
		driver.findElement(By.name(num2)).click();
		driver.findElementByAccessibilityId("equalButton").click();
		Thread.sleep(4000);
		
	}

}
