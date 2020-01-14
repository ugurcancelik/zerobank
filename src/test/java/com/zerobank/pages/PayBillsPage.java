package com.zerobank.pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBillsPage extends BasePage{

    @FindBy(id="sp_amount")
    public WebElement amount;

    @FindBy(id="sp_date")
    public WebElement date;


    @FindBy(xpath = "//span[.='The payment was successfully submitted.']")
    public WebElement text;

    @FindBy (xpath = "//td[@data-handler='selectDay']")
    public List<WebElement> dates;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    public String WarningMessage(){
        String warningMessage=amount.getAttribute("validationMessage");
        return warningMessage;
    }

    public String actualSuccessMessage(){
        return text.getText();
    }


    @FindBy(xpath = "//div[@id='tabs']/ul/li/a")
    public List<WebElement> modules;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id="np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id="np_new_payee_account")
    public WebElement account;

    @FindBy(id="np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement add;

    public void alldetails(String payeeNamestr,String payeeAddressstr,String accountstr,String payeeDetailsstr){
        payeeName.sendKeys(payeeNamestr);
        payeeAddress.sendKeys(payeeAddressstr);
        account.sendKeys(accountstr);
        payeeDetails.sendKeys(payeeDetailsstr);
        add.click();

    }

    @FindBy(id = "alert_content")
    public WebElement alert;

    @FindBy(id = "pc_currency")
    public WebElement currencydropdown;

    @FindBy(id="pc_calculate_costs")
    public WebElement calculateButton;


}
