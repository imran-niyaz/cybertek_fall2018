package com.company;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test_A {

    public static void main (String [] args){

        System.setProperty("webdriver.chrome.driver",
                "/Users/imran/Documents/Cybertek/dependencies/WebDrivers/chromedriver");


        WebDriver driver;
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // impl
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS);


        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Design Patterns: Elements"+Keys.ENTER);
        //
        driver.findElement(By.xpath("//h2[text()='Design Patterns: Elements of Reusable Object-Oriented Software']/parent::a")).click();

        String title = driver.getTitle();
        String expectedTitle = "Design Patterns";

        String productTitle = driver.findElement(By.id("productTitle")).getText();
        String expectedProdTitle = "Design Patterns: Elements of Reusable Object-Oriented Software";

        // verify title
        if(title.contains(expectedTitle) && productTitle.equals(expectedProdTitle)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }


    }
}
