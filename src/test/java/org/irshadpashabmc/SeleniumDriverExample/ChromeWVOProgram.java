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

public class ChromeWVOProgram {

    @Description("Verify vwo login page")
    @Test
    public void VerifyVWOLoginPage() throws InterruptedException {

        ChromeOptions CO = new ChromeOptions();
        CO.addArguments("--start-maximized");
     //   CO.addArguments("--incognito");
        // CO.addArguments("--headless");

        WebDriver Driver = new ChromeDriver(CO);

        Driver.get("https://app.vwo.com/#/login");
        Driver.findElement(By.id("login-username")).sendKeys("irshad@vwo.com");
        Driver.findElement(By.id("login-password")).sendKeys("aaaa");

        Driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(500);
        WebElement ErrorMessage = Driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(ErrorMessage.getText());
        Assert.assertEquals(ErrorMessage.getText(),"Your email, password, IP address or location did not match");
     assertThat(ErrorMessage.getText()).isEqualTo("Your email, password, IP address or location did not match");

    }
}
