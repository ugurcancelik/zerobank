package com.zerobank.step_definitions;

import com.zerobank.pages.DashBoardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class LoginStepDefs {

    LoginPage loginPage=new LoginPage();

    @Given("user in the login page")
    public void user_in_the_login_page() {
       loginPage.openPage();
    }

    @When("user logs in as username {string} and as password {string} as valid credentials")
    public void user_logs_in_as_username_and_as_password_as_valid_credentials(String username, String password) {
       loginPage.login(username,password);
    }



    @Then("user should be on {string} page")
    public void user_should_be_on_page(String title) {
        loginPage.verifyTitle(title);
        System.out.println(Driver.get().getTitle());

    }

    @When("user logs in as username {string} and as password {string} as invalid credentials")
    public void user_logs_in_as_username_and_as_password_as_invalid_credentials(String WrongUser, String WrongPass) {
        loginPage.login(WrongUser,WrongPass);
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
       loginPage.WrongAccount();
    }

    @Then("users get error message")
    public void users_get_error_message() {
        loginPage.ErrorMessage();
    }

    @When("user click {string} page")
    public void user_click_page(String moduleName) {

        for (WebElement option:new DashBoardPage().modules) {

            if(option.getText().equals(moduleName)){
                option.click();

            break;
            }
        }


    }


}
