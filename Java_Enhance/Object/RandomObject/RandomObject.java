/**Random Object example
*@author keviness
*@version 2020/10/19
*/

import java.util.*;
import java.security.SecureRandom;

public class RandomObject
{
    public static void main(String[] args)
    {
        //SecureRandom
        SecureRandom srd = new SecureRandom();
        System.out.println("The secure random: " + srd.nextInt());

        Random rd = new Random();
        int[] array = new int[5];
        int value = 0;
        int index = 0;
        for (int j=0; j<array.length; j++)
        {
            array[j] = -1;
        }

        while (index<array.length)
        {
            value = rd.nextInt(6);
            if (!IsInArray(array, value))
            {
                array[index] = value;
                index++;
            }
        }

        //show the array content
        for (int element : array)
        {
            System.out.println(element);
        }
    }

    public static boolean IsInArray(int[] array, int value)
    {
        for (int element : array)
        {
            if (element == value)
            {
                return true;
            }
        }
        return false;
    }
}