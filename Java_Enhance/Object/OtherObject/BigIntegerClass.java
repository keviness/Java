/**BigInteger class example
*@author keviness
*@version 2020/10/25
*/

import java.util.*;
import java.math.BigInteger;

public class BigIntegerClass
{
    public static void main(String[] args)
    {
        BigInteger bi = new BigInteger("1234890");
        BigInteger bi2 = new BigInteger("246812345");
        System.out.println("The bi value: "+bi);
        System.out.println("The bi.pow(2) = "+ bi.pow(2));
        System.out.println("The sum value: "+bi.add(bi));
        System.out.println("bi + bi2 = "+bi.add(bi2));
        //System.out.println("bi2 - bi = "+bi2.substract(bi));
        System.out.println("bi2/bi = "+bi2.divide(bi));
        //System.out.println("bi2 * 10 = " + bi2.multiply(10));

        //BigInteger -> basic data type
        System.out.println("->short: "+bi.shortValue());
        //System.out.println("->short exact: "+bi.shortValueExact());
        System.out.println("->byte: "+bi2.byteValue());
        System.out.println("->long: "+bi.longValue());
        System.out.println("->long exact: "+bi.longValueExact());
        System.out.println("->int: "+bi2.intValue());
        System.out.println("->float: "+bi2.floatValue());
        System.out.println("->double: "+bi.doubleValue());
    }
}