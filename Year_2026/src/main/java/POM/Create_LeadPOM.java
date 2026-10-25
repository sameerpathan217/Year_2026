package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Excel_Utility;
import Generic_Utility.WebDriver_Utility;

public class Create_LeadPOM {
	
	public Create_LeadPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()=\"Leads\"]")
	private WebElement lead_Btn;
	
	@FindBy(xpath="//img[@alt=\"Create Lead...\"]")
	private WebElement create_Lead;
	
	@FindBy(xpath="//select[@name=\"salutationtype\"]")
	private WebElement first_Nameinit;
	
	@FindBy(name="firstname")
	private WebElement first_Name;
	
	@FindBy(name="lastname")
	private WebElement last_Name;
	
	@FindBy(name="company")
	private WebElement company_Name;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
    private WebElement save_Btn;
	
	
	//Encapsulation
	public WebElement getLead_Btn() {
		return lead_Btn;
	}

	public WebElement getCreate_Lead() {
		return create_Lead;
	}

	public WebElement getFirst_Nameinit() {
		return first_Nameinit;
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getCompany_Name() {
		return company_Name;
	}

	public WebElement getSave_Btn() {
		return save_Btn;
	}
	
      public void LeadPage() {
    	  lead_Btn.click();
    	  create_Lead.click();
      }
      
      public void create_Lead() throws EncryptedDocumentException, IOException{
    	  WebDriver_Utility  wu=new WebDriver_Utility();
    	  WebElement init = first_Nameinit;
    	  wu.handle_Dropdown(1,init);
    	  
    	  Excel_Utility eu=new Excel_Utility();
    	  String fn = eu.readExcelData("Year_2026", 1, 1);
    	  String ln = eu.readExcelData("Year_2026", 2, 1);
    	  String cn = eu.readExcelData("Year_2026", 3, 1);


    	  first_Name.sendKeys(fn);
    	  last_Name.sendKeys(ln);
    	  company_Name.sendKeys(cn);
    	  save_Btn.click();
      }
}
