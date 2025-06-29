package com.sukhbirsingh.SampletestNG;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sampletest {

    @Description("Sample Test Case 1")
    @Test
    public void sampleTest1(){
        Assert.assertTrue(true);
    }
    @Description("Sample Test Case 2")
    @Test
    public void sampleTest2(){
        Assert.assertTrue(true);
    }
}
