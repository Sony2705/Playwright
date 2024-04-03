package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class browserlaunch {


    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        LaunchOptions k = new LaunchOptions();
        k.setChannel("msedge");
        k.setHeadless(false);
        Browser bro = playwright.chromium().launch(k);
        Page page = bro.newPage();
        page.navigate("https://www.instagram.com/?hl=en");
        bro.close();

    }
}
