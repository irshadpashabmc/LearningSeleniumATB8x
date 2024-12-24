package org.irshadpashabmc.SeleniumDriverExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDrvierExample_001 {

    @Test
    public void ChromeDriveTest() {

        // System.setProperty("WebDriver.chrome.driver","C://chrome.exe");


        // to open chrome browser we need to write the below scripts
     //   ChromeDriver Driver1 = new ChromeDriver();
        WebDriver Driver2 = new ChromeDriver();

     //   Driver2.get("http://www.google.com");
        Driver2.navigate().to("http://www.gmail.com");
        Driver2.navigate().back();
        Driver2.navigate().forward();
        Driver2.navigate().refresh();
        Driver2.close();


    }



}
