package Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class PtcuHomePage extends PageObject{
	
	public String getTitle() {
		
		String title = getDriver().getTitle();
		
		return title;
	}

	
	
	
}
