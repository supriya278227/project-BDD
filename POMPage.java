package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMPage {
	WebDriver driver;
	public POMPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	
	@FindBy(xpath=("//input[@type='search']"))
	public WebElement search;

	@FindBy(xpath=("//input[@class='gLFyf gsfi']"))
	public WebElement search1;
	
	@FindBy(xpath=("//h3[@class='LC20lb MBeuO DKV0Md']"))
	public WebElement search2;
	
	@FindBy(xpath=("//input[@type='hidden']"))
	public WebElement search3;

		
		
		

}

