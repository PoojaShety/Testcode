package herokuapp.pages;

import herokuapp.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	
		
		public Dropdownpage selectdropdown()
		{
		click(locateElement("link text","Dropdown"));
		return new Dropdownpage();
		
		}
		public DynamicLoadingPage dynamicLoad()
		{
			click(locateElement("link text","Dynamic Loading"));
			return new DynamicLoadingPage();
		}
		
		public EntryAdPage loadEntryAd()
		{
			click(locateElement("link text","Entry Ad"));
			return new EntryAdPage();
			
		}

	}


