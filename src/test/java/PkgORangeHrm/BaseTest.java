package PkgORangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
@BeforeTest
public void browserlaunch() {
	String driverPath = System.getProperty("user.dir") + "\\src\\test\\java\\PkgORangeHrm\\BrowserDrivers\\chromedriver.exe";
	System.out.println(driverPath);
	System.setProperty("webdriver.chrome.driver", driverPath);
	 driver = new ChromeDriver();
}
@Test
public void Login() {
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
}
