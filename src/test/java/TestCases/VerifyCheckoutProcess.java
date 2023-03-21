package TestCases;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.CheckoutProcess;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyCheckoutProcess extends BaseClass {

	@Test
	public void checkOutProcess() throws Exception {

		// test=extent.createTest("login test case");
//Steps for Checkout Procedure 
		CheckoutProcess obj = new CheckoutProcess(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Search for product 

		obj.searchBox().sendKeys(Constants.searchBox);
		obj.searchBT().click();
		obj.selectedItem().click();
		obj.qtyBT().clear();
		obj.qtyBT().sendKeys("2");

//Add to Cart wrong no. of products 

		obj.atcBT().click();
		obj.clickATC().click();
		obj.viewCart().click();

//Edit quantity of products from view cart		

		obj.changeQty().click();
		obj.changeQty().clear();
		obj.changeQty().sendKeys("1");
		obj.updateQty().click();
		obj.checkOutBT().click();

//Filling Checkout details as a guest		

		obj.orderAsGuest().click();
		obj.continueBt().click();
		obj.firstName().sendKeys(Constants.firstName);
		obj.lastName().sendKeys(Constants.lastName);
		obj.userEmail().sendKeys(Constants.userEmail);
		obj.userPhNo().sendKeys(Constants.userPhNo);
		obj.companyName().sendKeys(Constants.companyName);
		obj.address1().sendKeys(Constants.address1);
		obj.address2().sendKeys(Constants.address2);
		obj.city().sendKeys(Constants.city);
		obj.postCode().sendKeys(Constants.postCode);
		obj.countrySelect().click();
		Select s = new Select(obj.countrySelect());
		s.selectByValue(Constants.CountryValue);
		obj.region().click();
		Select s1 = new Select(obj.region());
		s1.selectByValue(Constants.RegionValue);

// it throws unsuccessful checkout error

		obj.continue1bt().click();
		System.out.println(obj.alertmsg().getText());
	}

}
