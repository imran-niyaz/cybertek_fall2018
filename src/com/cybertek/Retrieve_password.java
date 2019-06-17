package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retrieve_password {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver",
                "/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("imranbabur111@gmail.com");
        driver.findElement(By.id("form_submit")).click();

    }
}
