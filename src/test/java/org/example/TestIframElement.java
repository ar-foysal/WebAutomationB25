package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestIframElement extends DriverSetup{
    @Test
    public void testIFrame() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js =  (JavascriptExecutor) driver;
        WebElement mouseHover = driver.findElement(By.xpath("//button[@id='mousehover']"));

        js.executeScript("arguments[0].scrollIntoView();", mouseHover);
        Thread.sleep(5000);

//        driver.switchTo().frame(0);
//        driver.switchTo().frame("courses-iframe");
//        driver.switchTo().frame("iframe-name");
        WebElement frame = driver.findElement(By.cssSelector("#courses-iframe"));
        driver.switchTo().frame(frame);
        String email = driver.findElement(By.xpath("//*[text() =' contact@rahulshettyacademy.com']")).getText();
        System.out.println(email);
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[@id='mousehover']"));
    }
}
