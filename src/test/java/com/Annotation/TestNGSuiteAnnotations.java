package com.Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGSuiteAnnotations {
    @BeforeSuite
    public static void launch_Chrome(){
        System.out.println("Successfully Launch");
    }
    @AfterSuite
    public static void close_chrome(){
        System.out.println("Close");
    }
    @Test
    public static void TestCase1(){
        System.out.println("Pass");
    }
}
