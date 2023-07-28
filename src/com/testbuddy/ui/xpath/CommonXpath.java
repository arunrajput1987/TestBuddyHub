package com.testbuddy.ui.xpath;

public interface CommonXpath {

    /****************************LoginPage***********************************************/
    String homePageTitle= "//*[@id=\"content\"]/div/div/div/div[1]/h2";
    String username = "//*[@id=\"email\"]";
    String password = "//*[@id=\"pass\"]";
    String loginbutton = "//*[@data-testid=\"royal_login_button\"]";
    String menubutton = "//div//div[@class=\"bx45vsiw\"]/span/span/div";
    String postbutton = "//div[starts-with(@class,'rq0escxv')]//div[starts-with(@class,'ehxjyohh')]//div[starts-with(@class,'j83agx80')]//div[starts-with(@class,'oajrlxb2')]//div[starts-with(@class,'qzhwtbm6')]/self::div/span";
    String typeposttext = "//div[starts-with(@class,'rq0escxv')]//div[starts-with(@class,'idiwt2bm')]//div[starts-with(@class,'rq0escxv')]//div[starts-with(@class,'notranslate')]";
    String sendpost = "//div[starts-with(@class,'rq0escxv')]//div[starts-with(@class,'idiwt2bm')]//div[starts-with(@class,'rq0escxv')]//span[starts-with(@class,'d2edcug0')]/span[contains(text(),'Post')]";
    String getposttext = "//div[starts-with(@class,'rq0escxv')]//div[starts-with(@class,'du4w35lb')]//div[starts-with(@class,'j83agx80')]//div[starts-with(@class,'f530mmz5')]/div";
    String homeicon = "//div[starts-with(@class,'rq0escxv')]//div[starts-with(@class,'kr520xx4')]//ul[starts-with(@class,'thodolrn')]/li[1]/span/div/a";
    String frientsicon = "//div[starts-with(@class,'rq0escxv')]//div[3]//div[@class='buofh1pr']//ul/li/div/a[starts-with(@class,'oajrlxb2')]/div[1]/div[starts-with(@class,'ow4ym5g4')]//div[starts-with(@class,'j83agx80')]//span[starts-with(text(),'Wallet Hub')]";
    /****************************SystemCheck Card***********************************************/


    String profileText = "//*[@id=\"scroller\"]/main//h1[starts-with(@class,'profile-name')]";
    String profileSignInButton = "//*[@id=\"web-app\"]//div[starts-with(@class,'top-header-nav')]/nav[starts-with(@class,'burger-menu-right-menu')]/span";
    String insuranceusername = "//*[@id=\"email\"]";
    String insurancepassword = "//*[@id=\"password\"]";
    String insuranceloginbutton = "//*[@id=\"join-login\"]/form/div[4]/button[starts-with(@class,'btn blue center')]/span";
    String writeAReviewButton = "//*[@id=\"scroller\"]/main/div[starts-with(@class,'profile-header-module')]/nav[@class=\"profile-nav-module\"]/div[@class=\"right-content\"]/button[contains(text(),'Write a Review')]";
    String selectRatingStar = "//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/review-star/div[@class=\"rating-box-wrapper\"]//*[local-name()='svg' and @class='rvs-star-svg' and @aria-label='4 star rating']";
    String dropDown = "//*[@id=\"reviews-section\"]/modal-dialog//div/write-review//ng-dropdown[@class=\"wrev-drp\"]";
    String selectHealthInsuranceOption = "//*[@id=\"reviews-section\"]/modal-dialog/div/div/write-review/div[2]/ng-dropdown/div[starts-with(@class,'dropdown')]/ul/li[2]";
    String typeUserReview = "//*[@id=\"reviews-section\"]/modal-dialog//div/write-review/div[starts-with(@class,'wrev-user-input-box')]/div[starts-with(@class,'android')]/textarea";
    String reviewSubmitButton = "//*[@id=\"reviews-section\"]/modal-dialog[@class=\"md-write-a-review\"]//div/write-review/sub-navigation/div[@class=\"sub-nav-ct\"]/div[1]";
}