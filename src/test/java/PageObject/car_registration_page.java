package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Driver_Manager;

public class car_registration_page {

	WebDriver driver;

	public car_registration_page() {
		this.driver = Driver_Manager.driver;
	}

	By start_now_button = By.id("get-started");
	By Reg_textfield = By.id("Vrm");
	By Continue_button = By.name("Continue");
	By Reg_Number = By.cssSelector(".reg-mark");

	public void launch_browser() {
		driver.get("https://www.gov.uk/get-vehicle-information-from-dvla");
	}

	public void Click_start_now_button() {
		WebElement Start_now = driver.findElement(start_now_button);
		Start_now.click();
	}

	public void enter_car_reg(String value) {
		WebElement registration_textfield = driver.findElement(Reg_textfield);
		registration_textfield.sendKeys(value);
	}

	public void click_continue_button() {
		WebElement Continue = driver.findElement(Continue_button);
		Continue.click();
	}

	public void confirm_car_reg(String text) {
		String Actual_title = driver.findElement(Reg_Number).getText();
		String Expected_title = text;
		Assert.assertEquals(Actual_title, Expected_title);

	}
}
