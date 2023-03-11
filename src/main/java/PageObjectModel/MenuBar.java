package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBar {
	
	public WebDriver driver;
	
	private By listofitemsinMenuBar = By.xpath("//ul[@class='nav navbar-nav']//li//a");
	private By navigateToDesktop = By.xpath("(//a[@class='dropdown-toggle'])[2]");
	private By desktopDDList = By.xpath("(//ul[@class='list-unstyled'])[1]//li//a");
	private By navigateToLaptops = By.xpath("(//a[@class='dropdown-toggle'])[3]");
	private By laptopDDList = By.xpath("(//ul[@class='list-unstyled'])[2]//li//a");
	private By navigateToComponents = By.xpath("(//a[@class='dropdown-toggle'])[4]");
	private By componentsDDList = By.xpath("(//ul[@class='list-unstyled'])[3]//li//a");
	private By navigateToTablets = By.xpath("//a[normalize-space()='Tablets']");
	private By navigateToSoftware = By.xpath("//a[normalize-space()='Software']");
	private By navigateToPhones = By.xpath("//a[normalize-space()='Phones & PDAs']");
	private By navigateToCameras =  By.xpath("//a[normalize-space()='Cameras']");
	private By navigateToMP3 = By.xpath("(//a[@class='dropdown-toggle'])[5]");
	private By mp3DDList = By.xpath("(//div[@class='dropdown-inner'])[4]//li//a");
	
	
	
	public MenuBar(WebDriver driver2) {
		this.driver=driver2;
	}

	public List<WebElement> listofitemsinMenuBar() {
		return driver.findElements(listofitemsinMenuBar);
	}
	
	public WebElement navigateToDesktop() {
		return driver.findElement(navigateToDesktop);
	}
	
	public List<WebElement> desktopDDList() {
		return driver.findElements(desktopDDList);
	}
	
	public WebElement navigateToLaptops() {
		return driver.findElement(navigateToLaptops);
	}
	
	public List<WebElement> laptopDDList() {
		return driver.findElements(laptopDDList);
	}
	
	public WebElement navigateToComponents() {
		return driver.findElement(navigateToComponents);
	}
	
	public List<WebElement> componentsDDList() {
		return driver.findElements(componentsDDList);
	}
	
	public WebElement navigateToTablets() {
		return driver.findElement(navigateToTablets);
	}
	
	public WebElement navigateToSoftware() {
		return driver.findElement(navigateToSoftware);
	}
	
	public WebElement navigateToPhones() {
		return driver.findElement(navigateToPhones);
	}
	
	public WebElement navigateToCameras() {
		return driver.findElement(navigateToCameras);
	}
	
	public WebElement navigateToMP3() {
		return driver.findElement(navigateToMP3);
	}
	
	public List<WebElement> mp3DDList() {
		return driver.findElements(mp3DDList);
	}

}
