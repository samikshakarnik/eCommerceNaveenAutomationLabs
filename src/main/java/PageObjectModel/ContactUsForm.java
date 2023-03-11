package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsForm {
	
	public WebDriver driver;
	
	private By contactUs = By.xpath("//i[@class='fa fa-phone']");
	private By name = By.xpath("//input[@id='input-name']");
	private By email = By.xpath("//input[@id='input-email']");
	private By enquiry = By.xpath("//textarea[@id='input-enquiry']");
	private By submitBT = By.xpath("//input[@value='Submit']");
	
	public ContactUsForm(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement contactUs() {
		return driver.findElement(contactUs);
	}
	
	public WebElement name() {
		return driver.findElement(name);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement enquiry() {
		return driver.findElement(enquiry);
	}
	
	public WebElement submitBT() {
		return driver.findElement(submitBT);
	}

}
