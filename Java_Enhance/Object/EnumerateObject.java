/**Enumerate Object example
*@author kevin
*@version 2020/10/21
*/
import java.util.*;

public class EnumerateObject {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        System.out.println("The index: "+day.ordinal());  //return the index of constant value
        System.out.println("The name: "+day.name());  //return the enum obj's name
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
    }
}

enum Weekday {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    public final int dayValue;

    private Weekday(int dayValue) {
        this.dayValue = dayValue;
    }
}