package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import app.getxray.xray.testng.annotations.XrayTest;
import example.example.factory.PageinstancesFactory;
import example.example.pages.GooglePage;

/**
 * The Class GoogleSearchTest.
 *
 * @author Bharathish
 */
@Test(testName = "Google search test", description = "Test description")
@XrayTest(key = "TAIS-20")
public class GoogleSearchTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	@XrayTest(key = "TAIS-20")	
	public void googleSearchTest() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	}
}
