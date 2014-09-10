package mypackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyGoogleTest {
	WebDriver driver;
	@Test
	public void test() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
