package Qaclickacademy_test;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Qaclickacademy.Maven_Test_Practice.BaseClass;

public class ValidateTest extends BaseClass {
	
	@BeforeMethod
	public void Initialize() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	
		
	}

	@Test()
	public void ValidateTest() throws IOException, InterruptedException {

		
		LandingPage LI = new LandingPage(driver);
		System.out.println(LI.Text().getText());

		Assert.assertEquals(LI.Text().getText(), "FEATURED COURSES");
		Assert.assertTrue(LI.Getnavigation().isDisplayed());
		System.out.println(LI.Getnavigation().isDisplayed());
		System.out.println("this is my gtihub demo");
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		driver= null;
	}

}
