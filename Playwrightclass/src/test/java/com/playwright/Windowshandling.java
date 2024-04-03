package com.playwright;

import com.microsoft.playwright.*;

import java.util.List;

public class Windowshandling {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions lp=new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = playwright.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://letcode.in/windows");
        Locator openhomepage = page.locator("//button[@id='home']");
        openhomepage.click();
        String title = page.title();
        System.out.println(title);
        List<Page> Allpages = page.context().pages();
        for (Page x:Allpages){
            if (x.title().equals(title)){
                continue;
            }else {
                System.out.println(x.title());
                break;
            }
        }

//        Page page1 = Allpages.get(1);
//        page1.bringToFront();
//        System.out.println(page1.title());
    }
}
