package com.playwright;

import com.microsoft.playwright.*;

public class actionrobot {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions lp=new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = playwright.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://www.amazon.in/");
        Locator Mobiles = page.locator("//a[text()='Mobiles']");
        Mobiles.hover();
        Mobiles.click();
        

        

























//        Locator username = page.locator("//input[@type='text']");
//username.fill("vijaiinbha25");
//
//        Locator password = page.locator("//input[@type='password']");
////password.fill("1V275N");
// page.keyboard().type("1V275N");
//page.locator("//input[@type='Submit']").click();
    }
}
