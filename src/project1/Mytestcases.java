package project1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {
	String website="https://www.saucedemo.com/";
	WebDriver driver=new EdgeDriver();
	String username="standard_user";
	String password="secret_sauce";
	String firstName="joud";
	String lastName="ahmad";
	String postalCode="1989";
	
	

	@BeforeTest
	public void mytest() {
		driver.get(website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	@Test(priority = 1)
public void Login() {
		
		WebElement UserNameField=driver.findElement(By.id("user-name"));
		UserNameField.sendKeys(username);
		WebElement PasswordField=driver.findElement(By.id("password"));
		PasswordField.sendKeys(password);
		WebElement LoginButton=driver.findElement(By.id("login-button"));
		LoginButton.click();
		
	}
	
	@Test(priority = 2)
	public void AddToCart() {
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		WebElement addToCartBackpackButton=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCartBackpackButton.click();
		
		
	}
	@Test(priority = 3)
	public void CheckOut() {
		
		driver.navigate().to("https://www.saucedemo.com/cart.html");
		WebElement checkOutbutton=driver.findElement(By.id("checkout"));
		checkOutbutton.click();
		WebElement FirstNameField=driver.findElement(By.id("first-name"));
		WebElement LastNameField=driver.findElement(By.id("last-name"));
		WebElement PostalCodeField=driver.findElement(By.id("postal-code"));
		FirstNameField.sendKeys(firstName);
		LastNameField.sendKeys(lastName);
		PostalCodeField.sendKeys(postalCode);
		WebElement continueButton=driver.findElement(By.id("continue"));
		continueButton.click();
		WebElement finishButton=driver.findElement(By.id("finish"));
		finishButton.click();
	}
	@AfterTest
public void aftertest() {
		
	}
		
		
}