/**Wrapper class exaample
*@author keviness
*@version 2020/10/13
*/

import java.util.*;

public class wrapperClass
{
    public static void main(String[] args)
    {
        //Auto Boxing and Auto unboxing
        
        int i = 10;
        Integer value = Integer.valueOf(i);
        System.out.println("The integer value:" + value);

        Integer integer = Integer.valueOf("1000");
        int intvalue = integer.intValue();
        System.out.println("The Integer: " + integer);
        System.out.println("The y: " + intvalue);

        Integer y = 20;
        System.out.println("The y:" + y);

        //int x = new Integer("40");    //out time!
        //System.out.println("The x:" + x);

        //String to numbers
        Integer a = Integer.parseInt("123");
        System.out.println("a: " + a);
        Double b = Double.parseDouble("23.456");
        System.out.println("a+b: " + (a+b));
        Float c = Float.parseFloat("45.12");
        System.out.println("a+b+c: "+ (a+b+c));
        Long d = Long.parseLong("123");
        System.out.println("a+b+c+d: "+ (a+b+c+d));

        /*
        //int type convert  Out time!
        Number num = new Integer("100");
        byte e = num.byteValue();
        System.out.println("e: " + e);
        int f = num.intValue();
        System.out.println("f: " + f);
        */

        Integer g = 128;
        Integer h = 128;
        System.out.println("==" + (g == h));
        System.out.println("object.equals()" + g.equals(h));
    }
}