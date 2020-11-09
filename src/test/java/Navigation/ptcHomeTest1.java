package Navigation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)
public class ptcHomeTest1 {
	
	@Managed
	WebDriver driver;
	
	
	@Test
	public void userShouldexploreptcu() {
		
		driver.get("https://www.ptc.com/en/ptc-university");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//li[4]/a/span")).click();
		driver.findElement(By.xpath("//div[2]/div/ul/li/a/span")).click();
		
	}

}
