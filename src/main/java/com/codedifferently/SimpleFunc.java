package com.codedifferently;

public class SimpleFunc 
{
    static public double adder(double a, double b)
    {
        return a + b;    
    }

    static public double subtract(double a, double b)
    {
        return a - b;    
    }

    static public double multiply(double a, double b)
    {
        return a * b;    
    }

    static public double divide(double a, double b)
    {
        return a / b;    
    }

    static public double sqroot(double a)
    {
        return Math.sqrt(a);    
    }

    static public double squared(double a)
    {
        return Math.pow(a, 2); 
    }

    static public int factorial(double a)
    {
        int z = (int) Math.round(a);
        if(z == 0)
            return 1;
        else
            return (z * factorial(z-1)); 
    }

    static public double varExponent(double a, double b)
    {
        return Math.pow(a, b); 
    }

    static public double inverse(double a)
    {
        return 1/a; 
    }

    static public double switchSign(double a)
    {
        return -a; 
    }






}