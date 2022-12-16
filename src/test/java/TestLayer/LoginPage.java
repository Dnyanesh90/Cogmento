package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = {"LoginPage"})
public class LoginPage extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.inilization();
	}

	@Test
	public void loginFunctionality() {
		driver.findElement(By.name("email")).sendKeys("dnyaneshkadam0702@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Dk@7798913075");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.close();

}
}
