package org.irshadpashabmc.SeleniumDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_001 {

    @Test
    public void FirstSeleniumTest() {

        // System.setProperty("webdriver.chrome.driver","C://chrome.exe");
        // ChromeDriver d = new ChromeDriver();
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://www.google.com");
        String a = Driver.getTitle();
        System.out.println(a);

    }
}
