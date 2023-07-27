package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("Opne Chorme Browser")
	public void opne_chorme_browser() {
		driver=new ChromeDriver();
	    
	}

	@Given("Open URL {string}")
	public void open_url(String string) {
		driver.get("https://www.demo.guru99.com/v4");
	    
	}

	@When("Login ID Login Password")
	public void login_id_login_password() {
		driver.findElement(By.name("uid")).sendKeys("mngr514943");
		driver.findElement(By.name("password")).sendKeys("qUnatUn");
	    
	}

	@When("Click on Submit")
	public void click_on_submit() {
		driver.findElement(By.name("btnLogin")).click();
	    
	}

	@Then("Redirect to Bankpage")
	public void redirect_to_bankpage() {
		boolean Status= driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).isDisplayed();
		Assert.assertEquals(Status,true);
	}



}
