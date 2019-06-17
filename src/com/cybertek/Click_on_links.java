package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_on_links {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[14]/a")).click();

        if(driver.getTitle().contains("download")){

            driver.navigate();
            driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[15]/a")).click();
        }else{
            System.out.println("Could not find");
        }

        driver.quit();


    }
}
