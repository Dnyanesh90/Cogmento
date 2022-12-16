package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups={"HomePage"},dependsOnGroups ={"LoginPage"})
public class HomePage extends BaseClass {

	@Test(priority=1)
	public void validateHomePageTitle() {
		Assert.assertEquals(true, driver.getTitle().contains("CRM"));
		String actualTitle =driver.getTitle();
		boolean a =actualTitle.contains("CRM");
		Assert.assertEquals(true, a);

	}

	@Test(priority=2)
	public void validateHomePageUrl() {
		Assert.assertEquals(true, driver.getCurrentUrl().contains("cogmento"));
	}

	@Test(priority=3)
	public void validateHomePageLogo() {
		boolean a = driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();

		Assert.assertEquals(true, a);
	}

}
