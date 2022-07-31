package calculator_action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.windows.WindowsDriver;

public class Calc_lengthconverteract {
	WindowsDriver driver;
//	@FindBy(name="Open Navigation")
//	WebElement open_navigate;
	
	
	
	
	
	public Calc_lengthconverteract(WindowsDriver driver) {
		this.driver=driver;
	}
	
//	public void clicking_on_open_navigation() {
//		WebElement open_navigate= driver.findElementByAccessibilityId("TogglePaneButton");
//		String str = open_navigate.getAttribute("Name");
//		System.out.println("clicking on " + str);
//				
//				//driver.findElementByName("Open Navigation");
//		open_navigate.click();
//	
//		
//	}
	public void click_on_length(String len) {
		WebElement length= driver.findElementByAccessibilityId(len);
		String str = length.getAttribute("Name");	
		System.out.println("clicking on " + str);
				//driver.findElementByName("Length Converter");
		length.click();
	}
	
	public void selecting_inputunit(String input_units) {
		WebElement input_unit = driver.findElementByAccessibilityId(input_units);
		String str = input_unit.getAttribute("Name");
		System.out.println("clicking on " + str);
				//driver.findElementByName("Input unit");
		input_unit.click();
	}
	
	
	public void click_onslected_unit(String unit) {
		WebElement  selectedunit= driver.findElementByName(unit);
		selectedunit.click();
		
	}
	
	public void entering_number(String len_num) throws InterruptedException {
		WebElement num = driver.findElement(By.name(len_num));
		num.click();
		Thread.sleep(4000);
	}
	
	public void taking_outputunit_value() throws InterruptedException {
		WebElement ele  = driver.findElementByAccessibilityId("Value2");
		String str = ele.getAttribute("Name");
		System.out.println(str);
//		MobileElement mob = (MobileElement) driver.findElementByTagName("text");
//		String strin = mob.getAttribute("Name");
//		System.out.println(strin);
	
//		MobileElement miles = driver.findElementByClassName("")
		Thread.sleep(4000);
	}
	
//	public void againclick_on_opennavigation() {
//		WebElement again_click = driver.findElementByAccessibilityId("TogglePaneButton");
//				//driver.findElement(By.name("Open Navigation"));
//		again_click.click();
//	}
//	
//	public void click_on_standard() {
//		WebElement standard = driver.findElementByName("Standard Calculator");
//				//driver.findElement(By.name("Standard Calculator"));
//		standard.click();
//	}
	

}
