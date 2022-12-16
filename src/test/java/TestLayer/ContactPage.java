package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = { "ContactPage" }, dependsOnGroups = { "HomePage" })
public class ContactPage extends BaseClass {

	@Test(priority = 1)
	public void verifyUserIsOnContactPage() {
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();

		boolean a = driver.getCurrentUrl().contains("contacts");
		Assert.assertEquals(true, a);
	}

	@Test(priority = 2)
	public void createANewUser() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
		driver.findElement(By.name("first_name")).sendKeys("Selenium");
		driver.findElement(By.name("last_name")).sendKeys("Testinng");
		driver.findElement(By.xpath("//button[text()='Public']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid multiple selec')]")).click();
		driver.findElement(By.xpath("//div[@class='selected item']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void updateUserDetails() throws InterruptedException {
		driver.findElement(By.xpath("(//i[@class='edit icon'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("first_name")).sendKeys("Cucumber");
		driver.findElement(By.name("value")).sendKeys("selenium@amdocs.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}

	@Test(priority = 4)
	public void deleteUser() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='ui button icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
	}


}
