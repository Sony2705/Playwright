package com.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Paths;

import static com.base.Baseclass.*;

public class Runnerclass {

    public static void main(String[] args) {
        LaunchOptions lp= new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser brow = Playwright.create().chromium().launch(lp);
        Page page = brow.newPage();
        urlLaunch(page,"https://adactinhotelapp.com/");
        inputValues(page, "//input[@id='username']","karthik1211");
        inputValues(page,"//input[@id='password']","Karthik123");
clickonElement(page,"//input[@type='Submit']");
page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\Adactinmethodimpv\\login.png")));
dropdown(page,"//select[@id='location']","Brisbane");
dropdown(page,"//select[@id='hotels']","Hotel Hervey");
dropdown(page,"//select[@id='room_type']","Double");
dropdown(page,"//select[@id='adult_room']","4 - Four");
dropdown(page,"//select[@id='child_room']","3 - Three");
clickonElement(page,"//input[@id='Submit']");
clickonElement(page,"//input[@id='radiobutton_0']");
clickonElement(page,"//input[@type='submit']");
page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\Adactinmethodimpv\\sumbit.png")));
inputValues(page,"//input[@id='first_name']","Sony");
inputValues(page,"//input[@id='last_name']","Priyanka");
inputValues(page,"//textarea[@id='address']","Thiruvotriyur");
inputValues(page,"//input[@id='cc_num']","1234567890123456");
        dropdown(page,"//select[@id='cc_type']","Master Card");
        dropdown(page,"//select[@name='cc_exp_month']","February");
        dropdown(page,"//select[@name='cc_exp_year']","2026");
        inputValues(page,"//input[@name='cc_cvv']","123");
        clickonElement(page,"//input[@type='button']");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\Adactinmethodimpv\\loggedout.png")));

        clickonElement(page,"//input[@name='my_itinerary']");
        clickonElement(page,"//input[@name='logout']");
    }

}
