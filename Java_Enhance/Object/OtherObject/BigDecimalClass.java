/**BigDecimal class example
*@author keviness
*@version 2020/10/25
*/

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalClass
{
    public static void main(String[] args)
    {
        BigDecimal a = new BigDecimal("123.45234");
        BigDecimal b = new BigDecimal("345.6745678");
        System.out.println("a.scale(): "+a.scale());
        System.out.println("b.scale(): "+b.scale());
        System.out.println("b.setScale(): "+b.setScale(4, RoundingMode.HALF_UP));
        System.out.println("b.steScale(): "+b.setScale(4, RoundingMode.DOWN));

        //stripTrailingZeros()
        BigDecimal c = new BigDecimal("123.340000");
        BigDecimal d = new BigDecimal("345.234000");
        BigDecimal g = new BigDecimal("1234.000");
        System.out.println("c.scale(): "+c.scale());
        System.out.println("d.scale(): "+d.scale());
        BigDecimal e = c.stripTrailingZeros();
        BigDecimal f = d.stripTrailingZeros();
        System.out.println("e: "+e);
        System.out.println("e.scale(): "+e.scale());
        System.out.println("f: "+f);
        System.out.println("f.scale(): "+f.scale());
        System.out.println("g: "+g);
        System.out.println("g.stripTrailingZeros(): "+g.stripTrailingZeros());
        System.out.println("g.scale(): "+g.scale());

        //compareTo()
        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("123.45600");
        System.out.println(d1.equals(d2)); // false
        System.out.println(d1.equals(d2.stripTrailingZeros())); // true
        System.out.println(d1.compareTo(d2)); // 0
    }
}