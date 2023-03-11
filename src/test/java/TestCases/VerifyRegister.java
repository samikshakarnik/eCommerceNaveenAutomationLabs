package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjectModel.Register;
import Resources.BaseClass;

public class VerifyRegister extends BaseClass {
	
	@Test
	public void registerUser() throws Exception {

//Register new user, fetching data from excel
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Samiksha\\Desktop\\software testing\\Practexcel.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(7);
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(1);
		String Firstname = cell.toString();
		System.out.println(Firstname);
		
		Cell cell1 = row.getCell(2);
		String Lastname = cell1.toString();
		System.out.println(Lastname);
		
		Cell cell2 = row.getCell(3);
		String Email = cell2.toString();
		System.out.println(Email);
		
		int phone= (int)workbook.getSheetAt(7).getRow(1).getCell(4).getNumericCellValue();
		System.out.println(phone);	

		Cell cell3 = row.getCell(5);
		String Password = cell3.toString();
		System.out.println(Password);
		
		Register obj = new Register(driver);
		obj.navigateToMyAc().click();
		obj.navigateToRegister().click();
		obj.enterName().sendKeys(Firstname);
		obj.enterLastName().sendKeys(Lastname);
		obj.enterEmail().sendKeys(Email);
		obj.enterPhone().sendKeys(String.valueOf(phone));
		obj.enterPassword().sendKeys(Password);
		obj.enterConfirmPW().sendKeys(Password);
		obj.Checkagree().click();
		Thread.sleep(7000);
		obj.clickContinue().click();
		Thread.sleep(7000);
		
	}

}
