package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By actualLogout = By.xpath("//button[@class='btn logout']");
    By depositTab = By.xpath("//button[@ng-click= 'deposit()']");
    By amount = By.xpath("//input[@placeholder='amount']");
    By deposit = By.xpath("//button[text()='Deposit']");
    By depositSuccessful = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withDrawl = By.xpath("//button[@ng-click='withdrawl()']");
    By amountWithdrawn = By.xpath("//input[@type='number']");
    By actualTransactionSuccessful = By.xpath("//span[contains(text(),'Transaction successful')]");
    By withdrawlButton = By.xpath("//button[@type='submit']");


    //verify "Logout" Tab displayed.
    public void verifyLogout(){
        assertVerifyText(actualLogout,"Logout", "Logout error");
    }
    // click on "Logout"
    public void clickOnLogout(){
        clickOnElement(actualLogout);
    }

    //	click on "Deposit" Tab
    public void clickOnDepositTab(){
        clickOnElement(depositTab);
    }
    //	Enter amount 100
    public void enter100(){
        sendTextToElement(amount, "100");
    }
    //	click on "Deposit" Button
    public void clickOnDeposit(){
        clickOnElement(deposit);
    }
    //	verify message "Deposit Successful"
    public void verifyDepositSuccessful(){
        assertVerifyText(depositSuccessful,"Deposit Successful", "error in deposit");
    }
    //click on "Withdrawl" Tab
    public void clickOnWithdrawl(){
        clickOnElement(withDrawl);
    }
    //Enter amount 50
    public void enterAmount50(){
        sendTextToElement( amountWithdrawn, "50");
    }


    //click on "Withdrawl" Button
    public void clickOnWithdrawlButton(){
        clickOnElement(withdrawlButton);
    }

    //verify message "Transaction Successful"
    public void verifyTransactionSuccessfulText(){
        assertVerifyText(actualTransactionSuccessful,"Transaction Successful", "Error in text");
    }



}
