package com.playwright;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Adactinlogintask {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions lp=new BrowserType.LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser launch = playwright.chromium().launch(lp);
        Page page = launch.newPage();
        page.navigate("https://adactinhotelapp.com/");
        Locator username = page.locator("//input[@type='text']");
        username.fill("karthik1211");
        Locator password = page.locator("//input[@type='password']");
        password.fill("Karthik123");
        Locator login = page.locator("//input[@type='Submit']");
        login.click();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\test\\Screenshot\\login.png")));

        String location = "//select[@id='location']";
        page.selectOption(location,"London");
        String Hotels = "//select[@id='hotels']";
        page.selectOption(Hotels,"Hotel Sunshine");
        String roomtype = "//select[@id='room_type']";
        page.selectOption(roomtype,"Deluxe");
        String NoofRooms = "//select[@id='room_nos']";
        page.selectOption(NoofRooms,"4 - Four");
        String adultroom = "//select[@id='adult_room']";
        page.selectOption(adultroom,"3 - Three");
        String Childroom ="//select[@id='child_room']";
        page.selectOption(Childroom,"4 - Four");
        page.locator("//input[@id='Submit']").click();
        page.locator("//input[@id='radiobutton_0']").check();
page.locator("//input[@id='continue']").click();
page.locator("//input[@id='first_name']").fill("Sony");
page.locator("//input[@id='last_name']").fill("Priyanka");
page.locator("//textarea[@id='address']").fill("Thiruvotriyur");
page.locator("//input[@id='cc_num']").fill("1234567890123456");
page.locator("//select[@id='cc_type']");
String CreditcardType = "//select[@id='cc_type']";
page.selectOption(CreditcardType,"VISA");
String Expirymonth = "//select[@id='cc_exp_month']";
page.selectOption(Expirymonth,"May");
String Expiryyear = "//select[@id='cc_exp_year']";
page.selectOption(Expiryyear,"2015");
        page.locator("//input[@id='cc_cvv']").fill("1234");
        page.locator("//input[@id='book_now']").click();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\test\\Screenshot\\booknow.png")));

        page.locator("//input[@id='my_itinerary']").click();
        page.locator("//input[@name='check_all']").check();
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\IdeaProjects\\Playwrightclass\\src\\test\\Screenshot\\booking.png")));





    }
}
