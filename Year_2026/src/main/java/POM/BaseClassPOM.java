package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utility.Property_Utility;


public class BaseClassPOM {
	
	public BaseClassPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(name="user_name")
	private WebElement userNmae;
	
	@FindBy(name="user_password")
	private WebElement passWord;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	@FindBy(xpath="//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement logOutImg;

	@FindBy(xpath="//a[text()=\"Sign Out\"]")
	private WebElement LogOut;
	
	//Convert private to public
	public WebElement getUserNmae() {
		return userNmae;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getLogOutImg() {
		return logOutImg;
	}

	public WebElement getLogOut() {
		return LogOut;
	}
	
	//Call method
	
	public void LoginVTiger() throws IOException {
		Property_Utility pu=new Property_Utility();
		String user = pu.readPropertyData("User_Name");
		String pass= pu.readPropertyData("Password");
		userNmae.sendKeys(user);
		passWord.sendKeys(pass);
		submitButton.click();
		
	}
	
	public WebElement LogoutMouse() {
		WebElement img = logOutImg;
		return img;
	}
	public void LogoutVTiger() {
		LogOut.click();
	}
	

}
