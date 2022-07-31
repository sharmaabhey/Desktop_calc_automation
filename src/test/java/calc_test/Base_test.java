package calc_test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.windows.WindowsDriver;

public class Base_test {

	WindowsDriver driver;

	@BeforeMethod

	public void launch_applictaion() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("deviceName", "WindowsPC");
		capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
		//capabilities.setCapability("app", "C:\\Windows\\System32\\calc.exe");
		// driver= new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);
		
	}

	@AfterMethod

	public void close_app() {
		driver.quit();

	}

}
