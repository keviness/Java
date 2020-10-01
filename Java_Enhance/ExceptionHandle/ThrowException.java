/**Throw Exception example
*@author keviness
*@version 2020/9/30
*/

import java.util.*;

public class ThrowException
{
    public static void main(String[] args)
    {
        try 
        {
            process2();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    static void process2()
    {
        try
        {
            process1();
        }
        //捕获参数类型错误
        catch (IllegalArgumentException e)  
        {
            throw new IllegalArgumentException(e);   // 参数是否为e
        }
    }

    static void process1()
    {
        throw new NullPointerException();
    }
}

