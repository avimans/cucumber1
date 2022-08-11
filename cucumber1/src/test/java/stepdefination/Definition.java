package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {

	WebDriver driver;
	
	@Given("open browser and go to login page of orangehrm")
	public void open_browser_and_go_to_login_page_of_orangehrm() {
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");

	}
//	@When("enter the valid username")
//	public void enter_the_valid_username() {
//		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//	}
//	@When("enter the valid password")
//	public void enter_the_valid_password() {
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	}
//	@When("click on the login button")
//	public void click_on_the_login_button() {
//		driver.findElement(By.id("btnLogin")).click();
//	}
//	@Then("login should be sucessfull")
//	public void login_should_be_sucessfull() {
//	    String expected = driver.findElement(By.id("welcome")).getText();
//	    String actual ="Welcome 1355";
//	    Assert.assertEquals(expected,actual);
//	    driver.close();
	
	@When("enter the valid username {string}")
	public void enter_the_valid_username(String username) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	    
	}
	@When("enter the valid password {string}")
	public void enter_the_valid_password(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("btnLogin")).click();   
	}
	@Then("i should see {string}")
	public void i_should_see(String username) {
		String Expectedresult = driver.findElement(By.id("welcome")).getText();
		String Actualresult = username;
		Assert.assertEquals(Expectedresult,Actualresult);
	}


	

	
	@When("enter the invalid username {string}")
	public void enter_the_invalid_username(String username) {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	}
	@When("enter the invalid password {string}")
	public void enter_the_invalid_password(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	

	@When("click on the login buttonn")
	public void click_on_the_login_buttonn() {
		driver.findElement(By.id("btnLogin")).click();   
	}



	@Then("login should see {string}")
	public void login_should_see(String errormessage)
	{
	String Expecteddata=driver.findElement(By.id("spanMessage")).getText();
	String actual= errormessage;
	Assert.assertEquals(Expecteddata,actual);
	}




}
