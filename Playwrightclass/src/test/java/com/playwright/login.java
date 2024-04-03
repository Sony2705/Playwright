package com.playwright;

import com.microsoft.playwright.*;

public class login {
    public static void main(String[] args) {
        Playwright k = Playwright.create();
        BrowserType.LaunchOptions lp = new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser bro = k.chromium().launch(lp);
        Page p = bro.newPage();
        p.navigate("https://www.instagram.com/accounts/login/");
        Locator userName = p.locator("(//input[@autocapitalize='off'])[1]");
        userName.fill("sony");
        Locator ps = p.locator("//input[@aria-label='Password']");
        ps.fill("sony2705");
        Locator login = p.getByText("Log in with Facebook");
        login.click();
    }
}