package com.adactinpom;

import com.base.Baseclass;
import com.microsoft.playwright.Page;

public class SelectHotel extends Baseclass {
private Page page;
    private static String radiobtn ="//input[@id='radiobutton_0']";
    private static String Conti="//input[@id='continue']";


    public SelectHotel(Page page){
this.page=page;
    }
public void selecthotel(){
    radiobutton(page,radiobtn);
}
public void cont(){

        clickonElement(page,Conti);
}

}
