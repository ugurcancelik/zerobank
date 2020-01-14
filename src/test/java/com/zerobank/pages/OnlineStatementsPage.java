package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OnlineStatementsPage extends BasePage{
    @FindBy(xpath = "//div[@class='pull-left']/ul/li")
    public List<WebElement> years;

    @FindBy(xpath = "//div[@id='os_2009']//tbody/tr")
    public List<WebElement> zeronine;

    @FindBy(xpath = "//div[@id='os_2010']//tbody/tr")
    public List<WebElement>  onezero;

    @FindBy(xpath = "//div[@id='os_2011']//tbody/tr")
    public List<WebElement>  oneone;

    @FindBy(xpath = "//div[@id='os_2012']//tbody/tr")
    public List<WebElement>  onetwo;





}
