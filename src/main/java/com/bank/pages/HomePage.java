package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManager = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");


    //click On "Bank Manager Login" Tab
    public void clickOnManagerLogin(){
        clickOnElement(bankManager);
    }


    //click On "Add Customer" Tab
    public void clickCustomerLogin(){
        clickOnElement(customerLogin);
    }

}
