/**
*The Math module example
*@author kevin
*@version 2020/9/9
*/
import java.util.*;
//import java.lang.Math;

public class MathClass
{
    public static void main(String[] args)
    {
        int fishCount = 20;
        int fishLength = 10;
        int inchencePerFoot = 12;
        int lengthPerSqrtFoot = 2;
        double radius = 0.0;
        int feet;
        int inches;

        double pondArea = (double)(fishCount*fishLength)/lengthPerSqrtFoot;
        radius = Math.sqrt(pondArea/Math.PI);
        feet = (int)Math.floor(radius);
        inches = (int)Math.round(inchencePerFoot * (radius-feet));

        System.out.println("The pond area: "+pondArea+"\nthe radius: "+radius+
                           "\nThe feet: "+feet+"\nThe inches: "+inches);
            
    }
}