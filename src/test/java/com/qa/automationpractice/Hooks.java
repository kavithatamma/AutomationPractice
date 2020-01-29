package com.qa.automationpractice;

import com.qa.automationpractice.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager=new DriverManager();


    @Before
    public void setUp() {
        driverManager.openBrowser();
    }

    @After
    public void tearDown() {
        //driverManager.closeBrowser();
    }
}
