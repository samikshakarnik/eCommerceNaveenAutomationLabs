package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	
	public WebDriver driver;
	
	private By searchBox = By.xpath("//input[@name='search']");
	private By searchBT = By.xpath("(//button[@type='button'])[4]");
	private By clickOnSelectedItem = By.xpath("//a[normalize-space()='MacBook']");
	private By inputQty = By.xpath("//input[@id='input-quantity']");
	private By addToCart = By.xpath("//button[@id='button-cart']");
	private By fetchNotification = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	private By fetchATCText = By.xpath("//span[@id='cart-total']");
	private By fetchPrize = By.xpath("(//ul[@class='list-unstyled'])[9]//li//h2");
	private By ATCBt = By.xpath("(//button[@type='button'])[5]");
	private By clickViewCart = By.xpath("//strong[normalize-space()='View Cart']");
	private By totalPrize = By.xpath("(//tbody)[3]//tr//td[@class='text-right'][2]");
	private By checkOut = By.xpath("//a[@class='btn btn-primary']");
	
	public AddToCart(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}
	
	public WebElement searchBT() {
		return driver.findElement(searchBT);
	}
	
	public WebElement clickOnSelectedItem() {
		return driver.findElement(clickOnSelectedItem);
	}
	
	public WebElement inputQty() {
		return driver.findElement(inputQty);
	}
	
	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}
	
	public WebElement fetchNotification() {
		return driver.findElement(fetchNotification);
	}
	
	public WebElement fetchATCText() {
		return driver.findElement(fetchATCText);
	}
	
	public WebElement fetchPrize() {
		return driver.findElement(fetchPrize);
	}
	
	public WebElement ATCBt() {
		return driver.findElement(ATCBt);
	}
	
	public WebElement clickViewCart() {
		return driver.findElement(clickViewCart);
	}
	
	public WebElement totalPrize() {
		return driver.findElement(totalPrize);
	}
	
	public WebElement checkOut() {
		return driver.findElement(checkOut);
	}
	

}
