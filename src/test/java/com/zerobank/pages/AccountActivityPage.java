package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    public WebElement selectedOption;


    private Select getAccountList() {
        return new Select(selectedOption);
    }

    public String selectedOptionTab() {

        String firstSelectedOption = getAccountList().getFirstSelectedOption().getText();
        return firstSelectedOption;
    }

    public List<String> AllSelectedOptionTab() {

        List<WebElement> AllSelectedOption = getAccountList().getOptions();
        List<String> AllSelectedOptionText = new ArrayList<>();

        for (WebElement element : AllSelectedOption) {
            AllSelectedOptionText.add(element.getText());
        }
        return AllSelectedOptionText;


    }

    @FindBy(xpath = "//table/thead//th/a")
    public List<WebElement> transactionOptions;











    @FindBy(linkText = "Find Transactions")
    public WebElement findTrans;

    @FindBy(id="aa_fromDate")
    public WebElement fromDate;

    @FindBy(id="aa_toDate")
    public WebElement toDate;

    @FindBy(css=".btn.btn-primary")
    public WebElement findButton;

    @FindBy(css=".ui-icon.ui-icon-circle-triangle-w")
    public  WebElement arrowLeft;

    @FindBy(css=".ui-icon.ui-icon-circle-triangle-e")
    public WebElement arrowRight;

    @FindBy(css=".ui-datepicker-title")
    public WebElement dateSelect;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public List<WebElement> dateFindTrans;







    public List<String> TransActionColumn(){
        List<String> TransActionColumnText=new ArrayList<>();

        for (WebElement transactionOption : transactionOptions) {
            TransActionColumnText.add(transactionOption.getText());
        }
        return TransActionColumnText;
    }



}
