package com.zerobank.pages;
//(//div[@class='board'])[3]//tr/th

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage {

    //this is for credit accounts must have columns
    @FindBy(xpath = "(//div[@class='board'])[3]//tr/th")
    public List<WebElement> creditAccountsType;

    @FindBy(xpath = "//tbody/tr/td/a")
    public List<WebElement> tabs;


    public List<String> accountTypes() {
        List<String> actualList = new ArrayList<>();

        DashBoardPage dashBoardPage = new DashBoardPage();

        for (WebElement option : dashBoardPage.menuOptions) {
            actualList.add(option.getText());

        }

        return actualList;

    }

    public void tabName(String tab) {
        for (WebElement option : tabs) {
            String optionTxt = option.getText();
            if (optionTxt.equals(tab)) {
                option.click();
                break;
            }


        }
        //  Driver.get().findElement(By.xpath("(//tbody/tr/td/a)[1]")).click();

    }


}
