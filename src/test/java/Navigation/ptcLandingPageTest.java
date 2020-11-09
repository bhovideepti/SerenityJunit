package Navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.PtcuHomeSteps;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;


@RunWith(SerenityRunner.class)
public class ptcLandingPageTest {
	
	@Managed
	WebDriver driver;
	
	@Steps
	PtcuHomeSteps usersteps;
	
	@Test
	public void userShouldexploreptcu() {
		
		driver.get("https://www.ptc.com/en/ptc-university");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		usersteps.verifyPTCUHomePage();
		
	}

}
