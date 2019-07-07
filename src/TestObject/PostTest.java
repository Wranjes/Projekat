package TestObject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import Objects.Post;
import Objects.Registracija;

public class PostTest {
	
public static void setPost(WebDriver driver)	{		
		
		try {
		
	   //GO TO SET POST PAGE & TEST URL
			Post.clickTestGoToPostButton(driver);
			Thread.sleep(1000);
									
		//WE LET USER TO MANUALY INPUT DATA
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Post Name:");
			String postName=sc.nextLine();
			
			System.out.println("Enter Location:");
			String postLocation=sc.nextLine();
			
			System.out.println("Enter description:");
			String textarea=sc.nextLine();
				
			//FILL POST		
			//FILL POST NAME
			Post.getPostName(driver);
		    Post.clickPostName(driver);
			Post.fillPostName(driver, postName);
			Thread.sleep(1000);
			
			//FILL POST LOCATION
			Post.getPostLocation(driver);
		    Post.clickPostLocation(driver);
			Post.fillPostLocation(driver, postLocation);
			Thread.sleep(1000);
							
			
			//SELECT TRANSPORT METHOD
			Post.selectPostTransport(driver);
			
			//ENTER DESCRIPTION
			Post.getPostTextarea(driver);
		    Post.clickPostTextarea(driver);
			Post.fillPostTextarea(driver, textarea);
			Thread.sleep(1000);
			
			//CLIC ON POST BUTTON & URL TEST
			Post.clickPostButton(driver);
			Thread.sleep(1000);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			}
			
					}
	
	

}
