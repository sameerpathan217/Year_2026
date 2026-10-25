package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Excel_Utility;
import Generic_Utility.WebDriver_Utility;

public class Create_ContactPOM {
	
	public Create_ContactPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()=\"Contacts\"]")
	private WebElement contact_Btn;
	
	@FindBy(xpath="//img[@alt=\"Create Contact...\"]")
	private WebElement addContact_Btn;
	
	@FindBy(name="salutationtype")
	private WebElement nameInit_drpdown;
	
	@FindBy(name="firstname")
	private WebElement first_Name;
	
	@FindBy(name="lastname")
	private WebElement last_Name;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement save_Button;
	
	
	//
	public WebElement getContact_Btn() {
		return contact_Btn;
	}

	public WebElement getAddContact_Btn() {
		return addContact_Btn;
	}

	public WebElement getNameInit_drpdown() {
		return nameInit_drpdown;
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getSave_Button() {
		return save_Button;
	}
	
	public void Tap_ContactBtn() {
		contact_Btn.click();
		addContact_Btn.click();
	}
	
	public void create_Contact() throws EncryptedDocumentException, IOException {
		WebElement init = nameInit_drpdown;
		WebDriver_Utility  wu=new WebDriver_Utility();
		wu.handle_Dropdown(1, init);
		
		Excel_Utility eu=new Excel_Utility();
  	  String fn = eu.readExcelData("Year_2026", 1, 1);
  	  String ln = eu.readExcelData("Year_2026", 2, 1);
  	    first_Name.sendKeys(fn);
  	    last_Name.sendKeys(ln);
  	    save_Button.click();
  	
  	  
	}
}
