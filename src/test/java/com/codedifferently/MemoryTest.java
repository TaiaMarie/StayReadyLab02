package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    
    Memory mem;
    public void constructor()
    {
        this.mem = new Memory();
    }
    @Test
    public void testIsClear()
    {
        //Given
        mem.setVal(5);
        mem.isClear();

        //When
        double expected = 0;
        double actual = mem.getVal();

        //Then
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testgetStat()
    {
        //Given
        mem.isClear();
        
        //When
        boolean expected = mem.getStat();

        //Them
        Assert.assertEquals(expected, true);
    }
    
    @Test
    public void testVal()
    {
        //Given
        mem.setVal(7);

        //When
        double expected = 7;
        double actual = mem.getVal();

        //Then
        Assert.assertEquals(expected, actual, 0);

    }
}