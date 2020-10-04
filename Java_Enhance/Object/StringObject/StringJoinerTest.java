/**String Joiner example
*@author keviness
*@version 2020/10/4
*/

import java.util.*;

public class StringJoinerTest
{
    public static void main(String[] args)
    {
        String[] strList = {"hello", ",", "Keviness", "!"};
        String str = String.join(" ", strList);
        System.out.println("The string:" + str);

        String[] names = {"Bob", "Lucy", "Nancy"};
        StringJoiner sj = new StringJoiner(", ", "Hi ", "!");
        for (String name : names)
        {
            sj.add(name);
        }
        System.out.println("The String result:" + sj);
    }
}