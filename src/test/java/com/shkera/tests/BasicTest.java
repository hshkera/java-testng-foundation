package test.java.com.shkera.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    @Test
    public void additionTest() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5, "Addition failed");
    }

    @Test
    public void stringTest() {
        String actual = "automation";
        String expected = "automation";
        Assert.assertEquals(actual, expected, "Strings do not match");
    }

    @Test
    public void booleanTest() {
        boolean condition = (10 > 5);
        Assert.assertTrue(condition, "Condition should be true");
    }

    @Test
    public void arrayLengthTest() {
        int[] numbers = {1, 2, 3, 4};
        Assert.assertEquals(numbers.length, 4, "Array length mismatch");
    }
}