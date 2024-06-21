package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver driver;
    // Open a browser

    @BeforeSuite
    public void openABrowser(){
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }

}
