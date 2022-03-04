package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSignUp {
     WebDriver driver;
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    System.setProperty("webdriver.chrome.driver","D:\\\\chrome Driver\\\\chromedriver_win32 (4)\\\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/signup");
	}

	@When("Enter first name and surname")
	public void enter_first_name_and_surname() {
	    driver.findElement(By.name("firstname")).sendKeys("mayur");
	    driver.findElement(By.name("lastname")).sendKeys("gudsurkar");
	    
	}
	@When("Enter mobile number")
	public void enter_mobile_number() {
		 driver.findElement(By.name("reg_email__")).sendKeys("9421337858");
	}
	@When("Enter new password")
	public void enter_new_password() {
	 driver.findElement(By.name("reg_passwd__")).sendKeys("11234567890");
	}
	@When("Select birth date")
	public void select_birth_date() {
	  WebElement wb1 = driver.findElement(By.id("day"));
	  Select sel = new Select(wb1);
	  sel.selectByVisibleText("27");
	  
	  WebElement wb2 = driver.findElement(By.id("month"));
	  Select sel2 = new Select(wb2);
	  sel2.selectByVisibleText("August");
	  
	  WebElement wb3 = driver.findElement(By.id("year"));
	  Select sel3 = new Select(wb3);
	  sel3.selectByVisibleText("1996");
	}
	
	
	@Then("Click on signup")
	public void click_on_signup() {
	    driver.findElement(By.name("websumit")).click();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
