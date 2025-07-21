package stepDefination;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpagespageobjectmodel.loginPage;
import BaseP.BaseC;
import GenericMethodP.GenericMethodC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginStepDefination extends loginPage {

	@Given("user should be on login page")
	public static void user_should_be_on_login_page() throws IOException {
		browserInitzation(browser, url);
		ExtentCucumberAdapter.addTestStepLog("browser launch");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

//single entry------------------------------------------------
	@When("user enter valid username {string}")
	public static void user_enter_valid_username(String username) throws IOException {
		Enter_email(username, loginPage.EMailInput);
		ExtentCucumberAdapter.addTestStepLog("email enterd");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user enter valid password {string}")
	public static void user_enter_valid_password(String password) throws IOException {
		Enter_password(password, EMailpassword);
		ExtentCucumberAdapter.addTestStepLog("password entered");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("clicks on submitbutton")
	public static void clicks_on_submit_button() throws IOException {
		Button_login();
		ExtentCucumberAdapter.addTestStepLog("submitted");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("close the browser")
	public static void close_the_browser() throws IOException, InterruptedException {
		BaseC.browser_close();
		ExtentCucumberAdapter.addTestStepLog("browser close");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	
	
	
	//-------------------------------------------------------------------------------->
	// multiple entry---------------------------------------------->
	


	@When("^user enter valid username1 \"([^\"]*)\"$")
	public static void user_enter_valid_username1(String username) {
		Enter_email(username, loginPage.EMailInput);
	}

	@And("^user enter valid password1 \"([^\"]*)\"$")
	public static void user_enter_valid_password1(String password) {
		Enter_password(password, EMailpassword);
	}
	


}
