package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Webtable {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
        LaunchOptions lp= new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser brow = play.chromium().launch(lp);
        Page page = brow.newPage();
        page.navigate("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        Locator table1 = page.locator("//table[@id='customers']");
        String s = table1.innerText();
        System.out.println(s);

    }
}
