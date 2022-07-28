package calculator_action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class Calc_act1 {
	
	
	WindowsDriver driver;
	
	
	public Calc_act1(WindowsDriver driver) {
		this.driver=driver;
	}
	
	
	public void adding_numbers() throws Exception {
		WebElement ele = driver.findElementByName("One");
				//driver.findElementByXPath("/*[@ClassName='Button'  and @ControlType='50000']");
				//driver.findElement(By.name("One"));
		ele.click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Five")).click();
		driver.findElement(By.name("Equals")).click();
		Thread.sleep(4000);
		
	}

}
