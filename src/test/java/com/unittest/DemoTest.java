package com.unittest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testUnitTestInGithubRunner(){
        int actual = 20;
        Assert.assertEquals(actual,20);
    }
}
