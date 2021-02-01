package tests.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import tests.supers.TestBase;

public class AppiumTestExample extends TestBase {

	@Test
	public void test() {
		try {

			WebDriver driver = app.getDriver();
			log.info("Click Ok on the message 'this app..'");
			driver.findElement(By.id("android:id/button1")).click();

			log.info("Click on the white board");
			driver.findElement(By.id("com.thecrazyprogrammer.www.notepadapp:id/text")).click();

			log.info("Write text on the white board");
			driver.findElement(By.id("com.thecrazyprogrammer.www.notepadapp:id/text")).sendKeys("Hello world! By Alaa and Aisha.");

			log.info("Click Save");
			driver.findElement(By.id("com.thecrazyprogrammer.www.notepadapp:id/saveButton")).click();

			log.info("Click on message title");
			// "//android.widget.Button[@text='=']"
			driver.findElement(By.xpath("//android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.EditText"
)).click();

			log.info("Write title");
			driver.findElement(By.xpath("//android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.EditText"
					)).sendKeys("note");
			
			log.info("Click Save (for title)");
			driver.findElement(By.id("android:id/button1")).click();

			log.info("Get text");
			String result = driver.findElement(By.id("com.thecrazyprogrammer.www.notepadapp:id/text")).getText();
			log.info("Text is : " + result);

			endTestSuccess();
		} catch (Throwable t) {
			onTestFailure(t);
		}
	}
}
