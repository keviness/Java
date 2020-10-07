/**ndArray example
*@author keviness
*@version 2020/10/7
*/

import java.util.*;

public class ndArray
{
    public static void main(String[] args)
    {
        int Month = 5;
        int Week = 7;
        Scanner in = new Scanner(System.in);
        double[][] array = new double[Month][Week];
        System.out.println("Enter the values");
        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<array[i].length; j++)
            {
                System.out.printf("Enter the %d - %d value:",i+1, j+1);
                array[i][j] = in.nextDouble();
            }
        }

        System.out.println("The result:");
        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<array[i].length; j++)
            {
                System.out.printf("The %d - %d : %f \n",i+1, j+1, array[i][j]);
            }
        }
    }
}