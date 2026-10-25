package VTiger_Project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import POM.Create_LeadPOM;

@Listeners(Generic_Utility.TakeScreenshot_Listener.class)
public class Create_Lead extends BaseClass{
	
	@Test
	public void crate_LeadData() throws EncryptedDocumentException, IOException {
	Create_LeadPOM clp=new Create_LeadPOM(driver);
	clp.LeadPage();
	clp.create_Lead();

	}	
}
