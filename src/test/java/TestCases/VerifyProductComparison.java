package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.ProductComparison;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyProductComparison extends BaseClass {

	@Test
	public void productComparison() throws Exception {

//Product Comparison and fetching basic product details from the table
		// test=extent.createTest("login test case");
		ProductComparison obj = new ProductComparison(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.searchItem().sendKeys(Constants.searchBox);
		Thread.sleep(5000);
		obj.searchBT().click();
		obj.compareBT().click();
		obj.compareBT2().click();
		obj.clickonCompareProduct().click();
		System.out.println("1st Product Name: " + obj.productName().getText() + ", 2nd Product Name: "
				+ obj.productName2().getText());

		System.out.println("1st Product Model: " + obj.productModel().getText() + ", 2nd Product Model: "
				+ obj.productModel2().getText());

		System.out.println("1st Product Prize: " + obj.productPrize().getText() + ", 2nd Product Prize: "
				+ obj.productPrize1().getText());

		System.out.println("1st Product Summary: " + obj.productSummary().getText() + " \n 2nd Product Summary: "
				+ obj.productSummary2().getText());

	}

}
