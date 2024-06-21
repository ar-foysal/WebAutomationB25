package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowseAWebPage extends DriverSetup{

    @Test
    public void loadAPage() throws InterruptedException {
        // load url https://www.google.com
        driver.get("https://www.google.com/");

        // TEST TITLE
        Assert.assertEquals(driver.getTitle(), "Google");
        // TEST URL
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        driver.findElement(By.id("APjFqb")).sendKeys("Hello");
        driver.findElement(By.name("q")).sendKeys("Hello");
        driver.findElement(By.className("gLFyf")).sendKeys("Hello");
        driver.findElement(By.tagName("textarea")).sendKeys("Hello");
        driver.findElement(By.linkText("সম্পর্কে")).click();
        driver.findElement(By.partialLinkText("সার্চ কীভাবে")).click();
        driver.findElement(By.cssSelector("textarea[aria-label='সার্চ করুন']")).sendKeys("Hello");
        driver.findElement(By.xpath("//textarea[@aria-label='সার্চ করুন']")).sendKeys("Hello");
        Thread.sleep(5000);
     }
}
