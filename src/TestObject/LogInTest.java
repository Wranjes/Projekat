package TestObject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.Login;
import Objects.Registracija;


public class LogInTest {

	public static void goToLogIn(WebDriver driver) {
		
	try {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uName=sc.nextLine();
		
		System.out.println("Enter password:");
		String passw=sc.nextLine();
	
	
	   //FILL LOGIN FORM
		//FILL USERNAME
		Login.getLogInUname(driver);
		Login.clickLogInUname(driver);
		Login.fillLogInUname(driver, uName);
		Thread.sleep(1000);
			
		//FILL PASSWORD
		Login.getLogInPassword(driver);
		Login.clickLogInPassword(driver);
		Login.fillLogInPassword(driver, passw);
		Thread.sleep(1000);
			
		//CLICK ON LOG IN BUTTON & TEST URL
		Login.clickTestLogInButton(driver);
		Thread.sleep(1000);
		
	
	}catch (Exception e) {
		e.printStackTrace();
		}
	

		}
	
		
	}



