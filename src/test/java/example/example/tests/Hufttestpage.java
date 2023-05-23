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
public class Hufttestpage extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	@XrayTest(labels="test1")
	public void huftSearchTest() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	    ITestResult result = Reporter.getCurrentTestResult();
		
	}
	@Test
	@XrayTest(labels="test1")
	public void huftSearchTest1() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	    ITestResult result = Reporter.getCurrentTestResult();
		
	}
	@Test
	@XrayTest(labels="test2")
	public void huftSearchTest3() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageinstancesFactory.getInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	    ITestResult result = Reporter.getCurrentTestResult();
	
}
