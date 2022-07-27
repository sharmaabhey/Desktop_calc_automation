package calculator_action2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Calc_act2 {
	RemoteWebDriver driver;
	
	
	
	
	public Calc_act2(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public void clicking_on_open_navigation() {
		WebElement open_navigate= driver.findElement(By.name("Open Navigation"));
		open_navigate.click();
	
		
	}
	public void click_on_length() {
		WebElement length= driver.findElement(By.name("Length Converter"));
		length.click();
	}
	
	public void selecting_inputunit() {
		WebElement input_unit = driver.findElement(By.name("Input unit"));
		input_unit.click();
	}
	
	
	public void click_onslected_unit() {
		WebElement  selectedunit= driver.findElement(By.name("Kilometers"));
		selectedunit.click();
		
	}
	
	public void entering_number() throws InterruptedException {
		WebElement num = driver.findElement(By.name("One"));
		num.click();
		Thread.sleep(4000);
	}
	
	public void taking_outputunit_value() throws InterruptedException {
		String str = driver.findElement(By.id("Convert from 1,00,000 Centimeters")).getAttribute("Name");
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
