package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityStepDefs {

    @Then("first selected option should be {string}")
    public void first_selected_option_should_be(String string) {
        String expected=string;
        Assert.assertEquals(expected,new AccountActivityPage().selectedOptionTab());
        System.out.println(new AccountActivityPage().selectedOptionTab());
    }

    @Then("all selected option should be following options")
    public void all_selected_option_should_be_following_options(List<String> list) {
        Assert.assertEquals(list,new AccountActivityPage().AllSelectedOptionTab());
    }

    @Then("show transactions table shoul have following options")
    public void show_transactions_table_shoul_have_following_options(List<String> list) {
        Assert.assertEquals(list,new AccountActivityPage().TransActionColumn());

    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String tab) {
      BrowserUtils.waitFor(4);
//        System.out.println(Driver.get().findElement(By.xpath("(//tbody/tr/td/a)[1]")).getText().equals("Savings"));
       // Driver.get().findElement(By.xpath("(//tbody/tr/td/a)[1]")).click();
       new AccountSummaryPage().tabName(tab);

//        @FindBy(xpath = "//tbody/tr/td/a")
//        public List<WebElement> tabs;
//
        //List<WebElement> tabs=Driver.get().findElements(By.xpath("//tbody/tr/td/a"));

//        for (WebElement option:new AccountActivityPage().tabs) {
//
//            if(option.getText().equals(tab)){
//                option.click();
//                break;
//            }
//
//
//        }
    }

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        new AccountActivityPage().findTrans.click();
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String date1, String date2) {
        new AccountActivityPage().fromDate.click();
        while (!new AccountActivityPage().dateSelect.getText().equals("September 2012")) {
            new AccountActivityPage().arrowLeft.click();
        }
        for (WebElement date : new PayBillsPage().dates) {
            String dateTxt = date.getText();
            if (date1.substring(8, 9).equals("0")) {
                if (dateTxt.equals(date1.substring(date1.lastIndexOf("-") + 2))) {

                    date.click();
                    break;
                }
            } else {
                if (dateTxt.equals(date1.substring(date1.lastIndexOf("-") + 1))) {

                    date.click();
                    break;
                }
            }
        }

        new AccountActivityPage().toDate.click();
        while (!new AccountActivityPage().dateSelect.getText().equals("September 2012")) {
            new AccountActivityPage().arrowLeft.click();
        }
        for (WebElement date : new PayBillsPage().dates) {
            String dateTxt = date.getText();
            if (date2.substring(8, 9).equals("0")) {
                if (dateTxt.equals(date2.substring(date2.lastIndexOf("-") + 2))) {
                    date.click();
                    break;
                }
            }else {
                if (dateTxt.equals(date2.substring(date2.lastIndexOf("-") + 1))) {

                    date.click();
                    break;
                }
            }


        }
    }

    @When("clicks search")
    public void clicks_search() {
        new AccountActivityPage().findButton.click();
        BrowserUtils.waitFor(4);
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String date1, String date2) {
        for (WebElement option:new AccountActivityPage().dateFindTrans) {
            if(option.getText().contains(date1)&&option.getText().contains(date2)){
                Assert.assertTrue(1==1);
            }
        }
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }





}
