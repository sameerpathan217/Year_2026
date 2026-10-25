package Generic_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.BaseClassPOM;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
	BaseClassPOM  bcp=new BaseClassPOM (driver);

	@BeforeSuite
	public void BS() {
		System.out.println("Connect to DB");
	}
		@BeforeClass
		public void BC() throws IOException {
			System.out.println("Launch browser");
			driver=new ChromeDriver();
			Property_Utility pu=new Property_Utility();
	    	String URL = pu.readPropertyData("url");
			driver.get(URL);
			sdriver=driver;
			
		}
	    @BeforeMethod
		public void BM() throws InterruptedException, IOException {
	    	BaseClassPOM bcp=new BaseClassPOM(driver);
			System.out.println("Login to the application");
			
			bcp.LoginVTiger();
			
			
		}
	    @AfterMethod
       public void AM() throws InterruptedException {
	    	System.out.println("Logout from application");
	    	WebDriver_Utility wu=new WebDriver_Utility();
	    	wu.implicitWait(driver);
	    	BaseClassPOM  bcp=new BaseClassPOM (driver);
	    	WebElement data = bcp.LogoutMouse();
	    	wu.MouseHowerAction(driver, data);
	    	bcp.LogoutVTiger();
	    }
	    @AfterClass
	    public void AC() {
	    	System.out.println("Close the browser");
	    }
	    @AfterSuite
	    public void AS() {
	    	System.out.println("Close the DB");
	    }
}
