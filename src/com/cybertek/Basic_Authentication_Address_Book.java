package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Authentication_Address_Book {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");

        //WebDriver drive=new ChromeDriver();
        // drive.get("http://a.testaddressbook.com/sign_in");


        //System.setProperty("webdriver.chrome.driver",
        //       "/Users/cybertekschool/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        // finding element from page
        driver.findElement(By.id("session_email")).sendKeys("kexesobepu@zsero.com");

        // enter the username  inputEmail.sendKeys("kexesobepu@zsero.com");

        // find the password input box
        driver.findElement(By.id("session_password")).sendKeys("password");
        // enter password inputPassword.sendKeys("password");

        // locates the sign in button
        driver.findElement(By.name("commit")).click();

        System.out.println(driver.getTitle());

        // clicks on the button signinButton.click();

        System.out.println(driver.getTitle());

        // located the username element
        WebElement username = driver.findElement(By.className("navbar-text"));

        String actualUsername = username.getText();
        System.out.println(actualUsername);

        if ("kexesobepu@zsero.com".equals(actualUsername)) {
            System.out.println("---PASSED---");
        } else {
            System.out.println("FAILED");
            System.out.println("EXPECTED: kexesobepu@zsero.com");
            System.out.println("actualUsername = " + actualUsername);
        }


    }
}
