package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PayBillsStepDefs {


    @When("user should be write {int} on amount")
    public void user_should_be_write_on_amount(Integer money) {
        String amount=""+money;
       // String a=String.valueOf(money);
       // String b=money.toString();
        new PayBillsPage().amount.sendKeys(amount);
    }

    @When("user should be select date")
    public void user_should_be_select_date() {
        new PayBillsPage().date.click();
        for (WebElement date:new PayBillsPage().dates) {
            if(date.getText().equals("15")){
                date.click();
                break;
            }
        }
    }

    @Then("user should see succesful message")
    public void user_should_see_succesful_message() {
        new PayBillsPage().payButton.click();
        String expected="The payment was successfully submitted.";
        Assert.assertEquals(expected,new PayBillsPage().actualSuccessMessage());
    }

    @When("user click pay button")
    public void user_click_pay_button() {
        new PayBillsPage().payButton.click();
    }

    @Then("user take warning message")
    public void user_take_warning_message() {
        String expected="Please fill out this field.";
        Assert.assertEquals(expected,new PayBillsPage().WarningMessage());
    }

    @When("user enters alphabetical character on amount field")
    public void user_enters_alphabetical_character_on_amount_field() {
        new PayBillsPage().amount.sendKeys("ugur");
        new PayBillsPage().date.click();
        for (WebElement date:new PayBillsPage().dates) {
            if(date.getText().equals("15")){
                date.click();
                break;
            }
        }
        new PayBillsPage().payButton.click();
    }

    @Then("system should give error message")
    public void system_should_give_error_message() {
        Assert.assertFalse(new PayBillsPage().text.isDisplayed());
    }


    @Given("{string} tab")
    public void tab(String module) {
       for(WebElement option:new PayBillsPage().modules)
           if(option.getText().equals(module)){
               option.click();
               break;
           }
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String>userData) {
        new PayBillsPage().alldetails(userData.get("Payee Name"),userData.get("Payee Address"),userData.get("Account"),userData.get("Payee details"));
    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        String expexted="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        Assert.assertEquals(expexted,new PayBillsPage().alert.getText());

    }

    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {

    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String>list) {
        List<String>actualList=new ArrayList<>();

        Select select=new Select(new PayBillsPage().currencydropdown);

        for (WebElement option : select.getOptions()) {
            actualList.add(option.getText());
        }

        Assert.assertEquals(list,actualList);


    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        new PayBillsPage().calculateButton.click();
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        System.out.println(Driver.get().switchTo().alert().getText());
    }

}
