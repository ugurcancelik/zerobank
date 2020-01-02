package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String>list) {

        List<String> actualSubtitles= accountSummaryPage.AccountTypes();
        Assert.assertEquals(list,actualSubtitles);
    }

}
