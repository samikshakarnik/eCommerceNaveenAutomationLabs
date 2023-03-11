package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.Footer;
import Resources.BaseClass;


public class VerifyFooter extends BaseClass {

	@Test
	public void footer() throws Exception {

//This code checks all the links are click able or not
		
		Footer obj = new Footer(driver);
		Thread.sleep(3000);
		obj.linktofooter().click();
		Thread.sleep(3000);

		for (int i = 0; i < obj.noOfLink().size(); i++) {
			Thread.sleep(3000);
			System.out.println("Link: " + obj.noOfLink().get(i).getText().toUpperCase());
			obj.noOfLink().get(i).click();
			Thread.sleep(3000);
			if (obj.noOfLink().get(i).isEnabled()) {
				System.out.println("Link Clickable= " + obj.noOfLink().get(i).isEnabled());
			} else {
				System.out.println("Link not clickable= " + obj.noOfLink().get(i).isEnabled());
			}
		}
	}
}
