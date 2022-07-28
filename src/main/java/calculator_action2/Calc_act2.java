package calculator_action2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.windows.WindowsDriver;

public class Calc_act2 {
	WindowsDriver driver;
//	@FindBy(name="Open Navigation")
//	WebElement open_navigate;
	
	
	
	
	
	public Calc_act2(WindowsDriver driver) {
		this.driver=driver;
	}
	
	public void clicking_on_open_navigation() {
		WebElement open_navigate= driver.findElementByAccessibilityId("TogglePaneButton");
		String str = open_navigate.getAttribute("Name");
		System.out.println("clicking on " + str);
				
				//driver.findElementByName("Open Navigation");
		open_navigate.click();
	
		
	}
	public void click_on_length() {
		WebElement length= driver.findElementByAccessibilityId("Length");
		String str = length.getAttribute("Name");	
		System.out.println("clicking on " + str);
				//driver.findElementByName("Length Converter");
		length.click();
	}
	
	public void selecting_inputunit() {
		WebElement input_unit = driver.findElementByAccessibilityId("Units1");
		String str = input_unit.getAttribute("Name");
		System.out.println("clicking on " + str);
				//driver.findElementByName("Input unit");
		input_unit.click();
	}
	
	
	public void click_onslected_unit() {
		WebElement  selectedunit= driver.findElementByName("Kilometers");
		selectedunit.click();
		
	}
	
	public void entering_number() throws InterruptedException {
		WebElement num = driver.findElement(By.name("One"));
		num.click();
		Thread.sleep(4000);
	}
	
	public void taking_outputunit_value() throws InterruptedException {
		WebElement ele  = driver.findElementByAccessibilityId("Value2");
		String str = ele.getAttribute("Name");
		System.out.println(str);
		Thread.sleep(4000);
	}
	
	public void againclick_on_opennavigation() {
		WebElement again_click = driver.findElement(By.name("Open Navigation"));
		again_click.click();
	}
	
	public void click_on_standard() {
		WebElement standard = driver.findElement(By.name("Standard Calculator"));
		standard.click();
	}
	

}
