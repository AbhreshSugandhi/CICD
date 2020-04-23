package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class Parametrization extends BrowserClass {

	@Parameters("BrowserName")
	@Test(priority = 0)
	public void InitiateBrowser(String Browser) {
		OpenBrowser(Browser);
		
	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://github.com");
	}


	@Test(priority = 4)
	public void QuitBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
