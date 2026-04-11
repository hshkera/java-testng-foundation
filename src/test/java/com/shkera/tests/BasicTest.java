package com.shkera.tests;

import com.shkera.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest extends BaseTest{

    @Test
    public void additionShouldReturnCorrectResult() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5);
    }
}