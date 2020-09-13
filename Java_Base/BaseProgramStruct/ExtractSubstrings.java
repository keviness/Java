/**
*Extract substrings
*@author keviness
*@version 2020/9/13
*/

import java.util.*;
public class ExtractSubstrings
{
    public static void main(String[] args)
    {
        int count = 1;
        String text = "to do or not to do kevinss";
        char separator = ' ';
        int index = 0;
        while ((index = text.indexOf(separator, index)) != -1)
        {
            index++;
            count++;
        }
        /*
        do
        {
            index++;
            count++;
            index = text.indexOf(separator, index);
        }
        while (index != -1);
        */

        index = 0;
        int endindex = 0;
        String[] substr = new String[count];
        for (int i=0; i<count; i++)
        {
            endindex = text.indexOf(separator, index);
            if (endindex == -1)
            {
                substr[i] = text.substring(index);
            }
            else
            {
                substr[i] = text.substring(index, endindex);
            }
            index = endindex+1;
        }
        //display the substr content
        for (String element : substr)
        {
            System.out.println(element);
        }
    }
}