package com.base;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class Baseclass {
    public static void urlLaunch(Page page, String url)
    {
        page.navigate(url);
    }
    public static void inputValues(Page page,String selector,String value){
        page.waitForSelector(selector);
        page.fill(selector,value);
    }

    public static void clickonElement(Page page,String selector){
        page.waitForSelector(selector);
        page.click(selector);
    }
    public static void dropdown(Page page,String selector,String value){
        page.waitForSelector(selector);
        page.selectOption(selector,value);
    }
    public static void sleep(Page page,int value) throws InterruptedException {
        Thread.sleep(value);
    }

    public static void screenshot(Page page,String name){
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\test\\Screenshot\\"+ name +".png")));
    }
    public static void radiobutton(Page page,String selector){

        page.check(selector);
    }
}


