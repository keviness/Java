/**
*The array example
*@author keviness
*@version 2020/9/12
*/
import java.util.*;

public class Array
{
    public static void main(String[] args)
    {
        float[][] temperature = new float[10][365];

        for (int i=0; i<temperature.length; i++)
        {
            for (int j=0; j<temperature[i].length; j++)
            {
                temperature[i][j] = (float)(45*Math.random()-10);
            }
        }

        for (int i=0; i<temperature.length; i++)
        {
            float total = 0.0f;
            for (int j=0; j<temperature[i].length; j++)
            {
                total += temperature[i][j];
            }
            System.out.println("The month: "+(i+1)+" temperature: "+(total/temperature[i].length));
        }
    }
}