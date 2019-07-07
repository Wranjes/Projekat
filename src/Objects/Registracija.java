package Objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registracija {
	public static final String URL = "http://localhost/izlet/index.php";
	public static final String FNAME = "//input[@name='firstname']";
	public static final String LNAME = "//input[@name='lastname']";
	public static final String UNAME = "//div[@class='register_form']//input[@name='username']";
	public static final String EMAIL = "//input[@name='email']";
	public static final String PASSW = "//div[@class='register_form']//input[@name='password']";
	public static final String REGISTBUTT = "//input[@id='blue_btn']";

	// FIRST NAME METHODS
				public static WebElement getFname(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(FNAME));
					return wb;
				}
				public static void clickFname(WebDriver driver) {
					getFname(driver).click();
				}
				public static void fillFname(WebDriver driver, String str) {
					getFname(driver).sendKeys(str);
				} 
		
		
		// LAST NAME METHODS
				public static WebElement getLname(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(LNAME));
					return wb;
				}
				public static void clickLname(WebDriver driver) {
					getLname(driver).click();
				}
				public static void fillLname(WebDriver driver, String str) {
					getLname(driver).sendKeys(str);
				}
				
				
		// USERNAME METHODS
				public static WebElement getUname(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(UNAME));
					return wb;
				}
				public static void clickUname(WebDriver driver) {
					getUname(driver).click();
				}
				public static void fillUname(WebDriver driver, String str) {
					getUname(driver).sendKeys(str);
				} 
		
		
		// EMAIL METHODS
				public static WebElement getEmail(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(EMAIL));
					return wb;
				}
				public static void clickEmail(WebDriver driver) {
					getEmail(driver).click();
				}
				public static void fillEmail(WebDriver driver, String str) {
					getEmail(driver).sendKeys(str);
				} 
				
				
		// PASSWORD METHODS
				public static WebElement getPassword(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(PASSW));
					return wb;
				}
				public static void clickPassword(WebDriver driver) {
					getPassword(driver).click();
				}
				public static void fillPassword(WebDriver driver, String str) {
					getPassword(driver).sendKeys(str);
				} 
				
				
		// REG-BUTTON METHODS
				public static WebElement getRbutton(WebDriver driver) {
					WebElement wb = driver.findElement(By.xpath(REGISTBUTT));
					return wb;
				}
				public static void clickTestRegisterButton(WebDriver driver) {
					getRbutton(driver).click();
					if(driver.getCurrentUrl().contains(Registracija.URL)) {
						System.out.println("Page URL after Register button is OK!");
						System.out.println();
						}
				}
				
		// NAVIGATE TO METHOD
				public static void navigateToHomePageURL(WebDriver driver) {
				
					driver.navigate().to(URL);
					
				
				}
		
	
}