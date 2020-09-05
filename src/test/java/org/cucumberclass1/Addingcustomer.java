package org.cucumberclass1;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addingcustomer {
	static WebDriver driver;

@Given("launch the browser")
public void launch_the_browser() {
   System.setProperty("webdriver.chrome.driver", "D:\\35340\\cucumber\\frameworkcucumber\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
   driver.get("http://demo.guru99.com/telecom/index.html");
}

@Given("user clicks on add customer")
public void user_clicks_on_add_customer() {
	driver.findElement(By.className("Add Customer for the git")).click();
   
}

@When("User filling all details")
public void user_filling_all_details() {
	driver.findElement(By.xpath("//label[@for='donee']")).click();
	driver.findElement(By.id("fname")).sendKeys("sridhar");
	driver.findElement(By.id("lname")).sendKeys("deiva");
	driver.findElement(By.id("email")).sendKeys("sridhar@gmail.com");
    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("chennai");
    driver.findElement(By.id("telephoneno")).sendKeys("9567019394");
}

@When("user clicks on submit button")
public void user_clicks_on_submit_button() {
	driver.findElement(By.name("submit")).click();
   
}

@Then("verify the customerid")
public void verify_the_customerid() {
	Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	
   
}



}
