package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By yourNameText = By.xpath("//label[contains(text(),'Your Name :')]");




    //verify "Your Name" text displayed.
    public void verifyYourNameText(){
        assertVerifyText(yourNameText,"Your Name :", "Error in Name text ");
    }


}
