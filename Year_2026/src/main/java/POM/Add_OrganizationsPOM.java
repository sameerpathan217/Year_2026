package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Excel_Utility;
import Generic_Utility.Java_Utility;

public class Add_OrganizationsPOM {
	
	 public Add_OrganizationsPOM(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath="//a[text()=\"Organizations\"]")
	 private WebElement tap_OrgBtn;
	 
	 @FindBy(xpath="//img[@alt=\"Create Organization...\"]")
	 private WebElement plus_OrgBtn;
	 
	 @FindBy(name="accountname")
	 private WebElement org_Name;
	 
	 @FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	 private WebElement save_Btn;
	 
	 //
	 public WebElement getTap_OrgBtn() {
			return tap_OrgBtn;
		}

		public WebElement getPlus_OrgBtn() {
			return plus_OrgBtn;
		}

		public WebElement getOrg_Name() {
			return org_Name;
		}

		public WebElement getSave_Btn() {
			return save_Btn;
		}

		
		public void Click_OrgBtn() {
			tap_OrgBtn.click();
			plus_OrgBtn.click();	
		}
		
		public void add_OrgName() throws EncryptedDocumentException, IOException {
			Excel_Utility eu=new Excel_Utility();
			Java_Utility ju=new Java_Utility();
			int num=ju.add_Randomnum();
			String data = eu.readExcelData("Year_2026", 5,1)+num;
			org_Name.sendKeys(data);
			save_Btn.click();
			
		}
	 

}
