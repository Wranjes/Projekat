package Start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.Login;
import Objects.Registracija;
import TestObject.LogInTest;
import TestObject.PostTest;
import TestObject.RegistracijaTest;

public class Main {

	public static void main(String[] args) {
	
		//CREATE WEBDRIVER
		WebDriver driver= new ChromeDriver();
	   
		// WAIT FOR RESPONSE
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
		try {
			
		//GO TO URL
			driver.get(Registracija.URL);
			
		//  ONE USER REGISTER, LOGIN AND POST	
			
			RegistracijaTest.goToRegistration(driver);
				
			LogInTest.goToLogIn(driver);
			Login.navigateToDashboardURL(driver);
			
			
			PostTest.setPost(driver);
			
			
		}catch (Exception e) {
			e.printStackTrace();
			} finally {
				driver.quit();

			}
	}

}
