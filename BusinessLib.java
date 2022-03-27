package automation;

import org.openqa.selenium.WebDriver;

public class BusinessLib {
	WebDriver driver;
	public POMPage r;
	public BusinessLib(WebDriver driver) {
		r= new POMPage(driver);
		
	}
	
	
	public String Cucumber() {
		try {
			r.search.sendKeys("Test Automation Learning");
			r.search1.sendKeys("Udemy course");
			r.search2.click();
			r.search3.sendKeys("BDD with Cucumber");
			return"true";
		}catch(Exception e) {
			return"false";
			
		}
	}

}
