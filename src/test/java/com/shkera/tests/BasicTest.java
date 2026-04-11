package com.shkera.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    @Test
    public void additionShouldReturnCorrectResult() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5, "Addition failed");
    }

    @Test
    public void stringsShouldMatchCorrectly() {
        String actual = "automation";
        String expected = "automation";
        Assert.assertEquals(actual, expected, "Strings do not match");
    }

    @Test
    public void booleanConditionShouldEvaluateToTrue() {
        boolean condition = (10 > 5);
        Assert.assertTrue(condition, "Condition should be true");
    }

    @Test
    public void arrayShouldHaveExpectedLength() {
        int[] numbers = {1, 2, 3, 4};
        Assert.assertEquals(numbers.length, 4, "Array length mismatch");
    }
}