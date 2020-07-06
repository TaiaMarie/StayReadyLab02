package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class SimpleFuncTest 
{
    SimpleFunc Simple;
    public void constructor()
    {
        this.Simple = new SimpleFunc();
    }
    @Test
    public void adderTest()
    {
        //Given 
        double a = 10;
        double b = 5;

        //When
        double expected = a + b;
        double actual = SimpleFunc.adder(a, b); 

        //Then
        Assert.assertEquals(expected, actual, 0);    
    }
    @Test
    public void subtractTest()
    {
        //Given 
        double a = 10;
        double b = 5;

        //When
        double expected = a - b;
        double actual = SimpleFunc.subtract(a, b); 

        //Then
        Assert.assertEquals(expected, actual, 0);    
    }
    @Test
    public void multiplyTest()
    {
        //Given 
        double a = 10;
        double b = 5;

        //When
        double expected = a * b;
        double actual = SimpleFunc.multiply(a, b); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void divideTest()
    {
        //Given 
        double a = 10;
        double b = 5;

        //When
        double expected = a / b;
        double actual = SimpleFunc.divide(a, b); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void squaredTest()
    {
        //Given 
        double a = 10;

        //When
        double expected = a * a;
        double actual = SimpleFunc.squared(a); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void sqrootTest()
    {
        //Given 
        double a = 64;

        //When
        double expected = Math.sqrt(a);
        double actual = SimpleFunc.sqroot(a); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void factorialTest()
    {
        //Given 
        double a = 4.3;

        //When
        int n = (int) Math.round(a);
        int result = 1; 
        for (int i=2; i<=n; i++) 
            result *= i; 
        int expected = result;
        int actual = SimpleFunc.factorial(a); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void varExpontTest()
    {
        //Given 
        double a = 4;
        double b = 0;

        //When
        double expected = Math.pow(a, b);
        double actual = SimpleFunc.varExponent(a, b); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void inverseTest()
    {
        //Given 
        double a = 4;

        //When
        double expected = 1/a;
        double actual = SimpleFunc.inverse(a); 

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }
    @Test
    public void switchSignTest()
    {
        //Given 
        double a = 4;

        //When
        double expected = -a;
        double actual = SimpleFunc.switchSign(a);

        //Then
        Assert.assertEquals(expected, actual, 0);  
    }

    
}