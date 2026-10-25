package POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Excel_Utility;

public class Create_ProductsPOM {
	
	public Create_ProductsPOM(WebDriver driver) {
	  PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()=\"Products\"]")
	private WebElement tapProduct_Btn;
	
	@FindBy(xpath="//img[@alt=\"Create Product...\"]")
	private WebElement addProduct_Btn;
	
	@FindBy(name="productname")
	private WebElement product_Name;
	
	@FindBy(xpath="//input[@title=\"Save [Alt+S]\"]")
	private WebElement save_Btn;
	
	//
	public WebElement getTapProduct_Btn() {
		return tapProduct_Btn;
	}

	public WebElement getAddProduct_Btn() {
		return addProduct_Btn;
	}

	public WebElement getProduct_Name() {
		return product_Name;
	}

	public WebElement getSave_Btn() {
		return save_Btn;
	}
	
	public void productBtn() {
		tapProduct_Btn.click();
		addProduct_Btn.click();
		
	}
    public void addProduct() throws EncryptedDocumentException, IOException {
    	
    	Excel_Utility eu=new Excel_Utility();
    	String name = eu.readExcelData("Year_2026",4,1);
    	product_Name.sendKeys(name);
    	save_Btn.click();
    		
    }
}
