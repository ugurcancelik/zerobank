package com.zerobank.step_definitions;


import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before

    public void setUp(){

        System.out.println("\nThis is coming from before scenario");

        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(2);
        LoginPage loginPage=new LoginPage();
        loginPage.login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @After

    public void tearDown(Scenario scenario){
        System.out.println("This is coming from after scenario\n");
        //if scenario fails, take a screenshot
        if(scenario.isFailed()){
            final byte [] screenshot= ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        Driver.closeDriver();
    }

    @After("@sales_manager")

    public void tearDownSalesManager(){
        System.out.println("This is coming from after scenario for sales managers\n");
    }
}
