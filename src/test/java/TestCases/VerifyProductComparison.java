package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.ProductComparison;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyProductComparison extends BaseClass{
	
	@Test
	public void productComparison() throws Exception {
		
//Product Comparison and fetching basic product details from the table
		
		ProductComparison obj = new ProductComparison(driver);
		obj.searchItem().sendKeys(Constants.searchBox);
		Thread.sleep(5000);
		obj.searchBT().click();
		Thread.sleep(3000);
		obj.compareBT().click();
		Thread.sleep(3000);
		obj.compareBT2().click();
		Thread.sleep(3000);
		obj.clickonCompareProduct().click();
		Thread.sleep(3000);
		System.out.println("1st Product Name: " + obj.productName().getText() + ", 2nd Product Name: " + obj.productName2().getText());
		Thread.sleep(3000);
		System.out.println("1st Product Model: " + obj.productModel().getText() + ", 2nd Product Model: " + obj.productModel2().getText());
		Thread.sleep(3000);
		System.out.println("1st Product Prize: " + obj.productPrize().getText() + ", 2nd Product Prize: " + obj.productPrize1().getText());
		Thread.sleep(3000);
		System.out.println("1st Product Summary: " + obj.productSummary().getText()+ " \n 2nd Product Summary: " + obj.productSummary2().getText());
		Thread.sleep(3000);
	
	}

}
