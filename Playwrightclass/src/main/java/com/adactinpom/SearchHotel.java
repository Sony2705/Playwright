package com.adactinpom;

import com.base.Baseclass;
import com.microsoft.playwright.Page;

public class SearchHotel extends Baseclass {
    private Page page;
    private static String location="//select[@id='location']";

    private static String Hotels="//select[@id='hotels']";
    private static String RoomType="//select[@id='room_type']";
    private static String NumberofRooms="//select[@id='room_nos']";
private static String AdultsperRoom="//select[@id='adult_room']";
private static String ChildrenperRoom="//select[@id='child_room']";
private static String Searchbtn="//input[@id='Submit']";

    SearchHotel(Page page){
        this.page=page;

    }
public void location(){

        dropdown(page,location,"Melbourne");
    }
public void Hotel(){

        dropdown(page,Hotels,"Hotel Sunshine");
}
public void RoomType(){

        dropdown(page,RoomType,"Double");
}
public void NumberofRooms(){

        dropdown(page,NumberofRooms,"1 - One");
}
public void AdultsperRoom(){

        dropdown(page,AdultsperRoom,"3 - Three");
}
public void ChildrenperRoom(){

        dropdown(page,ChildrenperRoom,"2 - Two");
}
public void Searchbtn(){
        clickonElement(page,Searchbtn);
}
}
