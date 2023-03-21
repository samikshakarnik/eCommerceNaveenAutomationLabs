package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjectModel.Login;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyLogin extends BaseClass {
	
	@Test
	public void loginUser() throws Exception {
		
//Login Page, fetching data from excel
		//test=extent.createTest("login test case");
		FileInputStream fs = new FileInputStream("C:\\Users\\Samiksha\\Desktop\\software testing\\Practexcel.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(7);
		Row row = sheet.getRow(1);
		
		Cell cell2 = row.getCell(3);
		String Email = cell2.toString();
		//System.out.println(Email);
		
		Cell cell3 = row.getCell(5);
		String Password = cell3.toString();
		//System.out.println(Password);
		
		Login obj = new Login(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.navigateToMyAc().click();
		obj.navigateToLogin().click();
		obj.enterEmail().sendKeys(Email);
		//obj.enterPassword().sendKeys(Password);
		obj.enterPassword().sendKeys(Constants.password);
		Thread.sleep(4000);
		obj.clickLogin().click();
		Thread.sleep(4000);
	}
}
