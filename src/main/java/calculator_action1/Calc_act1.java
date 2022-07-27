package calculator_action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Calc_act1 {
	
	
	RemoteWebDriver driver;
	
	
	public Calc_act1(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	
	public void adding_numbers() throws Exception {
		WebElement ele = driver.findElement(By.name("One"));
		ele.click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("Five")).click();
		driver.findElement(By.name("Equals")).click();
		Thread.sleep(4000);
		
	}

}
