package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {

    By selectCustomer = By.xpath("//select[@id = 'userSelect']");
    By selectPound = By.xpath("//select[@id = 'currency']");
    By process = By.xpath("//button[contains(text(),'Process')]");


    public void searchCustomer(String text) {
        selectByVisibleTextFromDropDown(selectCustomer,text);
    }

    //Select currency "Pound"
    public void selectCurrencyPound(String text) {
        selectByVisibleTextFromDropDown(selectPound, text);

    }

    //click on "process" button
    public void clickOnProcess() {
        clickOnElement(process);
    }
    //popup displayed
    //verify message "Account created successfully"
    public void verifyPopUpAccountMessage(){
        String actualMessage = getAlertText();
        Assert.assertEquals(actualMessage,"Account created successfully with account Number :1016","Wrong PopUp Account Message");
    }


    //click on "ok" button on popup.
    public void clickOkOnPopUp() {
        acceptAlert();
    }

}
