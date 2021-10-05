package com.Annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestAnnotation {
    @BeforeTest
    public static void launch_chrome(){
        System.out.println("Success");
    }
    @AfterTest
    public static void close_chrome(){
        System.out.println("Close");
    }
    @Test
    public static void Test1(){
        System.out.println("Pass");
    }
}
