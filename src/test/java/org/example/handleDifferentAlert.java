package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class handleDifferentAlert extends DriverSetup{
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        By alertButton = By.xpath("//button[@onclick='jsAlert()']");
        By confirmAlertButton = By.xpath("//button[@onclick='jsConfirm()']");
        By promptAlertButton = By.xpath("//button[@onclick='jsPrompt()']");
        By resultText = By.xpath("//p[@id='result']");
        driver.findElement(alertButton).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        Assert.assertEquals(driver.findElement(resultText).getText(), "You successfully clicked an alert");


        driver.findElement(confirmAlertButton).click();
        alert = driver.switchTo().alert();

        alertText = alert.getText();
        System.out.println(alertText);
        alert.dismiss();

        Assert.assertEquals(driver.findElement(resultText).getText(), "You clicked: Cancel");

        driver.findElement(confirmAlertButton).click();
        alert = driver.switchTo().alert();
        alert.accept();
        Assert.assertEquals(driver.findElement(resultText).getText(), "You clicked: Ok");

        driver.findElement(promptAlertButton).click();
        alert = driver.switchTo().alert();
        alertText = alert.getText();
        System.out.println(alertText);

        alert.sendKeys("Automation");
        alert.accept();
        Assert.assertEquals(driver.findElement(resultText).getText(), "You entered: Automation");
        Thread.sleep(3000);
    }
}
