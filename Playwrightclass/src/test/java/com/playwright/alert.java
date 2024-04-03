package com.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class alert {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        LaunchOptions lp=new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = playwright.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://demo.automationtesting.in/Alerts.html");

        page.onDialog(dialog -> {
            System.out.println(dialog.message());
            dialog.accept();
        });

        page.click("//button[@onclick='alertbox()']");

        page.click("//a[text()='Alert with OK & Cancel ']");
//        page.click("//button[@onclick='alertbox()']");

//       page.onDialog(dialog -> {
//           System.out.println(dialog.message());
//           dialog.accept();
//       });



    }
}

