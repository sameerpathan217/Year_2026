package VTiger_Project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utility.BaseClass;
import POM.Add_OrganizationsPOM;

@Listeners(Generic_Utility.TakeScreenshot_Listener.class)
public class Create_OrganizationTS extends BaseClass {

	@Test
	public void Create_Organizations() throws EncryptedDocumentException, IOException{
		Add_OrganizationsPOM aop=new Add_OrganizationsPOM(driver);
		aop.Click_OrgBtn();
		aop.add_OrgName();
		
	}
}
