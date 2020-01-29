package com.qa.automationpractice.page_elements;

import com.qa.automationpractice.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends DriverManager {
    @FindBy(id = "email")
    private WebElement emailId;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "SubmitLogin")
    private WebElement submitBtn;

    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }
    public MyAccountPage loginCredentials(){
        emailId.sendKeys("kavithatamma@hotmail.com");
        password.sendKeys(("Govinda@0711"));
        submitBtn.click();
        return new MyAccountPage();
    }
    public String getTitle()
    {
        return driver.getTitle();
    }

}
