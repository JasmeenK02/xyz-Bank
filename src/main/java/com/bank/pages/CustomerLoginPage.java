package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By selectCustomer = By.xpath("//select[@id = 'userSelect']");
    By login = By.xpath("//button[contains(text(),'Login')]");



   // search customer that you created.
    public void searchCustomer(String text) {
        selectByVisibleTextFromDropDown(selectCustomer, text);
    }

    //click on "Login" Button
    public void clickOnLogin(){
        clickOnElement(login);
    }


}
