package herokuapp.pages;

import herokuapp.selenium.api.base.SeleniumBase;

public class DynamicLoadingPage extends SeleniumBase {
	public HomePage clickstart()
	{
		click(locateElement("link text","Example 1: Element on page that is hidden"));
		click(locateElement("link text","start"));
		return new HomePage();
	}

}
