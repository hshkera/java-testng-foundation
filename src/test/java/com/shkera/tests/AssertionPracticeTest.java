package com.shkera.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shkera.base.BaseTest;

public class AssertionPracticeTest extends BaseTest{

    @Test
    public void valueShouldNotBeNull() {
        String name = "Hasan";
        Assert.assertNotNull(name, "Name should not be null");
    }

    @Test
    public void valuesShouldNotMatch() {
        int actual = 10;
        int unexpected = 20;
        Assert.assertNotEquals(actual, unexpected, "Values should not be equal");
    }

    @Test
    public void conditionShouldBeFalse() {
        boolean isFailed = false;
        Assert.assertFalse(isFailed, "Condition should be false");
    }
}