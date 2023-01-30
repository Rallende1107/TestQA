package pruebaQA;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Pages.DemoQA;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;


public class DemoQA_Test {

	private WebDriver driver;
	DemoQA demoqa;
	
	@BeforeTest
	public void setUp() throws Exception {
		demoqa = new DemoQA(driver);
		driver = demoqa.chromeDriverConnection();
		demoqa.visit("https://demoqa.com/webtables");
		
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testCreate() throws InterruptedException {
		demoqa.Create_user();
		}
	
	@Test
	public void testSearch() throws InterruptedException {
		demoqa.Search_user();
		}

	@Test
	public void testUpdate() throws InterruptedException {
		demoqa.Update_user();
		}

	@Test
	public void testDelete() throws InterruptedException {
		demoqa.Delete_user();
		}

}
