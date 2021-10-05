package com.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    @BeforeClass
    public static void launch_Chrome(){
        System.out.println("Chrome Launch Successfully");
    }
    @AfterClass
    public static void close_Chrome(){
        System.out.println("Chrome Closed");
    }
    @Test
    public static void TestCase_001(){
        System.out.println("My name is MD Taufique Hasan");
    }
}
