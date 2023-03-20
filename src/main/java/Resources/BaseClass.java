package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.extentManager.ExtentManager;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties prop;
	
//	 public ExtentSparkReporter htmlReporter;   // repsosnible for look
//	 public ExtentReports extent; //  Resposnisble for entries
//	 public ExtentTest test; // Respossible for test status pass/fail
	
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
	
	 @BeforeTest
	 public void ExtentReport() {
		 ExtentManager.setup();
	 }
//	 public void setup() {
//	 
//	  htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
//	  htmlReporter.config().setDocumentTitle("Automation Report");
//	  htmlReporter.config().setReportName("Functional Report");
//	  htmlReporter.config().setTheme(Theme.STANDARD);
//
//	  extent = new ExtentReports();
//	  extent.attachReporter(htmlReporter);
//	  extent.setSystemInfo("hostname", "LocalHost");
//	  extent.setSystemInfo("os", "windows8.1");
//	  extent.setSystemInfo("testername", "Samiksha");
//	 }
	
	@BeforeMethod
	public void launchDriver () throws Exception {
		openDriver();
		String url = prop.getProperty("url");
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	 @AfterMethod
	 public void driverclose() throws IOException {
		 
	  driver.quit();

	 }
	 
	 @AfterTest
	  public void endReport() {
	     ExtentManager.endReport();
	  }
	 
	 public static String screenShot(WebDriver driver,String filename) {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  String destination = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png";
		  File finalDestination= new File(destination);
		  try {
		   FileUtils.copyFile(source, finalDestination);
		  } catch (Exception e) {
		   e.getMessage();
		  }
		  return destination;
		 }

}
