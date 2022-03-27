package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class Baseclass {
	
public static WebDriver driver;
	
	@BeforeSuite
	public void TC1() {
		System.out.println("Before Suite");
		Properties prop=new Properties();
		String fileName="C:\\Users\\Bahubali\\eclipse-workspace\\javaproject\\automation\\src\\automation\\chromedriver.exe";
				try(FileInputStream file=new FileInputStream(fileName)){
					prop.load(file);
				}catch(FileNotFoundException e) {
					
				}catch(IOException e) {
				}
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("app.version"));
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bahubali\\eclipse-workspace\\javaproject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}				
				
				

	@BeforeTest
	public void TC2() {
		System.out.println("BeforeTest");
	}
	
	
	

}
