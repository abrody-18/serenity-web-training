package serenityswag.authentication;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.authentication.actions.User;
import serenityswag.inventory.InventoryPage;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn {

	@Managed
	WebDriver driver;

	@Steps
	LoginActions login;

	InventoryPage inventoryPage;

	@Test
	public void usersCanLogOnViaTheHomePage() {

		login.as(User.STANDARD_USER);
		
		// SHould see product catalog
		Serenity.reportThat("The inveitnory page should be displayed with the corect title", 
				() -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products"));

		// should see product catalog
//		assertThat(driver.findElement(By.cssSelector(".title")).getText()).isEqualToIgnoringCase("Products");

		
	}

}
