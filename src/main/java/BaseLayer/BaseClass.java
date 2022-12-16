package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BaseClass {

	protected static WebDriver driver;

	public static void inilization() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace1\\Cogmento\\Cogmento\\Driver\\chromedriver.exe");
		ChromeOptions opt =new ChromeOptions();
		//opt.addArguments("--headless");
		
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://ui.cogmento.com/");

	}

}
