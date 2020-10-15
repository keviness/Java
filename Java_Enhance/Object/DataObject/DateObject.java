/**Data object example
*@author keviness
*@version 2020/10/15
*/

import java.util.*;
import java.text.SimpleDateFormat;

public class DateObject
{
    public static void main(String[] args) throws Exception
    {
        Date nowTime = new Date();
        SimpleDateFormat dateStrFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

        String timeStr = dateStrFormat.format(nowTime);
        //System.out.println("The time is: " + dateStrFormat);
        System.out.println("The time string is: " + timeStr);

        String date = "2020-10-15 23:40:12 234";
        SimpleDateFormat timeFormat = new SimpleDateFormat("YYYY-MM-dd HH:MM:SS SSSS");
        Date time = timeFormat.parse(date);
        System.out.println("The time: " + time);

        //millis seconds
        long start = System.currentTimeMillis();
        for (int i=0; i<100; i++)
        {
            //System.out.println("The "+i);
        }
        long end = System.currentTimeMillis();
        System.out.println("The time used: "+(end-start));
    }
}