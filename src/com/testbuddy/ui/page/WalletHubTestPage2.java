package com.testbuddy.ui.page;

import com.app.tbhframework.Driver;
import com.app.tbhframework.Reporting;
import com.app.util.TBHBaseUtil;
import com.testbuddy.ui.xpath.CommonXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletHubTestPage2 extends TBHBaseUtil {

    public WalletHubTestPage2(WebDriver driver, String driverType, Driver.HashMapNew Dictionary, Driver.HashMapNew Environment,
                             Reporting Reporter, com.app.tbhframework.Assert Assert, com.app.tbhframework.SoftAssert SoftAssert) {
        super(driver, driverType, Dictionary, Environment, Reporter, Assert, SoftAssert);
    }

    private By getProfileText = By.xpath(CommonXpath.profileText);
    private By clickOnProfileSignInButton = By.xpath(CommonXpath.profileSignInButton);

    private By userName = By.xpath(CommonXpath.insuranceusername);
    private By userPassword = By.xpath(CommonXpath.insurancepassword);
    private By loginButton = By.xpath(CommonXpath.insuranceloginbutton);
    private By writeAReviewButton = By.xpath(CommonXpath.writeAReviewButton);
    private By selectRatingStar = By.xpath(CommonXpath.selectRatingStar);
    private By clickdropDown = By.xpath(CommonXpath.dropDown);
    private By selectHealthInsuranceOption = By.xpath(CommonXpath.selectHealthInsuranceOption);
    private By typeUserReviewForHealthInsurance = By.xpath(CommonXpath.typeUserReview);
    private By submitReviewButton = By.xpath(CommonXpath.reviewSubmitButton);









    public String getProfileText() {
        String value = getText(getProfileText, 10);
        return value;
    }
    public void clickOnProfileSignInButton(){
        click(clickOnProfileSignInButton,"",20);
    }
    public  void set_username(String usern){
        type(userName, "", usern,20);
    }
    public  void set_password(String userp){

        type(userPassword, "", userp, 20);
    }
    public  void click_LoginButton(){

        click(loginButton, "Log In", 20);
    }
    public void click_OnWriteAReviewButton(){
        click(writeAReviewButton,"Write A Review Button",20);
    }
    public void selectRatingStar4(){
        click(selectRatingStar,"Select 4 start rating icon",20);
    }

    public void clickOnDropDownHealth(){
        click(clickdropDown,"click on dropdown", 20);
    }

    public void selectHealthInsuranceOption(){
        click(selectHealthInsuranceOption,"Select Health Insurance from dropdown",20);
    }

    public  void typeUserReviewForInsuranceCompany(String inputReview){
        type(typeUserReviewForHealthInsurance, "", inputReview, 20);
    }
    public void click_OnReviewSubmitButton(){
        click(submitReviewButton,"Submit",20);
    }

}
