package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AddToCart;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyAddToCart extends BaseClass {

	@Test
	public void addToCartt() throws Exception {

		AddToCart obj = new AddToCart(driver);
		Thread.sleep(3000);

//Navigate to SearchBox

		obj.searchBox().sendKeys(Constants.searchBox);
		Thread.sleep(3000);
		obj.searchBT().click();
		Thread.sleep(3000);

//Selecting MacBook

		obj.clickOnSelectedItem().click();
		Thread.sleep(3000);

//Quantity input
		obj.inputQty().clear();
		obj.inputQty().sendKeys("2");
		Thread.sleep(3000);

//Adding item to the Cart

		obj.addToCart().click();
		Thread.sleep(3000);

//Fetching ATC Notification		

		System.out.println("Notification: " + obj.fetchNotification().getText());
		Thread.sleep(3000);
		System.out.println("Text on AddToCart Button: " + obj.fetchATCText().getText());
		Thread.sleep(3000);
		System.out.println("Prize of selected Item: " + obj.fetchPrize().getText());
		Thread.sleep(3000);

//Converting String Prize into double

		double ItemPrize = Double.parseDouble(obj.fetchPrize().getText().replace("$", ""));
		Thread.sleep(3000);
		obj.ATCBt().click();
		obj.clickViewCart().click();
		Thread.sleep(3000);
		System.out.println("Total Prize in AddToCart: " + obj.totalPrize().getText());
		Thread.sleep(3000);
		double TotalPrize = Double.parseDouble(obj.totalPrize().getText().replaceAll("[$,]", ""));
		System.out.println(TotalPrize);
		Thread.sleep(3000);

//Adding product Prize

		double sum = ItemPrize + ItemPrize;
		System.out.println(sum);
		Thread.sleep(3000);

//Comparing Product Prize	

		if (TotalPrize == sum) {
			System.out.println("The Total Cart Value " + TotalPrize + " is same as Sum " + sum);
		}
		Thread.sleep(3000);
	}
}
