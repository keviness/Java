/**Array example: Get random numbers
*@author keviness
*@version 2020/10/5
*/

import java.util.*;

public class GetRandomNumber
{
    public static void main(String[] args)
    {
        System.out.println("How many random numbers do you want:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("What is the highest number do you want:");
        int highest = in.nextInt();

        int[] number = new int[highest];
        int[] random = new int[num];

        for (int i=0; i<number.length; i++)
        {
            number[i] = i+1;
        }

        for (int i=0; i<random.length; i++)
        {
            int r = (int)(Math.random()*highest);
            random[i] = number[r];

            number[r] = number[highest-1];  //Don't let number repeat!
            highest--;
        }

        //Show the random result
        System.out.println("The random result:");
        for (int ele : random)
        {
            System.out.println(""+ele);
        }
    }
}
