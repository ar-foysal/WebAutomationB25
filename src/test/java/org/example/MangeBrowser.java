package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MangeBrowser extends DriverSetup{
    @Test
    public void testBrowser() throws InterruptedException {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);
        driver.navigate().to("https://www.facebook.com/");
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);

        driver.navigate().back();
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);

        driver.navigate().forward();
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);

        driver.navigate().refresh();
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.facebook.com/");
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.google.com/");
        title = driver.getTitle();
        url = driver.getCurrentUrl();
        System.out.println(title + " :   " + url);
        Thread.sleep(2000);

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().minimize();

        List<String> window_handles = new ArrayList<>(driver.getWindowHandles());

        for (String handle: window_handles)
            System.out.println(handle);

        driver.switchTo().window(window_handles.get(1));
        driver.close();

        Thread.sleep(10000);



    }
}
