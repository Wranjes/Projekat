package Start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.Login;
import Objects.Registracija;
import TestObject.AutomLogInTest;
import TestObject.AutomPostTest;
import TestObject.AutomRegTest;


public class AutomMain {

	public static void main(String[] args) {
		
		//CREATE WEBDRIVER
		WebDriver driver= new ChromeDriver();
	   
		// WAIT FOR RESPONSE
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		try {
			
		//GO TO URL
			driver.get(Registracija.URL);
			
		//  MORE USERS REGISTER, LOGIN, POST and DELETE POST
			
			
			
			AutomRegTest.testRegWithAllData(driver);
			
			AutomLogInTest.testLogInWithAllData(driver);
		    Login.navigateToDashboardURL(driver);
			
			AutomPostTest.testPostWithAllData(driver);
					
			AutomPostTest.deletePost(driver);
						
					
			
		}catch (Exception e) {
			e.printStackTrace();
			} finally {
				driver.quit();

			}
		}

}
