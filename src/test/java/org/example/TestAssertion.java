package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion extends DriverSetup{

    @Test
    public void testDiffAssertion(){
        Assert.assertEquals(1, 1);
        System.out.println("Hi 1");
        Assert.assertEquals(1, 2);
        System.out.println("Hi 2");
        Assert.assertEquals(1, 1);
        System.out.println("Hi 3");

    }
    @Test
    public void testSoftAssertion(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(1, 1);
        System.out.println("Hi 1");
        softAssert.assertEquals(1, 2);
        System.out.println("Hi 2");
        softAssert.assertEquals(1, 1);
        System.out.println("Hi 3");
        softAssert.assertAll();

    }
}
