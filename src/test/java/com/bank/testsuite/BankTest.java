package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage =new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();


    @Test

    //1.bankManagerShouldAddCustomerSuccessfully.

    public void bankManagerShouldAddCustomerSuccessfully() {

        //click On "Bank Manager Login" Tab
        homePage.clickOnManagerLogin();
        //click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        //enter FirstName
        addCustomerPage.enterFirstName("Jasmeen");
        //enter LastName
        addCustomerPage.enterLastName("Kaur");
        // enter PostCode
        addCustomerPage.enterPostcode("LN1 1NL");
        //click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();
        //popup display
        //verify message "Customer added successfully"
        addCustomerPage.verifyPopUpMessage();
        //click on "ok" button on popup.
        addCustomerPage.clickOkOnPopUp();
    }
    @Test

    public void bankManagerShouldOpenAccountSuccessfully(){
        //click On "Bank Manager Login" Tab
      //  homePage.clickOnManagerLogin();
        //	click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccount();

        //	Search customer that created in first test
        openAccountPage.searchCustomer("Jasmeen Kaur");

        //	Select currency "Pound"
        openAccountPage.selectCurrencyPound("Pound");
        //	click on "process" button
        openAccountPage.clickOnProcess();
        //	popup displayed
        //	verify message "Account created successfully"
        openAccountPage.verifyPopUpAccountMessage();

        //	click on "ok" button on popup.
       openAccountPage.clickOkOnPopUp();
    }
    @Test

    public void customerShouldLoginAndLogoutSuccessfully(){
        //click on "Customer Login" Tab
        homePage.clickCustomerLogin();
        //	search customer that you created.
        customerLoginPage.searchCustomer("Jasmeen Kaur");
        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        //	verify "Logout" Tab displayed.
        accountPage.verifyLogout();
        //	click on "Logout"
       accountPage.clickOnLogout();
        //	verify "Your Name" text displayed.
        customersPage.verifyYourNameText();
    }
    @Test

    public void customerShouldDepositMoneySuccessfully(){

        //	click on "Customer Login" Tab
        homePage.clickCustomerLogin();
        //	search customer that you created.
        customerLoginPage.searchCustomer("Jasmeen Kaur");
        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //	Enter amount 100
        accountPage.enter100();
        //	click on "Deposit" Button
        accountPage.clickOnDeposit();
        //	verify message "Deposit Successful"
        accountPage.verifyDepositSuccessful();
    }
    @Test


    public void customerShouldWithdrawMoneySuccessfully(){
        //click on "Customer Login" Tab
        homePage.clickCustomerLogin();
        //	search customer that you created.
        customerLoginPage.searchCustomer("Jasmeen Kaur");
        //	click on "Login" Button
        customerLoginPage.clickOnLogin();
        //	click on "Withdrawl" Tab
        accountPage.clickOnWithdrawl();
        //	Enter amount 50
        accountPage.enterAmount50();
        //	click on "Deposit" Button
        accountPage.clickOnWithdrawlButton();
        //	verify message "Transaction Successful"
        accountPage.verifyTransactionSuccessfulText();
    }
}
