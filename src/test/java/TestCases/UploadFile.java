package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
	@Test
	public void uploadingFile() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&path=20&product_id=42");
		Thread.sleep(2000);
		
		WebElement upload = driver.findElement(By.xpath("//button[@id='button-upload222']"));
		Thread.sleep(3000);
		
		upload.sendKeys("C:\\Users\\Samiksha\\Documents\\uploadtesting.txt");
		Thread.sleep(3000);
		System.out.println("hello");
	}

}
