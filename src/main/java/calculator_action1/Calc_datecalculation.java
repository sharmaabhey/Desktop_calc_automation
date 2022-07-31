package calculator_action1;

import org.openqa.selenium.WebElement;

import io.appium.java_client.windows.WindowsDriver;

public class Calc_datecalculation {
	
	
	WindowsDriver driver;
	
	
	public Calc_datecalculation(WindowsDriver driver) {
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
	
	
	public void click_datecalculation(String datecalc) {
		WebElement calcdate= driver.findElementByAccessibilityId(datecalc);
		calcdate.click();
	}
	
	public void click_onfromdate(String month ,String Date) throws InterruptedException {
		WebElement from = driver.findElementByAccessibilityId("DateDiff_FromDate");
		from.click();
		Thread.sleep(3000);
		
		driver.findElementByAccessibilityId("Content").click();      //It is clicking on content of the calendar means it is clicking month selecter.
		Thread.sleep(4000);
		WebElement m = driver.findElementByName(month);   //it is selecting the user defined month
		m.click();
		Thread.sleep(4000);
		
		WebElement date = driver.findElementByName(Date);  //It is selecting the user defined date
		date.click();
		Thread.sleep(4000);
		
//		driver.findElementByAccessibilityId("HeaderButton").click();
//		WebElement y = driver.findElementByName(year);
//		y.click();
	}
	
	public void click_ontodate(String year ,String month , String Date) throws InterruptedException {
		WebElement to = driver.findElementByAccessibilityId("DateDiff_ToDate");
		to.click();
//		Thread.sleep(2000);
		
		driver.findElementByAccessibilityId("Content").click(); 
//		Thread.sleep(2000);
		driver.findElementByAccessibilityId("HeaderButton").click();
//		Thread.sleep(2000);
		WebElement y = driver.findElementByName(year);
		y.click();
//		Thread.sleep(2000);
		WebElement m = driver.findElementByName(month);   //it is selecting the user defined month
		m.click();
//		Thread.sleep(2000);
		WebElement date = driver.findElementByName(Date);  //It is selecting the user defined date
		date.click();
		Thread.sleep(4000);
		
		
		
	}
	
	public void taking_difference_between_dates() {
		WebElement text = driver.findElementByAccessibilityId("DateDiffAllUnitsResultLabel");
		String str = text.getText();
//		String str = text.getAttribute("Name");
		System.out.println("Difference between From date and To date is :- " + str);
	}

}
