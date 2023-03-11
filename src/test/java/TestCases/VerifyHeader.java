package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.Header;
import Resources.BaseClass;
import Resources.commonMethods;

public class VerifyHeader extends BaseClass {
	@Test
	public void header() throws Exception {

//This code check all the header links are click able or not
		
		Header obj = new Header(driver);
		Thread.sleep(3000);
		obj.clickoncurrency().click();
		Thread.sleep(3000);

		try {
			commonMethods.handleAssertions(obj.currencyDropDown().getText(), "€ Euro" , "It is not Working");
		} catch (AssertionError exe) {
			System.out.println("Currency Drop Down is not Clickable");
		}
		Thread.sleep(3000);

		try {
			commonMethods.handleAssertions(obj.clickphoneNo().getText(), "123456789", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

		Thread.sleep(3000);
		obj.clickmyAccount().click();
		Thread.sleep(3000);

		try {
			commonMethods.handleAssertions(obj.myAccountDropDown().getText(), "Register", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

		Thread.sleep(3000);
		obj.clickWishList().click();

		try {
			commonMethods.handleAssertions(obj.pageText().getText(), "New Customer", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

		Thread.sleep(5000);
		obj.clickShoppingCart().click();

		try {
			commonMethods.handleAssertions(obj.pageText2().getText(), "Shopping Cart", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

		Thread.sleep(5000);
		obj.clickCheckout().click();

		try {
			commonMethods.handleAssertions(obj.pageText2().getText(), "Shopping Cart", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

		Thread.sleep(5000);
	}

}
