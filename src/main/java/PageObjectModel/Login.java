package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	private By navigateToMyAc = By.xpath("//span[normalize-space()='My Account']");
	private By navigateToLogin = By.xpath("(//a[normalize-space()='Login'])[1]");
	private By enterEmail = By.xpath("//input[@id='input-email']");
	private By enterPassword = By.xpath("//input[@id='input-password']");
	private By clickLogin = By.xpath("//input[@value='Login']");

	
	public Login(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement navigateToMyAc() {
		return driver.findElement(navigateToMyAc);
	}
	
	public WebElement navigateToLogin() {
		return driver.findElement(navigateToLogin);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(enterEmail);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(enterPassword);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(clickLogin);
	}

}
