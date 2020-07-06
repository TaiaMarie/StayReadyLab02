package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {

    Display display;
    public  void constructor()
    {
        this.display = new Display();
    }
    @Test
    public void Display()
    {
        //Given
        String mode = "Hexadecimal";

        //When
        display.Display(mode);
        String expected = mode;
        String actual = display.getDisplay();

        //Then
        Assert.assertEquals(expected, actual);

    }
    
}