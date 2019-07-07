package TestObject;

import org.openqa.selenium.WebDriver;

import Objects.Login;
import Objects.Registracija;
import utility.Constant;
import utility.ExcelUtils;

public class AutomLogInTest {
	
	// AUTOMATIC LOGIN FORM FILL METHOD
		public static void fillLogInForm (WebDriver driver, int i)throws Exception {
		
			try {
			
			String data;
			
			//WE CALL EXCEL FILE
			ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME);
			
                //USERNAME
				Login.clickLogInUname(driver);
				data = ExcelUtils.getCellData(i,2);
				Login.fillLogInUname(driver, data);
				Thread.sleep(100);

				//PASSOWORD
				Login.clickLogInPassword(driver);
				data = ExcelUtils.getCellData(i,4);
				Login.fillLogInPassword(driver, data);
				Thread.sleep(100);
				
				//CLICK LOG IN BUTTON AND TEST URL AFTER
				Login.clickTestLogInButton(driver);
				Thread.sleep(100);
				
				
				
			
			
			}catch (Exception e) {
				e.printStackTrace();
				}
		}	
						
			//TEST ALL DATA
			public static void testLogInWithAllData(WebDriver driver)throws Exception{
			
				ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME);
			
				// AUTOMATIC LOGIN FORM FILL METHOD
				for(int i=1; i<=ExcelUtils.getWorkSheet().getLastRowNum();i++) {
				
					fillLogInForm(driver,i);
						
				}
			}
						
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


