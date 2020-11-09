package Steps;

import Pages.PtcuHomePage;
import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class PtcuHomeSteps {
	
	PtcuHomePage ptcuPage;

	@Step("This step verify ptc Home Page")
	public void verifyPTCUHomePage() {
		Assert.assertTrue(ptcuPage.getTitle().contains("University"));
		}
	
	
}
