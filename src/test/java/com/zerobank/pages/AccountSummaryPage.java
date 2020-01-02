package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage {

    public List<String> AccountTypes(){
        List<String> actualList= new ArrayList<>();

        DashBoardPage dashBoardPage=new DashBoardPage();

        for (WebElement option : dashBoardPage.menuOptions) {
            actualList.add(option.getText());

        }

        return actualList;

    }
}
