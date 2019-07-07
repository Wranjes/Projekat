package TestObject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import Objects.Post;
import utility.Constant;
import utility.ExcelUtils;

public class AutomPostTest {

	// AUTOMATIC SET UP POST METHOD
	public static void fillPost (WebDriver driver, int i ) throws Exception {
	
	try 	{
		
	String data;
	
	//WE CALL EXCEL FILE
	ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME1);

		// GO TO POST BUTTON
		Post.clickTestGoToPostButton(driver);
		Thread.sleep(100);
		
		//NAME
		Post.clickPostName(driver);
		data = ExcelUtils.getCellData(i,1);
		Post.fillPostName(driver, data);
		Thread.sleep(100);
		
		//LOCATION
		Post.clickPostLocation(driver);
		data = ExcelUtils.getCellData(i,2);
		Post.fillPostLocation(driver, data);
		Thread.sleep(100);
		
		//TRANSPORT
		Post.selectPostTransport(driver);
		Thread.sleep(100);
		
		//TEXTAREA
		Post.clickPostTextarea(driver);
		data = ExcelUtils.getCellData(i,0);
		Post.fillPostTextarea(driver, data);
		Thread.sleep(100);
		
		//POST BUTTON AND TEST URL AFTER
		Post.clickPostButton(driver);
		Thread.sleep(100);
	
		
	}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	
	//TEST ALL DATA METHOD
	public static void testPostWithAllData(WebDriver driver)throws Exception{
	
		ExcelUtils.setExcelFile(Constant.Path_TestData+Constant.File_TestData, Constant.SHEET_NAME1);
	
		
		//LOOP FOR AUTOMATIC FIL
		for(int i=1; i<=40;i++) {
		
			fillPost(driver,i);
			
			
		}
	}
	
	
	// DELETE POST METHOD
	
		public static void deletePost (WebDriver driver)throws Exception {
			try {
			// WE SET IN INT FOR TWO POSTS TO BE DELETED
			int i = 0;
			int n = 160;
			
			for (i=0;i<n;i++){	
			Post.click3DotsButton(driver);
			Thread.sleep(100);
			Post.clickDelPostButton(driver);
			Thread.sleep(100);
			}

		}
			
		catch (Exception e) {
			e.printStackTrace();
			}
		
		
		}
		


	
	
}

