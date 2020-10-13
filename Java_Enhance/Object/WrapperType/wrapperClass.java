/**Wrapper class exaample
*@author keviness
*@version 2020/10/13
*/

import java.util.*;

public class wrapperClass
{
    public static void main(String[] args)
    {
        int i = 10;
        Integer value = Integer.valueOf(i);
        System.out.println("The integer value:" + value);

        Integer integer = Integer.valueOf("1000");
        System.out.println("The Integer: " + integer);

    }
}