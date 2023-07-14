package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomer = By.xpath("//button[@ng-click= 'addCust()']");
    By openAccount = By.xpath("//button[@ng-click='openAccount()']");
    By customers = By.xpath("//button[@ng-click='showCust()']");




    //click On "Add Customer" Tab
    public void clickOnAddCustomer(){

        clickOnElement(addCustomer);
    }

    //click On "Open Account" Tab
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void clickOnCustomers(){
        clickOnElement(customers);
    }
}
