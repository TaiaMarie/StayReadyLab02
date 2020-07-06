package com.codedifferently;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SciCalculator
{

static private double input = 0;
static private String output = " ";

static Scanner scanner = new Scanner(System.in);
static Memory mem = new Memory();
static Trig trig = new Trig();
static Display display = new Display();

    public static void main( String[] args )
{
        System.out.println( "It's a calculator!" );
        System.out.println( "\nChoose a display\n" );
        System.out.println( "\n1:Binary 2:Octal 3:Decimal 4:Hexadecimal\n" );

    try 
    {
        int m = scanner.nextInt();
        display.switchDisplayMode(m);
    } 
    catch (Exception e) 
    {
        System.out.println("Cancelled");
    }
}
static public void getNewVal()
{
    //while(mem.getVal() == 0 && mem.getStat() == true)
}
}
