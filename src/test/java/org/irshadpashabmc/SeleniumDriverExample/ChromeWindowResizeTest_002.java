package org.irshadpashabmc.SeleniumDriverExample;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeWindowResizeTest_002 {

    @Description("Testing Orangehrmlive url")
    @Test
    public void ChromeWindowMaxTest() {

        ChromeOptions CO = new ChromeOptions();
        CO.addArguments("--window-size=1920,1080");
        CO.addArguments("--incognito");
      //  CO.addArguments("--headless");

        WebDriver Driver = new ChromeDriver(CO);

        Driver.manage().window().maximize();
        Driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");



    }


}
