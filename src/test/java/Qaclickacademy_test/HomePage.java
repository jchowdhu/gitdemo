package Qaclickacademy_test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Qaclickacademy.Maven_Test_Practice.BaseClass;

//E2EPROJECT>mvn eclipse:eclipse
public class HomePage extends BaseClass {
	@BeforeTest
	public void intialize() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "get")
	public void HomePage(String username, String password) throws IOException {

		driver.get(prop.getProperty("url"));

		LoginPage Lp = new LoginPage(driver);

		Lp.Login().click();
		Lp.getemail().sendKeys(username);
		Lp.getpass().sendKeys(password);
		Lp.clickLoginButton().click();

		String text = Lp.GetText().getText();
		System.out.println(text);

	}

	
	
	  @AfterTest 
	  public void Teardown() { 
		  driver.close(); 
		  driver= null;
		  }
	 
	@DataProvider
	public Object[][] get() {

		Object[][] data = new Object[3][2];

		data[0][0] = "krish1@gmail.com";
		data[0][1] = "1234";

		data[1][0] = "krish2@gmail.com";
		data[1][1] = "456";

		data[2][0] = "krish3@gmail.com";
		data[2][1] = "489";
		return data;

	}

}
