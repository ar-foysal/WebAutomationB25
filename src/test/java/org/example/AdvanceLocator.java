package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdvanceLocator extends DriverSetup{

    @Test
    public void testAdvanceLocator() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement title = driver.findElement(By.cssSelector("textarea"));
        title.sendKeys("ADD CSS SELECTOR");
        Thread.sleep(1000);
        title = driver.findElement(By.xpath("//textarea"));
        title.clear();
        String value = driver.findElement(By.cssSelector(".gNO89b")).getAttribute("value");
        System.out.println(value);

        title = driver.findElement(By.cssSelector("#APjFqb"));
        title.sendKeys("ID AS A CSS SELECTOR");
        Thread.sleep(5000);

        System.out.println(driver.findElement(By.cssSelector("div[class='KxwPGc SSwjIe'] > div > a[href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe'] /div /a[@href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());

        System.out.println(driver.findElement(By.cssSelector("div[class='KxwPGc SSwjIe'] > div > a[class='pHiOh'][href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe'] /div /a[@class='pHiOh' and @href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());

        System.out.println(driver.findElement(By.cssSelector("div[class^='KxwPGc SSwj'] > div > a[class='pHiOh'][href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[starts-with(@class,'KxwPGc SSw')] /div /a[@class='pHiOh' and @href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());

        System.out.println(driver.findElement(By.cssSelector("div[class *='xwPGc SSwj'] > div > a[class='pHiOh'][href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'xwPGc SSw')] /div /a[@class='pHiOh' and @href='https://about.google/?utm_source=google-BD&utm_medium=referral&utm_campaign=hp-footer&fg=1']")).getText());

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println(driver.findElement(By.cssSelector("tr> th:nth-child(4)")).getText());
        System.out.println(driver.findElement(By.xpath("//tr/th[3]")).getText());

        System.out.println(driver.findElement(By.cssSelector("tr> th:first-child")).getText());
        System.out.println(driver.findElement(By.xpath("//tr/th[1]")).getText());

        System.out.println(driver.findElement(By.cssSelector("tr> th:last-child")).getText());
        System.out.println(driver.findElement(By.xpath("//tr/th[last()]")).getText());

        System.out.println(driver.findElement(By.xpath("//th[text()='Name'] /following-sibling::th[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//th[text()='Price'] /preceding-sibling::th[last()]")).getText());


    }

}
