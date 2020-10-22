/**Enumerate Object example
*@author keviness
*@version 2020/10/21
*/

import java.util.*;

public class EnumerateObject {
    public static void main(String[] args) {
        Weekday day = Weekday2.SUN;
        System.out.println("The index: "+day.ordinal());  //return the index of constant value
        System.out.println("The name: "+day.name());  //return the enum obj's name
        
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        //switch statements
        switch(day) {
        case MON:
        case TUE:
        case WED:
        case THU:
        case FRI:
            System.out.println("Today is " + day + ". Work at office!");
            break;
        case SAT:
        case SUN:
            System.out.println("Today is " + day + ". Work at home!");
            break;
        default:
            throw new RuntimeException("cannot process " + day);
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


enum Weekday2 {
    MON(1, "Monday"), TUE(2, "Tuesday"), WED(3, "Wednesday"), THU(4, "Thursday"), FRI(5, "Friday"), SAT(6, "Saturday"), SUN(0, "Sunday");

    public final int dayValue;
    private final String chinese;

    private Weekday2(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
