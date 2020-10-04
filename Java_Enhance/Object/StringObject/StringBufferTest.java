/**String Buffer example
*@author keviness
*@version 2020/10/4 
*/

import java.util.*;

public class StringBufferTest
{
    public static void main(String[] args)
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc ");
        buffer.append("A ");
        buffer.append("B ");
        buffer.append("hello ");
        buffer.insert(0, "keviness ");
        buffer.delete(0, 9);
        System.out.println("buffer:" + buffer.toString());
        buffer.reverse();
        System.out.println("buffer reverse:" + buffer.toString());
        System.out.println("The buffer length:" + buffer.length());
        System.out.println("The a index of the string:"+buffer.indexOf("a"));
    }
}
