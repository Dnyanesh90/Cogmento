package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = { "CompanyPage" }, dependsOnGroups = { "HomePage" })
public class CompaniesPage extends BaseClass {

	@Test(priority = 1)
	public void verifyUserIsOnCompanyPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/companies']")).click();
		String actualText = driver.findElement(By.xpath("//div[text()='Companies']")).getText();

		Assert.assertEquals("Companies", actualText);
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void createNewCompany() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Create']")).click();

		driver.findElement(By.name("name")).sendKeys("LNT");

		driver.findElement(By.name("description")).sendKeys("Its a software Company");

		driver.findElement(By.name("industry")).sendKeys("Software");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}

	@Test(priority = 3)
	public void updateCompanyName() throws InterruptedException {
		driver.findElement(By.xpath("//i[@aria-posinset='4']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class='edit icon'])[1]")).click();

		driver.findElement(By.name("name")).clear();

		driver.findElement(By.name("name")).sendKeys(" Pvt Ltd");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();

	}

	@Test(priority = 4)
	public void deleteCompany() throws InterruptedException {
		driver.findElement(By.xpath("(//i[@class='trash icon'])[1]")).click();
		Thread.sleep(5000);
		String a = driver.findElement(By.xpath("//div[@class='content']/p")).getText();

		Assert.assertEquals(true, a.contains("delete"));

		driver.findElement(By.xpath("//button[text()='Delete']")).click();
	}
}
