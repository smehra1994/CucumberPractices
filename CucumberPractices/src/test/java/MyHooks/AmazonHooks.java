package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void steup_app() {
		System.out.println("Amazon Application Launched");
	}

	@Before(order=1)
	public void steup_url(Scenario sc) {
		System.out.println("Amazon URL Launched");
		System.out.println(sc.getName());
	}

	@After
	public void Logout() {
		System.out.println("Browser logged out");
	}

	@After
	public void tearDown() {
		System.out.println("Browser closed");
	}
	
	@BeforeStep
	public void screenshot_before() {
		System.out.println("Screenshot taken");
	}
	
	@AfterStep
	public void screenshot_after() {
		System.out.println("Screenshot taken");
	}
	
}
