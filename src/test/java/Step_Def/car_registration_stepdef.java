package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.car_registration_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class car_registration_stepdef {
	WebDriver driver;
	car_registration_page reg_steps = new car_registration_page();
	
	@Given("^am on the \"([^\"]*)\"$")
	public void am_on_the(String arg1) throws Throwable {
	    reg_steps.launch_browser();
	}

	@Given("^I click \"([^\"]*)\"$")
	public void i_click(String button) throws Throwable {
		if(button.equals("Start button")){
			reg_steps.Click_start_now_button();
		}
		else if (button.equals("Continue button")){
			reg_steps.click_continue_button();
		}
	}

	@When("^I Enter car \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_Enter_car_as(String reg_number, String value) throws Throwable {
		if(reg_number.equals("registration number")){
			reg_steps.enter_car_reg(value);
		}
	}

	@Then("^\"([^\"]*)\" is displayed as \"([^\"]*)\"$")
	public void is_displayed_as(String arg1, String arg2) throws Throwable {
	    
	}

}
