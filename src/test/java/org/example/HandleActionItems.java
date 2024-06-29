package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleActionItems extends DriverSetup{

    @Test
    public void testDifferentActions() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000).build().perform();
//        actions.scrollToElement(driver.findElement(By.xpath("//legend[normalize-space()='Mouse Hover Example']"))).build().perform();

        actions.clickAndHold(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        actions.click(driver.findElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        Thread.sleep(3000);

        actions.sendKeys(driver.findElement(By.id("autocomplete")),"Bangladesh").build().perform();
        String text = driver.findElement(By.id("autocomplete")).getAttribute("value");
        System.out.println("input- get attribute value: " + text);
        Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(3000);
        actions.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(3000);
        actions.click(driver.findElement(By.id("name"))).keyDown(Keys.CONTROL).sendKeys("v").build().perform();

        Thread.sleep(3000);


    }
}
