package com.codedifferently;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class TrigTest 
{
    Trig trig;
    public void construct()
    {
        this.trig = new Trig();
    }

    @Test
    public void sineTest()
    {
        //Given
        double n = 1200;

        //When
        double expected = Math.sin(n);
        double actual = Trig.sine(n);

        //Then
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void cosTest()
    {
        //Given
        double n = 1200;

        //When
        double expected = Math.cos(n);
        double actual = Trig.cos(n);

        //Then
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void tanTest()
    {
        //Given
        double n = 1200;

        //When
        double expected = Math.tan(n);
        double actual = Trig.tan(n);

        //Then
        Assert.assertEquals(expected, actual, 0);
    }
    
}