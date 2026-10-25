package VTiger_Project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import POM.Create_ContactPOM;
@Listeners(Generic_Utility.TakeScreenshot_Listener.class)
public class Create_ContactTS extends BaseClass {
	@Test
	public void addContactDetails() throws EncryptedDocumentException, IOException {
		Create_ContactPOM ccp=new Create_ContactPOM(driver);
		
		ccp.Tap_ContactBtn();
		ccp.create_Contact();
	}

}
