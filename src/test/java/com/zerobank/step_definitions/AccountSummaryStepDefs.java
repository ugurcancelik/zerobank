package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.DashBoardPage;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String>list) {

        List<String> actualSubtitles= accountSummaryPage.accountTypes();
        Assert.assertEquals(list,actualSubtitles);
    }

    @Then("the user should see following menu options in Credit Account Table")
    public void the_user_should_see_following_menu_options_in_Credit_Account_Table(List<String> list) {

        List<String> actualList=new ArrayList<>();

        for (WebElement option : accountSummaryPage.creditAccountsType) {
            actualList.add(option.getText());

        }

        System.out.println(actualList);

        Assert.assertEquals(list,actualList);


    }



}
