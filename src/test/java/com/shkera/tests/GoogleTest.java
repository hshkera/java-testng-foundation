package com.shkera.tests;

import com.shkera.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void googleHomePageShouldLoad() {
        driver.get("https://www.google.com");

        String title = driver.getTitle();

        System.out.println("Page title: " + title);

        Assert.assertTrue(title.contains("Google"), "Title does not contain Google");
    }
}