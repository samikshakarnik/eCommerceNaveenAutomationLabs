package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutProcess {
	
	public WebDriver driver;
	
	private By searchBox = By.xpath("//input[@placeholder='Search']");
	private By searchBT = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By selectedItem = By.xpath("//a[normalize-space()='MacBook']");
	private By qtyBT = By.xpath("//input[@id='input-quantity']");
	private By atcBT = By.xpath("//button[@id='button-cart']");
	private By clickATC = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	private By viewCart = By.xpath("//strong[normalize-space()='View Cart']");
	private By changeQty = By.xpath("(//input[@type='text'])[2]");
	private By updateQty = By.xpath("//i[@class='fa fa-refresh']");
	private By checkOutBT = By.xpath("//a[@class='btn btn-primary']");
	private By orderAsGuest = By.xpath("//input[@value='guest']");
	private By continueBt = By.xpath("//input[@id='button-account']");
	private By firstName = By.xpath("//input[@id='input-payment-firstname']");
	private By lastName = By.xpath("//input[@id='input-payment-lastname']");
	private By userEmail = By.xpath("//input[@id='input-payment-email']");
	private By userPhNo = By.xpath("//input[@id='input-payment-telephone']");
	private By companyName = By.xpath("//input[@id='input-payment-company']");
	private By address1 = By.xpath("//input[@id='input-payment-address-1']");
	private By address2 = By.xpath("//input[@id='input-payment-address-2']");
	private By city = By.xpath("//input[@id='input-payment-city']");
	private By postCode = By.xpath("//input[@id='input-payment-postcode']");
	private By countrySelect = By.xpath("//select[@id='input-payment-country']");
	private By region = By.xpath("//select[@id='input-payment-zone']");
	private By continue1bt = By.xpath("//input[@id='button-guest']");
	private By alertmsg = By.xpath("//div[@class='alert alert-warning alert-dismissible']");
	
//	private By emailBox = By.xpath("//input[@id='input-email']");
//	private By pwBox = By.xpath("//input[@id='input-password']");
//	private By loginBT = By.xpath("//input[@id='button-login']");
	

	public CheckoutProcess(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}
	
	public WebElement searchBT() {
		return driver.findElement(searchBT);
	}
	
	public WebElement selectedItem() {
		return driver.findElement(selectedItem);
	}
	
	public WebElement qtyBT() {
		return driver.findElement(qtyBT);
	}
	
	public WebElement atcBT() {
		return driver.findElement(atcBT);
	}
	
	public WebElement clickATC() {
		return driver.findElement(clickATC);
	}
	
	public WebElement viewCart() {
		return driver.findElement(viewCart);
	}
	
	public WebElement changeQty() {
		return driver.findElement(changeQty);
	}
	
	public WebElement updateQty() {
		return driver.findElement(updateQty);
	}
	
	public WebElement checkOutBT() {
		return driver.findElement(checkOutBT);
	}
	
	public WebElement orderAsGuest() {
		return driver.findElement(orderAsGuest);
	}
	
	public WebElement continueBt() {
		return driver.findElement(continueBt);
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement userEmail() {
		return driver.findElement(userEmail);
	}
	
	public WebElement userPhNo() {
		return driver.findElement(userPhNo);
	}
	
	public WebElement companyName() {
		return driver.findElement(companyName);
	}
	
	public WebElement address1() {
		return driver.findElement(address1);
	}
	
	public WebElement address2() {
		return driver.findElement(address2);
	}
	
	public WebElement city() {
		return driver.findElement(city);
	}
	
	public WebElement postCode() {
		return driver.findElement(postCode);
	}
	
	public WebElement countrySelect() {
		return driver.findElement(countrySelect);
	}
	
	public WebElement region() {
		return driver.findElement(region);
	}
	
	public WebElement continue1bt() {
		return driver.findElement(continue1bt);
	}
	
	public WebElement alertmsg() {
		return driver.findElement(alertmsg);
	}
	
	  

}
