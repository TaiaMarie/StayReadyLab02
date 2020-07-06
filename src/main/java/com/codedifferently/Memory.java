package com.codedifferently;

public class Memory 
{
    private boolean isClear = true;
    private double val = 0;

    public void isClear()
    {
        this.val = 0;
        this.isClear = true;
    }
    public void notClear()
    {
        this.isClear = false;
    }
    public boolean getStat()
    {
        return this.isClear;
    }
    public void setVal(double n)
    {
        this.val = n;
    }
    public double getVal()
    {
        return this.val;
    }
    public void display()
    {
        System.out.println(this.getVal());
    }
    


    
}