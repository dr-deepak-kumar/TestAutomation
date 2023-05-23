package example.example.tests;
import org.testng.ITestResult;
import org.testng.Reporter;
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
@Test(testName = "Google search test", description = "Test description1")
public class GoogleSearchTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	@XrayTest(labels="test1")
	public void googleSearchTest() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	    ITestResult result = Reporter.getCurrentTestResult();
		
	}
	@Test
	@XrayTest(key="TAIS-25",labels="test1")
	public void googleSearchTest1() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	    ITestResult result = Reporter.getCurrentTestResult();
	    result.setAttribute("test", "TAIS-25");
	    result.setAttribute("labels", "core addition")
		
	}
	@Test
	@XrayTest(labels="test2")
	public void googleSearchTest3() {
		
	}
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	    ITestResult result = Reporter.getCurrentTestResult();
	
}
