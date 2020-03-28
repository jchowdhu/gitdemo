package Qaclickacademy_test;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Qaclickacademy.Maven_Test_Practice.BaseClass;

public class ValidateTitleTest extends BaseClass {

	@BeforeMethod
	public void Initialize() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));	
	}

	@Test()
	public void ValidateTitleTest() throws IOException, InterruptedException {

		

		LandingPage LI = new LandingPage(driver);

		System.out.println(LI.VerifyText().getText());
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		driver=null;
	}

}
