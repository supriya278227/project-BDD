package automation;

import org.testng.Assert;
import org.testng.annotations.Test;


	 public class Testlayer extends Baseclass {
			public BusinessLib bl;
			@Test(priority = 1) 
			public void Cucumber(){
			 if(bl.Cucumber().equalsIgnoreCase("false")){
				 Assert.assertEquals(true,false);
	}

			 
		}
			}
	
	


