package org.irshadpashabmc.SeleniumDriverExample;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectCuraMakeAppointmentTest {

    @Description("Verify Cura Login Screen elements")
    @Test
    public void  CuraMakeAppointmentTest() throws InterruptedException {

        ChromeOptions CO = new ChromeOptions();
        CO.addArguments("--start-maximized");
        //   CO.addArguments("--incognito");
        // CO.addArguments("--headless");

        WebDriver Driver = new ChromeDriver(CO);

        Driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        Driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        Driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");

        Driver.findElement(By.id("btn-login")).click();
        Thread.sleep(500);

        System.out.println(Driver.getCurrentUrl());
        assertThat(Driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");

    }
}


