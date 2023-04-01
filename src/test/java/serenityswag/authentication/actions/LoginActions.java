package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {

	@Step("Log in as as {0}")
	public void as(User user) {
//		driver.get("https://www.saucedemo.com/");
		openUrl("https://www.saucedemo.com");

		// login as a standard user
//		driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("[data-test='login-button']")).click();

//		find("[data-test='username']").sendKeys("standard_user");
//		find("[data-test='password']").sendKeys("secret_sauce");
//		find("[data-test='login-button']").click();

		$("[data-test='username']").sendKeys(user.getUsername());
		$("[data-test='password']").sendKeys(user.getPassword());
		$("[data-test='login-button']").click();
	}

}
