package com.zerobank.step_definitions;

import com.zerobank.pages.OnlineStatementsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class StatementsAndDocumentsStepDefs {

    @When("the user selects the Recent Statements Year {int}")
    public void the_user_selects_the_Recent_Statements_Year(Integer year) {
        String yearString=String.valueOf(year);
        for(WebElement option:new OnlineStatementsPage().years){
            if(option.getText().equals(yearString)){
                option.click();
                BrowserUtils.waitFor(2);
                break;
            }
        }
    }

    @Then("{int} statements should be displayed for that {int}")
    public void statements_should_be_displayed_for_that(Integer count, Integer year) {

        int e=count;

        String yearString=String.valueOf(year);
        for(WebElement option:new OnlineStatementsPage().years){
            if(option.getText().equals(yearString)){
                option.click();
                BrowserUtils.waitFor(2);

                break;
            }
        }

Assert.assertEquals(e,new OnlineStatementsPage().oneone.size());
        switch (year){
            case 2009:
               int a= new OnlineStatementsPage().zeronine.size();

                break;
            case 2010:
                int b=new OnlineStatementsPage().onezero.size();
                break;
            case 2011:
             int c=   new OnlineStatementsPage().oneone.size();
               break;
            case 2012:
                int d=new OnlineStatementsPage().onetwo.size();

        }
    }
}
