package TestCases;

import PageObjectModel.ContactUsForm;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyContactUsForm extends BaseClass{
	
	public void contactUsForm() {
		
		//test=extent.createTest("login test case");
		ContactUsForm obj = new ContactUsForm(driver);
		obj.contactUs().click();
		obj.name().sendKeys(Constants.name);
		obj.email().sendKeys(Constants.email);
		obj.enquiry().sendKeys(Constants.enquiry);
		obj.submitBT().click();	
	}

}
