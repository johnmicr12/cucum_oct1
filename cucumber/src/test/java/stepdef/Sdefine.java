package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browsers.Drivers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sdefine {
WebDriver driver;
@Given("Jhon purchse a microwave for {int} doll")
public void jhon_purchse_a_microwave_for_doll(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
 //   throw new cucumber.api.PendingException();
}

@Given("he has a recepit")
public void he_has_a_recepit() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("Jhon returened the faulty product")
public void jhon_returened_the_faulty_product() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}


@Given("App is up")
public void app_is_up() {

 
   

// Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("he got refund of {int} doll")
public void he_got_refund_of_doll(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("enter username and password")
public void enter_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();

}

@Then("he got refund of {int}")
public void he_got_refund_of(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}
@Given("Register")
public void appis_up() {
//System.setProperty("webdriver.chrome.driver", "C:\\new1\\chromedriver.exe");
    //driver=new ChromeDriver();
//driver.get("http://newtours.demoaut.com/");
driver=Drivers.drivers("chrome");
driver.get("http://newtours.demoaut.com");
driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demo");

driver.findElement(By.xpath("//input[@name='register']")).click();

    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}
}
