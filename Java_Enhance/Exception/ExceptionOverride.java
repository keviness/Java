/**Exception override example
*@author keviness
*@version 2020/9/30
*/

import java.util.*;

public class ExceptionOverride
{
    public static void main(String[] args)
    {
        Exception original = null;
        try 
        {
            Integer.parseInt("abc");
        }
        catch (Exception e)
        {
            System.out.println("Catched");
            original = e;
            throw e;
        }
        finally
        {
            IllegalArgumentException e = new IllegalArgumentException();
            if (original == null)
                e.addSuppressed(original);
            System.out.println("finally!");

            //throw new IllegalArgumentException();
            throw e;
        }
    }
}