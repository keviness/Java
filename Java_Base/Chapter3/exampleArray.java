import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * This program demonstrate Array
 * @author kevin
 * @version 2020/2/26
*/
import java.util.*;
import java.lang.*;
public class exampleArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to draw:");
        int k = in.nextInt();

        System.out.println("What\'s the highest do you want to draw:");
        int n = in.nextInt();
        int[] number = new int[n];
        for (int i=0; i<number.length; i++)
        {
            number[i] = i+1;
        }

        int[] result = new int[k];
        for (int i=0; i<result.length; i++)
        {
            int r = (int)(Math.random()*n);
            result[i] = number[r];
            number[r] = number[n-1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("The numbers you can draw:");
        for (int value : result)
        {
            System.out.println(value);
        }
    }
}