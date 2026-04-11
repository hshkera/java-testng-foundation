package com.shkera.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Setting up before test");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Cleaning up after test");
    }

    @Test
    public void numberComparisonShouldPass() {
        System.out.println("Running number comparison test");
        Assert.assertTrue(20 > 10, "Expected 20 to be greater than 10");
    }

    @Test
    public void textShouldMatch() {
        System.out.println("Running text match test");
        String actual = "TestNG";
        String expected = "TestNG";
        Assert.assertEquals(actual, expected, "Texts do not match");
    }
}