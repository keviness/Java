/**Record Object example
*@author keviness
*@version 2020/10/23
*/

import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class recordObject {
    public static void main(String[] args) {
        /*
        //Reord Object
        Point p = new Point(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
        */

        //BigInteger Object
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);

        //BigDecimal Object
        BigDecimal d1 = new BigDecimal("123.456789");
        BigDecimal d2 = d1.setScale(4, RoundingMode.HALF_UP); // 123.4568
        BigDecimal d3 = d1.setScale(4, RoundingMode.DOWN); // 123.4567
        System.out.println(d2);
        System.out.println(d3);
    }
}

//class record Point(int x, int y) {}
