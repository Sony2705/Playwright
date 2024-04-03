package com.playwright;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class dropdown {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions lp=new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = playwright.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://letcode.in/dropdowns");

        String fruits="//select[@id='fruits']";
        page.selectOption(fruits,"orange");

        String hero ="//select[@id='superheros']";
        String[] movie={"Aquaman","Ant-Man","The Avengers"};
        page.selectOption(hero,movie);





        ElementHandle elementHandle = page.querySelector("//option[text()='Orange']");
        Object value = elementHandle.evaluate("el=>el.selected");
        System.out.println(value);

//        without mention com.playwright.dropdown
//        page.evaluate("document.querySelectorAll('select option').forEach(option->option.selected=true");

//        specific com.playwright.dropdown
//        page.evaluate("document.querySelector('select')[1].querySelectAll('option').forEach(option=>option.selected=true");

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\ajayv\\IdeaProjects\\playwrightclass\\src\\test\\screenshot\\com.playwright.dropdown.png")));





    }

}
