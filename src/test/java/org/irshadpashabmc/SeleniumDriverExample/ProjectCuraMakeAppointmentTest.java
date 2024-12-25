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

    String CuraLoginText = "Login";
    String CuraTitle = "Please login to make appointment.";
    String AppointmentURL = "https://katalon-demo-cura.herokuapp.com/#appointment";

    @Description("Verify Cura Login Screen elements")
    @Test
    public void  CuraMakeAppointmentTest() throws InterruptedException {

        ChromeOptions CO = new ChromeOptions();
        CO.addArguments("--start-maximized");
        //   CO.addArguments("--incognito");
        // CO.addArguments("--headless");

        WebDriver Driver = new ChromeDriver(CO);

        // Open Make Appointment home Page

        Driver.get("https://katalon-demo-cura.herokuapp.com/");
        Driver.findElement(By.id("btn-make-appointment")).click();

        // Page redirect to Dem-Cura Login Page
        // Driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // Verify LOGIN Text in the Cura-Login Page
        WebElement VerifyLoginText = Driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/h2"));
        assertThat(VerifyLoginText.getText()).isEqualTo(CuraLoginText);

        // Verify Title text
        WebElement VerifyCuraTitle = Driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p"));
        assertThat(VerifyCuraTitle.getText()).isEqualTo(CuraTitle);

        // Verify Login with username and password
        Driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        Driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        Driver.findElement(By.id("btn-login")).click();
        Thread.sleep(500);
        System.out.println("This is Captured URL:"+Driver.getCurrentUrl());
        assertThat(Driver.getCurrentUrl()).isEqualTo(AppointmentURL);
        Driver.findElement(By.id("menu-toggle")).click();

        // Wait and click on logout
        Thread.sleep(500);
        Driver.findElement(By.linkText("Logout")).click();
        Driver.close();



    }
}