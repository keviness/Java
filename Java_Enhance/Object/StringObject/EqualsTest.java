/**Equals example: override equals method
*@author keviness
*@version 2020/10/8
*/

import java.util.*;

public class EqualsTest
{
    public static void main(String[] args)
    {
        Test a = new Test(2020, 10, 8);
        Test b = new Test(2020, 10, 8);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

class Test
{
    private int year;
    private int month;
    private int day;

    public Test(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean equals(Object obj)
    {
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;

        if (obj instanceof Test)
        {
            Test t = (Test)obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;

            if (year1==year2 && month1==month2 && day1==day2)
            {
                return true;
            }
        }
        return false;
    }
}