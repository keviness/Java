/**AnonymousInnerClass example
*@author keviness
*@version 2020/10/10
*/

import java.util.*;

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        Compute c = new ComputeTest();
        
        RunClass test = new RunClass(100, 200);
        test.mysum(c);
        /*
        test.mysum(new Compute(){
            public int getSum(int a, int b)
            {
                return a + b;              //anonymous inner class
            }
        });
        */
    }
}

interface Compute
{
    public int getSum(int a, int b);
}

class ComputeTest implements Compute
{
    public int getSum(int a, int b)
    {
        return a + b;
    }
}

class RunClass
{
    private int a;
    private int b;
    public RunClass(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void mysum(Compute compute)
    {
        int value = compute.getSum(this.a, this.b);
        System.out.println("The sum result:" + value);
    }
}