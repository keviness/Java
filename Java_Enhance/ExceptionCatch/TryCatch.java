/**Try Catch example: catch exception
*@author keviness
*@version 2020/9/28
*/

import java.util.*;

public class TryCatch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the a:");
        int a = scan.nextInt();
        System.out.println("Enter the b:");
        int b = scan.nextInt();

        CatchException test = new CatchException(a, b);
        test.test();
    }
}

class CatchException
{
    public int a;
    public int b;

    public CatchException(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void test()
    {
        try 
        {
            divid(this.a, this.b);
        }
        catch (Exception e)
        {
            System.out.println("The error in divid");
        }
    }

    private void divid(int a, int b)
    {
        System.out.println("The value:" + a/b);
    }
}