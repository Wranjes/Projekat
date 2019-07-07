package Objects;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	public static final String GoToPOST = "//a[contains(text(),'Make a post')]";
	public static final String PostWINDOWPAGE = "http://localhost/izlet/dashboard.php#";
	public static final String PostNAME = "//input[@placeholder='Naziv']";
	public static final String PostLOCATION = "//input[@placeholder='Lokacija']";
	public static final String PostBROWSE = "//label[contains(text(),'Browse...')]";
	public static final String PostTRANSPORT = "//div[@class='popupPost']//select[@name='transport']";
	public static final String PostTEXTAREA = "//textarea[@placeholder='Opis']";
	public static final String PostBUTTON = "//div[@class='popupPost']//input[@name='postSubmit']";
	
	public static final String Post3DOTS = "fa-ellipsis-v";
	public static final String PostDELETE = "fa-trash-alt";
	
		
	// GO TO POST METHODS & URL TEST
	public static WebElement getGoToPostButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(GoToPOST));
		return wb;
	}
	public static void clickTestGoToPostButton(WebDriver driver) {
		getGoToPostButton(driver).click();
		if(driver.getCurrentUrl().contains(Post.PostWINDOWPAGE)) {
			System.out.println("Page URL after GoToPOST button is OK!");
			System.out.println();
			}
	}
		
		// POST NAME METHODS
	public static WebElement getPostName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PostNAME));
		return wb;
		}
	public static void clickPostName(WebDriver driver) {
		getPostName(driver).click();
		}
	public static void fillPostName(WebDriver driver, String str) {
		getPostName(driver).sendKeys(str);
		} 
		
	
	// POST LOCATION METHODS
		public static WebElement getPostLocation(WebDriver driver) {
			WebElement wb = driver.findElement(By.xpath(PostLOCATION));
			return wb;
			}
		public static void clickPostLocation(WebDriver driver) {
			getPostLocation(driver).click();
			}
		public static void fillPostLocation(WebDriver driver, String str) {
			getPostLocation(driver).sendKeys(str);
			} 	
		
			//SELECT TRANSPORT METHOD
		public static void selectPostTransport(WebDriver driver) {
		Select transport =new Select(driver.findElement(By.name("transport")));
		transport.selectByVisibleText("Car");
			}
		
		// POST TEXTAREA METHODS
				public static WebElement getPostTextarea(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(PostTEXTAREA));
					return wb;
					}
				public static void clickPostTextarea(WebDriver driver) {
					getPostTextarea(driver).click();
					}
				public static void fillPostTextarea(WebDriver driver, String str) {
					getPostTextarea(driver).sendKeys(str);
					} 
		
		//POST METHODS & URL TEST
				public static WebElement getPostButton(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(PostBUTTON));
					return wb;
				}
				public static void clickPostButton(WebDriver driver) {
					getPostButton(driver).click();
					if(driver.getCurrentUrl().contains(Login.DASH_URL)) {
						System.out.println("Page URL after Post button is OK!");
						System.out.println();
						}
				}
				
		//DELETE POST
				public static void click3DotsButton(WebDriver driver) {
					List<WebElement> lst = driver.findElements(By.className(Post3DOTS));
					lst.get(0).click();
				}
				public static void clickDelPostButton(WebDriver driver) {
					List<WebElement> lst =  driver.findElements(By.className(Post3DOTS));
					lst.get(0).click();
					}
				}
			

	

