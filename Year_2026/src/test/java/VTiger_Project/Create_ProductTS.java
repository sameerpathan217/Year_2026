package VTiger_Project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
import POM.Create_ProductsPOM;

@Listeners(Generic_Utility.TakeScreenshot_Listener.class)
public class Create_ProductTS extends BaseClass{
	@Test
	public void create_Product() throws EncryptedDocumentException, IOException{
	   
		Create_ProductsPOM cpp=new Create_ProductsPOM(driver);
		cpp.productBtn();
		
		cpp.addProduct();
			
		
	}

}
