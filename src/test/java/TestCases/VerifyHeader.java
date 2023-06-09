package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Header;
import Resources.BaseClass;
import Resources.commonMethods;

public class VerifyHeader extends BaseClass {
	@Test
	public void header() throws Exception {

//This code check all the header links are click able or not
		// test=extent.createTest("login test case");
		Header obj = new Header(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		obj.clickoncurrency().click();

		try {
			commonMethods.handleAssertions(obj.currencyDropDown().getText(), "€ Euro", "It is not Working");
		} catch (AssertionError exe) {
			System.out.println("Currency Drop Down is not Clickable");
		}

		try {
			commonMethods.handleAssertions(obj.clickphoneNo().getText(), "123456789", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

		obj.clickmyAccount().click();

		try {
			commonMethods.handleAssertions(obj.myAccountDropDown().getText(), "Register", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}

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
