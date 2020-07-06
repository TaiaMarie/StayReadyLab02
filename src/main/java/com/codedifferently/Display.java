package com.codedifferently;


public class Display extends SciCalculator
{   
    //constructor
     String display;
    
    
    public void Display(String display)
    {
        this.display = display;
    }
    public String getDisplay()
    {
        return this.display;
    }


    public void switchDisplayMode(int mode)
    {
        switch(mode)
        {
            case 1: 
                Display("Binary");
                break;
            case 2:
                Display("Octal");
                break;
            case 3:
                Display("Decimal");
                break;
            case 4:
                Display("Hexadecimal");
             break;

             default:
             System.out.println("0");
            
        }

    }

   
    
}