/**Exception extends example
*@author keviness
*@version 2020/10/2
*/

import java.util.*;

public class ExceptionExtends
{
    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        try
        {
            aa.testFunction();
        }
        catch (ErrorA errora)
        {
            System.out.println("Catch Error A!");
        }
        catch (ErrorB errorb)
        {
            System.out.println("Catch Error B");
        }
        
        try
        {
            bb.testFunction();
        }
        catch (ErrorA errora)
        {
            System.out.println("Catch Error A!");
        }
        catch (ErrorB errorb)
        {
            System.out.println("Catch Error B");
        }
    }
}

class A
{
    public void testFunction() throws ErrorA, ErrorB, ErrorC
    {
        System.out.println("The A class function running!");
        throw new ErrorC("Error C");
        //throw new ErrorB("Error B");
    }
}

class B extends A
{
    public void testFunction() throws ErrorB, ErrorA
    {
        System.out.println("The B class function running!");
        throw new ErrorB("Error B");
    }
}

class ErrorA extends Exception
{
    public ErrorA(String message)
    {
        super(message);
    }
}

class ErrorB extends Exception
{
    public ErrorB(String message)
    {
        super(message);
    }
}

class ErrorC extends ErrorA
{
    public ErrorC(String message)
    {
        super(message);
    }
}