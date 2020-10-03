/**StringBulider example
*@author keviness
*@version 2020/10/3
*/

import java.util.*;

public class StringTest
{
    public static void main(String[] args)
    {
        TestToString testA = new TestToString(18, 6);
        String str = testA.toString();
        System.out.println(str);

        AddTest testAdd = new AddTest();
        
        testAdd.adder(12.5)
               .adder(8.9)     //link-operation
               .adder(7.7);
        double value = testAdd.getSum();
        System.out.println("The result:"+value);
        /*
        StringBulider var = new StringBulider(1024);
        var.append("Hi ");
        var.append("keviness ");
        var.append(",");
        var.append("How ");
        var.append("old are ");
        var.append("you!");

        System.out.println(var.toString());
        */
    }
}

class TestToString
{
    private int m;
    private int n;
    public TestToString(int m, int n)
    {
        this.m = m;
        this.n = n;
    }
    public String toString()
    {
        String str = "The string:"+ m/n;
        return str;
    }
}

class AddTest
{
    private double sum;

    public AddTest adder(double m)
    {
        sum += m;
        return this; //only can use this
    }

    public double getSum()
    {
        return this.sum;
    } 
}