package com.shkera.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("Base setup: initializing test");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Base teardown: cleaning up");
    }
}