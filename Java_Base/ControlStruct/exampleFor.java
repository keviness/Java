/**
 * This programe demonstrate the for loop
 * @author kevin
 * @version 2020/2/25
*/
import java.util.*;
public class exampleFor
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do your want draw:");
        int k = in.nextInt();
        System.out.println("How highest the number you draw:");
        int num = in.nextInt();
        int lottery = 1;
        for (int i=1; i<k; i++)
        {
            lottery = lottery * ((num-i+1)/i);
        }
        System.out.println("The lottery is 1 in: "+lottery);
    }
}