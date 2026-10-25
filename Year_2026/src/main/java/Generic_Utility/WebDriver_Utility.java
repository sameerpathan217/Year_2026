package Generic_Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	
	public void MouseHowerAction(WebDriver driver,WebElement element ) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void handle_Dropdown(int index,WebElement element) {
		Select sat=new Select(element);
		sat.selectByIndex(index);
	}
}
