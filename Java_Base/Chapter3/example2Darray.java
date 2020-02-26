/**
 * This program demonstrate the 2Darray
 * @author kevin
 * @version 2020/2/26
*/
import java.util.*;
public class example2Darray
{
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        double[] interestRATE = new double[NRATES];
        for (int i=0; i<interestRATE.length; i++)
        {
            interestRATE[i] = (STARTRATE+i)/100.0;
        } 

        double[][] balances = new double[NYEARS][NRATES];
        for (int i=0; i<balances[0].length; i++)
        {
            balances[0][i] = 1000;
        }
        for (int i=1; i<balances.length; i++)
        {
            for (int j=0; j<balances[i].length; j++)
            {
                double oldbalance = balances[i-1][j];
                double interest = oldbalance*interestRATE[j];
                balance[i][j] = oldbalance + interest;
            }
        }

        for (double row : interestRATE)
        {
            System.out.printf("%9.0f%%", row);
        }
        System.out.println();

        for (balances[] row : balances)
        {
            for (double number : row)
            {
                System.out.printf("%10.2f", number);
            }
            System.out.println();
        }
    }
}