package herokuapp.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import herokuapp.selenium.api.base.SeleniumBase;
import utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "http://the-internet.herokuapp.com/");
	node = test.createNode(testcaseName);
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }
  
  
  
  
  
  
  
  
  
  
  
  

}

