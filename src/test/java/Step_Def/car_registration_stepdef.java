package Step_Def;

import org.openqa.selenium.WebDriver;

import PageObject.car_registration_page;
import Utility.Driver_Manager;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class car_registration_stepdef {
	
	car_registration_page reg_steps = new car_registration_page();
	Driver_Manager set_driver = new Driver_Manager();

	@Before
	public void start_session() {
		set_driver.use_driver("firefox");
		set_driver.browser_setting();
	}

	@Given("^am on the \"([^\"]*)\"$")
	public void am_on_the(String arg1) throws Throwable {
		reg_steps.launch_browser();
	}

	@Given("^I click \"([^\"]*)\"$")
	public void i_click(String button) throws Throwable {
		
		if (button.equals("Start_button")) {
			reg_steps.Click_start_now_button();
			
		} else if (button.equals("Continue_button")) {
			reg_steps.click_continue_button();
		}
	}

	@When("^I Enter car \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_Enter_car_as(String reg_number, String value) throws Throwable {
		if (reg_number.equals("registration number")) {
			reg_steps.enter_car_reg(value);
		}
	}

	@Then("^\"([^\"]*)\" is displayed as \"([^\"]*)\"$")
	public void is_displayed_as(String confirm_reg_number, String text) throws Throwable {
		if (confirm_reg_number.equals("Registration_number")) {
			reg_steps.confirm_car_reg(text);
		}
	}

	@After
	public void end_session() {
		set_driver.close_browser();

	}

}
