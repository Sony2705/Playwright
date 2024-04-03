package com.adactinpom;

import com.base.Baseclass;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.*;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Runnerclasspom extends Baseclass {
    public static void main(String[] args) throws InterruptedException {
        Playwright play = Playwright.create();
        LaunchOptions lp= new LaunchOptions();
        lp.setChannel("chrome");
        lp.setHeadless(false);
        Browser brow = Playwright.create().chromium().launch(lp);
        Page page = brow.newPage();
        urlLaunch(page,"https://adactinhotelapp.com/");
        Login login=new Login(page);
        login.enterUsername();
        login.enterPassword();
        login.clickLoginBtn();

        SearchHotel search=new SearchHotel(page);
        search.location();
        search.Hotel();
        search.AdultsperRoom();
        search.NumberofRooms();
        search.RoomType();
        search.ChildrenperRoom();
        search.Searchbtn();
//  sleep(page,5000);
        SelectHotel soh=new SelectHotel(page);
        soh.selecthotel();
        soh.cont();
        screenshot(page,"selecthotel");

    }



}
