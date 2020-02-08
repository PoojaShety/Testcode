package herokuapp.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import herokuapp.pages.HomePage;
import herokuapp.testng.api.base.ProjectSpecificMethods;




	public class TC001 extends ProjectSpecificMethods{
	
	  @BeforeTest public void setData() { 
	  excelFileName="TC001";
	  testcaseName="Dynamic Load"; 
	  testcaseDec ="Dynamic Load Activity"; 
	  author="Pooja"; 
	  category="smoke";
	  
	  }
	 
		
		@Test
		public void runTC001() {
			new HomePage()
		.dynamicLoad()
		.clickstart();
		
		
		}

	}


