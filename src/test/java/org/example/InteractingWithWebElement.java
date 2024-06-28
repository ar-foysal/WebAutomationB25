package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class InteractingWithWebElement extends DriverSetup{
    @Test
    public void testSomethingElse(){
        Assert.assertFalse(false);
    }

    @Test
    public void testWebElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement inputTextBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        inputTextBox.sendKeys("Automation");
        Thread.sleep(2000);
        inputTextBox.clear();
        Thread.sleep(2000);
        String placeholderText = inputTextBox.getAttribute("placeholder");
        Assert.assertEquals(placeholderText, "Type to Select Countries");

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
        radioButton1.click();

        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        Thread.sleep(2000);
        Boolean selectState = radioButton1.isSelected();
        Boolean displayState = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("Before Hide " + displayState);
        driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
        displayState = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println("After hide " + displayState);

        boolean state = driver.findElement(By.xpath("//a[@id='opentab']")).isEnabled();
        Assert.assertTrue(state);

        String backgroundColor = driver.findElement(By.xpath("//a[@id='opentab']")).getCssValue("background-color");
        System.out.println(backgroundColor);

        List<WebElement> courses = driver.findElements(By.xpath("//table[@name='courses'] //td[2]"));

        for (WebElement course : courses){
            System.out.println(course.getText());
        }
    }

}
