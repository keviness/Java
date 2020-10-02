/**IO exception example: input exception
*@author keviness
*@version 2020/9/29
*/

import java.util.*;

public class IOException
{
    public static void main(String[] args)
    {
        TestIOException testObj = new TestIOException();
        testObj.test();
    }
}

class TestIOException
{
    public void test()
    {
        Scanner in  = null;
        try
        {
            in = new Scanner(System.in);
            System.out.println("Enter the number:");
            int input = in.nextInt();
            System.out.println("The input is:" + input);
        }
        catch (InputMismatchException e)
        {
            System.out.println("The input is error!");
        }
    }
}