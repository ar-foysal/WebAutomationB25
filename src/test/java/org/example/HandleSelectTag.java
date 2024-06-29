package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleSelectTag extends DriverSetup{

    @Test
    public void testDropdown() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        dropdown.click();
        Select select = new Select(dropdown);

        select.selectByIndex(2);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        select.selectByVisibleText("Option3");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        select.selectByValue("option1");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        System.out.println("_________________________________________");
        List<WebElement> options = select.getOptions();

        for (WebElement option: options)
            System.out.println(option.getText());
    }
}
