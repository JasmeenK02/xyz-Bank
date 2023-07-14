package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    By firstName = By.xpath("//input[@placeholder ='First Name']");
    By lastName = By.xpath("//input[@placeholder ='Last Name']");
    By postcode = By.xpath("//input[@placeholder ='Post Code']");
    By customerButton = By.xpath("//button[@type='submit']");


    //enter FirstName
    public void enterFirstName(String text){
        sendTextToElement(firstName, text);
    }
    //enter LastName
    public void enterLastName(String text){
        sendTextToElement(lastName, text);
    }
    //enter PostCode
    public void enterPostcode(String text){
        sendTextToElement(postcode, text);
    }
    //click On "Add Customer" Button
    public void clickOnAddCustomerButton(){
        clickOnElement(customerButton);
    }

    //popup display
    //verify message "Customer added successfully"
    public void verifyPopUpMessage(){
        String actualMessage = getAlertText();
        Assert.assertEquals(actualMessage,"Customer added successfully with customer id :6","Wrong PopUp Message");
    }

    //click on "ok" button on popup.
    public void clickOkOnPopUp(){
        acceptAlert();

    }


}
