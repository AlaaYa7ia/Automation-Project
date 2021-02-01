package tests.basic;

import org.testng.annotations.Test;

import tests.supers.TestBase;

public class ShoppingEndToEnd extends TestBase {

	@Test
	public void test() {
		try {


			app.getDriver().get("http://automationpractice.com/index.php/");

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}
