package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public void openPage(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @FindBy(id="signin_button")
    public WebElement signIn;

    @FindBy(id="user_login")
    public WebElement userName;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name="submit")
    public WebElement submit;

    @FindBy(css=".alert.alert-error")
    public WebElement error;

    public void login(String userNameStr,String passwordStr){
        signIn.click();
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }



    public void WrongAccount(){
        String title=Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(title.contains("Log in"));
    }

    public void ErrorMessage(){

        String errorMessage=error.getText();


        Assert.assertEquals("Login and/or password are wrong.",errorMessage);

    }
}





