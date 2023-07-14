package com.bank.testbase;



import com.bank.propertyreader.PropertyReader;
import com.bank.utilities.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeClass
    public void setUP(){

        selectBrowser(browser);
    }


    @AfterClass
    public void tearDown(){
        closeBrowser();
    }

}
