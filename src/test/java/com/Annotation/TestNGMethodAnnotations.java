package com.Annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMethodAnnotations {
   @BeforeMethod
   public static void launch_Chrome(){
       System.out.println("Successfully Launch");
   }
   @AfterMethod
   public static void close_chrome(){
       System.out.println("Close");
   }
   @Test
   public static void TestCase1(){
       System.out.println("Pass");
   }
}
