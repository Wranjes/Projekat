package Objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Login {

	
	public static final String LOGINUNAME = "//input[@placeholder='username']";
	public static final String LOGINPASSW = "//input[@placeholder='password']";
	public static final String LOGINBUTT = "//input[@name='login']";
	public static final String DASH_URL="http://localhost/izlet/dashboard.php";
	
	// LOG IN USERNAME METHODS
	public static WebElement getLogInUname(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGINUNAME));
		return wb;
	}
	public static void clickLogInUname(WebDriver driver) {
		getLogInUname(driver).click();
	}
	public static void fillLogInUname(WebDriver driver, String str) {
		getLogInUname(driver).sendKeys(str);
	} 
	
	// LOG IN PASSWORD METHODS
	public static WebElement getLogInPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGINPASSW));
		return wb;
	}
	public static void clickLogInPassword(WebDriver driver) {
		getLogInPassword(driver).click();
	}
	public static void fillLogInPassword(WebDriver driver, String str) {
		getLogInPassword(driver).sendKeys(str);
	} 
	
	// LOG IN BUTTON METHODS & URL TEST
	public static WebElement getLogInButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGINBUTT));
		return wb;
	}
	public static void clickTestLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
		if(driver.getCurrentUrl().contains(Login.DASH_URL)) {
			System.out.println("Page URL after Log In button is OK!");
			System.out.println();
						}
		
		
		Registracija.navigateToHomePageURL(driver);
		
		
		}
	
	// NAVIGATE TO METHOD
	public static void navigateToDashboardURL(WebDriver driver) {
	
		driver.navigate().to(DASH_URL);
		
	
	}

	
	
	
	

}
