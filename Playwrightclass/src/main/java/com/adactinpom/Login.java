package com.adactinpom;

import com.base.Baseclass;
import com.microsoft.playwright.Page;

public class Login extends Baseclass {

    private Page page;

    private static String userName="//input[@id='username']";

    private static String password="//input[@id='password']";

    private static  String loginButton="//input[@type='Submit']";

    public Login(Page page){
        this.page=page;
    }
    public void enterUsername(){
        inputValues(page,userName,"karthik1211");

    }
    public void enterPassword(){
        inputValues(page,password,"Karthik123");
    }
    public void clickLoginBtn(){
        clickonElement(page,loginButton);

    }
}
