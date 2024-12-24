package org.irshadpashabmc.SeleniumDriverExample;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class EdgeWindowResizetest {

    @Description("Verify the edge browser using options")
    @Test
    public void VerifyEdgewindowsize() {


        EdgeOptions EO = new EdgeOptions();
        EO.addArguments("--window-size=1920,1080");
        EO.addArguments("--incognito");
        EO.addArguments("--headless");

        WebDriver Driver = new EdgeDriver(EO);

        Driver.manage().window().maximize();
        Driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");




    }
}
