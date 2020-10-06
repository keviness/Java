/**Array CopyOf example
*@author keviness
*@version 2020/10/6
*/

import java.util.*;

public class ArrayCopyOf
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Fill the Array please");
        double[] scores = new double[5];
        for (int i=0; i<scores.length; i++)
        {
            System.out.printf("Enter the %d number:", i+1);
            scores[i] = in.nextDouble();
        }
        System.out.println("The original array:");
        for (double e : scores)
            System.out.println(e);

        double[] copyScores = Arrays.copyOf(scores, scores.length);
        System.out.println("The copy array:");
        for (double e : copyScores)
            System.out.println(e);
    }
}