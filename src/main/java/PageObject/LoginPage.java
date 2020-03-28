package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	
	By login=By.xpath("//span[contains(text(),'Login')]");
	By email= By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By submit=By.xpath("//input[@type='submit']");
	By Text=By.xpath("//div[@class='alert alert-danger']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public WebElement Login() {
		return driver.findElement(login);
	}
	
	public WebElement getemail() {
		return driver.findElement(email);
	}
	public WebElement getpass() {
		return driver.findElement(password);
	}
	public WebElement clickLoginButton() {
		
		return driver.findElement(submit);
	}
	
	public WebElement GetText() {
		return driver.findElement(Text);
	}

}
