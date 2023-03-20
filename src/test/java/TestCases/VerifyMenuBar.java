package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.MenuBar;
import Resources.BaseClass;

public class VerifyMenuBar extends BaseClass {
	@Test
	public void menuBar() throws Exception {

//code to check all the links in menubar are click able or not
		//test=extent.createTest("login test case");
		MenuBar obj = new MenuBar(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Actions a = new Actions(driver);
		 a.moveToElement(obj.navigateToDesktop()).perform();
		 Thread.sleep(2000);
		 for(int i = 0 ; i<obj.desktopDDList().size(); i++) {
			 a.moveToElement(obj.navigateToDesktop()).perform();
			 System.out.println(obj.desktopDDList().get(i).getText());
			 obj.desktopDDList().get(i).click();
		 }
		 a.moveToElement(obj.navigateToLaptops()).perform();
		 Thread.sleep(2000);
		 for(int i = 0 ; i<obj.laptopDDList().size(); i++) {
			 a.moveToElement(obj.navigateToLaptops()).perform();
			 System.out.println(obj.laptopDDList().get(i).getText());
			 obj.laptopDDList().get(i).click();
		 }
		 a.moveToElement(obj.navigateToComponents()).perform();
		 Thread.sleep(2000);
		 for(int i = 0 ; i<obj.componentsDDList().size(); i++) {
			 a.moveToElement(obj.navigateToComponents()).perform();
			 System.out.println(obj.componentsDDList().get(i).getText());
			 obj.componentsDDList().get(i).click();
		 }
		 a.moveToElement(obj.navigateToTablets()).perform();
		 obj.navigateToTablets().click();
		 System.out.println(obj.navigateToTablets().getText());
		 Thread.sleep(2000);
		 
		 a.moveToElement(obj.navigateToSoftware()).perform();
		 obj.navigateToSoftware().click();
		 System.out.println(obj.navigateToSoftware().getText());
		 Thread.sleep(2000);
		 
		 a.moveToElement(obj.navigateToPhones()).perform();
		 obj.navigateToPhones().click();
		 System.out.println(obj.navigateToPhones().getText());
		 Thread.sleep(2000);
		
		 a.moveToElement(obj.navigateToCameras()).perform();
		 obj.navigateToCameras().click();
		 System.out.println(obj.navigateToCameras().getText());
		 Thread.sleep(2000);
		 
		 a.moveToElement(obj.navigateToMP3()).perform();
		 Thread.sleep(2000);
		 for(int i = 0 ; i<obj.mp3DDList().size(); i++) {
			 a.moveToElement(obj.navigateToMP3()).perform();
			 Thread.sleep(2000);
			 System.out.println(obj.mp3DDList().get(i).getText());
			 obj.mp3DDList().get(i).click();
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();
		 Thread.sleep(2000);
	}

}
