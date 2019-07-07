package TestObject;


import org.openqa.selenium.WebDriver;

import Objects.Registracija;
import utility.Constant;
import utility.ExcelUtils;

public class AutomRegTest {
	
	// AUTOMATIC REGISTER FORM FILL METHOD
	public static void fillRegForm(WebDriver driver, int i)throws Exception {
		
		try {
		
		String data;
		
		//WE CALL EXCEL FILE
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME);
		

					
			//FIRST NAME
			Registracija.clickFname(driver);
			data = ExcelUtils.getCellData(i,0);
			Registracija.fillFname(driver, data);
			Thread.sleep(100);
			
			//LAST NAME
			Registracija.clickLname(driver);
			data = ExcelUtils.getCellData(i,1);
			Registracija.fillLname(driver, data);
			Thread.sleep(100);
			
			//USERNAME
			Registracija.clickUname(driver);
			data = ExcelUtils.getCellData(i,2);
			Registracija.fillUname(driver, data);
			Thread.sleep(100);
			
	    	//EMAIL
			Registracija.clickEmail(driver);
			data = ExcelUtils.getCellData(i,3);
			Registracija.fillEmail(driver, data);
			Thread.sleep(100);
			
			//PASSOWORD
			Registracija.clickPassword(driver);
			data = ExcelUtils.getCellData(i,4);
			Registracija.fillPassword(driver, data);
			Thread.sleep(100);
			
			//CLICK REG. BUTTON AND TEST URL AFTER
			Registracija.clickTestRegisterButton(driver);
			Thread.sleep(100);
	
		
}
		catch (Exception e) {
			e.printStackTrace();
			}
}
	
	//TEST ALL DATA
	public static void testRegWithAllData(WebDriver driver)throws Exception{
	
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME);
	
		//LOOP FOR AUTOMATIC FILL
		for(int i=1; i<=ExcelUtils.getWorkSheet().getLastRowNum();i++) {
		
			fillRegForm(driver,i);
			
		}
	}
	
		
	
}