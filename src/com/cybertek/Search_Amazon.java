package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Amazon {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.findElement(By.name("field-keywords")).sendKeys("mac book pro");
        String title = driver.getTitle();
        driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        System.out.println(driver.getTitle());

       // verify title



    }
}
