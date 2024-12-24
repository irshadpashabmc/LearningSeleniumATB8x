package org.irshadpashabmc.SeleniumDriverExample;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Awesomeqa {


    @Description("Verify the awesomeqa elements")
    @Test
    public void AwesomeQA() {

        ChromeOptions CO = new ChromeOptions();
        CO.addArguments("--start-maximized");
        //   CO.addArguments("--incognito");
        // CO.addArguments("--headless");

        WebDriver Driver = new ChromeDriver(CO);

        Driver.get("https://awesomeqa.com/practice.html");
        Driver.findElement(By.name("firstname")).sendKeys("John");
        Driver.findElement(By.name("lastname")).sendKeys("ThisIsNotAPassword");
        Driver.findElement(By.id("sex-0")).click();
        Driver.findElement(By.id("datepicker")).sendKeys("24122024");
        Driver.findElement(By.id("profession-0")).click();
        Driver.findElement(By.id("tool-0")).click();





    }
}
