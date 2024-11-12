package Stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orange_hrm.OrangeHrm_PF;


public class organe_hrm_SD {
	
	 WebDriver driver;
	 OrangeHrm_PF myinfo;	


	@Given("user is login to Orange HRM application with {string} and {string}")
	public void user_is_login_to_orange_hrm_application_with_and(String Username, String Pwd) {
		myinfo=new OrangeHrm_PF(driver);
		myinfo.login();
	   
	}

	@When("user navigates to contact details page in Orange HRM application")
	public void user_navigates_to_contact_details_page_in_orange_hrm_application() {
		myinfo.contactdetails();
	    
	}

	@When("user enters Street {int} details in street {int} field under Adress section in Orange HRM application")
	public void user_enters_street_details_in_street_field_under_adress_section_in_orange_hrm_application(Integer street1, Integer instreet1t2) {
	   myinfo.street1();
       myinfo.street2();
	}

	@When("user enters City details in City field under Adress section in Orange HRM application")
	public void user_enters_city_details_in_city_field_under_adress_section_in_orange_hrm_application() {
		myinfo.city();
	
	  
	}

	@When("user enters Zip\\/Postal Code details in Zip\\/Postal Code field under Adress section in Orange HRM application")
	public void user_enters_zip_postal_code_details_in_zip_postal_code_field_under_adress_section_in_orange_hrm_application() {
	 myinfo.PostalCode();
	}

	@When("user enters Mobile details in Mobile field under Telephone section in Orange HRM application")
	public void user_enters_mobile_details_in_mobile_field_under_telephone_section_in_orange_hrm_application() {
	   myinfo.mobile();
	}

	@When("user clicks the save button")
	public void user_clicks_the_save_button() {
		myinfo.save();
	}

	@Then("successfully updated message should be displayed")
	public void successfully_updated_message_should_be_displayed() {
	   
	}



}
