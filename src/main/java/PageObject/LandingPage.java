package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By Text= By.xpath("//div[@class='container']//div[@class='text-center']");
	
	By Login=By.cssSelector("a[href*='sign_in']");
	By Link=By.linkText("CONTACT");
	By Text1=By.xpath("//a[@class='btn btn-primary']");
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	
	}

	public WebElement Text() {
		return driver.findElement(Text);
	}
	public WebElement signin() {
		return driver.findElement(Login);
	}
	public WebElement Getnavigation() {
		return driver.findElement(Link);
	}
	public WebElement VerifyText() {
		return driver.findElement(Text1 );
	}
}
