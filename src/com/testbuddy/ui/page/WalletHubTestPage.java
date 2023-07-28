package com.testbuddy.ui.page;

import com.app.tbhframework.Driver;
import com.app.tbhframework.Reporting;
import com.app.util.TBHBaseUtil;
import com.testbuddy.ui.xpath.CommonXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletHubTestPage extends TBHBaseUtil {

    public WalletHubTestPage(WebDriver driver, String driverType, Driver.HashMapNew Dictionary, Driver.HashMapNew Environment,
                         Reporting Reporter, com.app.tbhframework.Assert Assert, com.app.tbhframework.SoftAssert SoftAssert) {
        super(driver, driverType, Dictionary, Environment, Reporter, Assert, SoftAssert);
    }

    private By getHomePageTitle = By.xpath(CommonXpath.homePageTitle);
    private By userName = By.xpath(CommonXpath.username);
    private By userPassword = By.xpath(CommonXpath.password);
    private By loginButton = By.xpath(CommonXpath.loginbutton);
    private By menuButton = By.xpath(CommonXpath.menubutton);
    private By postButton = By.xpath(CommonXpath.postbutton);
    private By typePostText = By.xpath(CommonXpath.typeposttext);
    private By sendPostButton = By.xpath(CommonXpath.sendpost);
    private By getPostText = By.xpath(CommonXpath.getposttext);
    private By homeIcon = By.xpath(CommonXpath.homeicon);
    private By frindsIcon = By.xpath(CommonXpath.frientsicon);




    public String getHomePageMessageText(){
        String value = getText(getHomePageTitle, 10);
        return value;
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
    public void click_OnMenuButton(){
        click(menuButton,"",20);
    }
    public void click_OnPostButton(){
        click(postButton,"",20);
    }
    public  void set_postText(String postText){
        type(typePostText, "", postText,20);
    }
    public void click_OnSendPostButton(){
        click(sendPostButton,"",20);
    }
    public void click_OnHomeIcon(){
        click(homeIcon,"",40);
    }
    public void click_OnFrindsIcon(){
        click(frindsIcon,"",20);
    }
    public String getPostText(){
        String value = getText(getPostText, 10);
        return value;
    }

}
