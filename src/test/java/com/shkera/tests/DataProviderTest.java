package com.shkera.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
                { "user1", "pass1" },
                { "user2", "pass2" },
                { "admin", "admin123" }
        };
    }

    @Test(dataProvider = "loginData")
    public void loginShouldWorkWithValidData(String username, String password) {
        System.out.println("Testing login with: " + username + " / " + password);

        Assert.assertTrue(username.length() > 0, "Username should not be empty");
        Assert.assertTrue(password.length() > 0, "Password should not be empty");
    }

    @DataProvider(name = "numbers")
    public Object[][] numbersData() {
        return new Object[][] {
                { 2, 3, 5 },
                { 10, 5, 15 },
                { 7, 8, 15 }
        };
    }

    @Test(dataProvider = "numbers")
    public void additionShouldReturnExpectedResult(int a, int b, int expected) {
        Assert.assertEquals(a + b, expected, "Addition result is incorrect");
    }
}