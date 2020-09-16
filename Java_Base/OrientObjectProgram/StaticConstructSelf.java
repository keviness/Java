/**
*Static example: construct class self, and get a common object field
*@author keviness
*@version 2020/9/16
*/

import java.util.*;

public class StaticConstructSelf
{
    public static void main(String[] args)
    {
        Test a = Test.getAA();
        a.ShowIndex();
        a.SetIndex(10);
        a.ShowIndex();
        Test b = Test.getAA();
        b.ShowIndex();
    }
}

class Test
{
    private int index = 0;
    private static Test aa = new Test();

    private Test()
    {
    }

    public static Test getAA() //static无法省略，其属于类方法，只能由类调用
                               //此类中构造函数已经为private成员，其他类无法通过实例变量调用。
    {
        return aa;
    }

    public void SetIndex(int index)
    {
        this.index = index;
    }

    public void ShowIndex()
    {
        System.out.println("The index:"+this.index);
    }
}