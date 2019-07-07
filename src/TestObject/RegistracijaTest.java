package TestObject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Objects.Registracija;

public class RegistracijaTest {
	
	public static void goToRegistration(WebDriver driver)	{		
		
		try {
		//WE LET USER TO MANUALY INPUT DATA
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Name:");
			String fName=sc.nextLine();
			
			System.out.println("Enter Last Name:");
			String lName=sc.nextLine();
			
			System.out.println("Enter Username:");
			String uName=sc.nextLine();
			
			System.out.println("Enter Email:");
			String email=sc.nextLine();
			
			System.out.println("Enter Password:");
			String passw=sc.nextLine();
			
			
			//FILL REGISTER FORM		
			//FILL FIRST NAME
			Registracija.getFname(driver);
		    Registracija.clickFname(driver);
			Registracija.fillFname(driver, fName);
			Thread.sleep(1000);
			
			//FILL LAST NAME
			Registracija.getLname(driver);
		    Registracija.clickLname(driver);
			Registracija.fillLname(driver, lName);
			Thread.sleep(1000);
				
			//FILL USERNAME
			Registracija.getUname(driver);
			Registracija.clickUname(driver);
			Registracija.fillUname(driver, uName);
			Thread.sleep(1000);
					
			//FILL EMAIL
			Registracija.getEmail(driver);
			Registracija.clickEmail(driver);
			Registracija.fillEmail(driver, email);
			Thread.sleep(1000);	
			
			//FILL PASSWORD
			Registracija.getPassword(driver);
			Registracija.clickPassword(driver);
			Registracija.fillPassword(driver, passw);
			Thread.sleep(1000);
						
			//CLICK ON REGISTER BUTTON & TEST URL
			Registracija.clickTestRegisterButton(driver);
			Thread.sleep(1000);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
			
					}
	}


