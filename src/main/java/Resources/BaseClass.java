package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void openDriver() throws Exception {
		
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Data.properties");
		prop = new Properties();
		prop.load(fs);
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("check your browser");
		}
	
	}
	
	@BeforeMethod
	public void launchDriver () throws Exception {
		openDriver();
		String url = prop.getProperty("url");
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void closerDriver() {
		driver.quit();
	}

}
