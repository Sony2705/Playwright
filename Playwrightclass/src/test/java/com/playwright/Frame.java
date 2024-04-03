package com.playwright;

import com.microsoft.playwright.*;

public class Frame {
    public static void main(String[] args) {
        Playwright play = Playwright.create();
        BrowserType.LaunchOptions lp =new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = play.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://demo.automationtesting.in/Frames.html");
        FrameLocator firstbox= page.frameLocator("//iframe[@id='singleframe']");
        Locator locator = firstbox.locator("//input[@type='text']");
        locator.fill("checkone");
        page.mainFrame();
        Locator secondbox = page.locator("//a[text()='Iframe with in an Iframe']");
        secondbox.click();
        FrameLocator outerframe = page.frameLocator("//iframe[@src='MultipleFrames.html']");
        FrameLocator innerframe = outerframe.frameLocator("//iframe[@src='SingleFrame.html']");
        Locator textbox = innerframe.locator("//input[@type='text']");
        textbox.fill("checksecond");





    }
}


