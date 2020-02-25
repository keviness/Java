/**
 * This program demonstrate the <code>while</code> loop
 * @author kevin
 * @version 2020/2/25
*/
import java.lang.*;
import java.util.*;
public class exampleWhile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("How much money do you need retire:");
        double goal = in.nextDouble();
        System.out.println("How much money do you contribute every year:");
        double payment = in.nextDouble();
        System.out.println("How much the interest in %:");
        double interest = in.nextDouble();
        int year = 0;
        double balance = 0;
        while (balance < goal)
        {
            balance += payment;
            balance += balance * interest;
            year++;
        }
        System.out.printf("The years %d you can retire %g money", year, balance);
    }
}