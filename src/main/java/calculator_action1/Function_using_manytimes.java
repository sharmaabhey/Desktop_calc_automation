package calculator_action1;

import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class Function_using_manytimes {
	
	
	WindowsDriver driver;
	
	
	
	public Function_using_manytimes(WindowsDriver driver) {
		
		this.driver=driver;
	}
	
	
	public void clicking_on_open_navigation() {
		WebElement open_navigate= driver.findElementByAccessibilityId("TogglePaneButton");
		String str = open_navigate.getAttribute("Name");
		System.out.println("clicking on " + str);
				
				//driver.findElementByName("Open Navigation");
		open_navigate.click();
	
		
	}
	
	public void againclick_on_opennavigation() {
		WebElement again_click = driver.findElementByAccessibilityId("TogglePaneButton");
				//driver.findElement(By.name("Open Navigation"));
		again_click.click();
	}
	
	public void click_on_standard() {
		WebElement standard = driver.findElementByName("Standard Calculator");
				//driver.findElement(By.name("Standard Calculator"));
		standard.click();
	}

}
