package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.DeleteFromCart;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyDeleteFromCart extends BaseClass {

	@Test
	public void deleteFromCart() throws Exception {

		DeleteFromCart obj = new DeleteFromCart(driver);
		
//Delete from shopping cart		
		
		obj.searchBox().sendKeys(Constants.searchBox);
		Thread.sleep(3000);
		obj.searchBT().click();
		Thread.sleep(3000);
		obj.clickOnSelectedItem().click();
		Thread.sleep(3000);
		obj.addToCart().click();
		Thread.sleep(3000);
		System.out.println("Notification: " + obj.fetchNotification().getText());
		Thread.sleep(3000);
		System.out.println("Cart Value: " + obj.fetchATCText().getText());
		Thread.sleep(3000);
		obj.ATCBt().click();
		Thread.sleep(3000);
		obj.clickViewCart().click();
		Thread.sleep(3000);
		obj.removeFromCart().click();
		Thread.sleep(3000);
		System.out.println("Message: " + obj.fetchmsg1().getText() + "\n" + obj.fetchmsg2().getText());
		Thread.sleep(3000);
	}
}
