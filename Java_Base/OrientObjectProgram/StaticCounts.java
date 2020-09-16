/**
*The static example first: get constructor count
*@author keviness
*@version 2020/9/16
*/

import java.util.*;

public class StaticCounts
{
    public static void main(String[] args)
    {
        int index = 10;
        A aa = new A();
        aa.ShowStatus();
        System.out.println("The constructor:"+aa.getCount());
        A bb = new A(index);
        bb.ShowStatus();
        System.out.println("The constructor:"+bb.getCount());
    }
}

class A
{
    private int i = 0;
    private static int count = 0;

    public A()
    {
        count++;
    }
    public A(int i)
    {
        this.i = i;
        count++;
    }
    public static int getCount()
    {
        return count;
    }
    public void ShowStatus()
    {
        int j = 10;
        System.out.println("The j:"+j);
        System.out.println("The count:"+count+"\nThe i:"+this.i);
    }
}