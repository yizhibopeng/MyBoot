package com.sysyu.cmis;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args)
    {
        System.out.println(0.2 + 0.1);
        System.out.println(0.3 - 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);
        BigDecimal a = new BigDecimal("0.2");
        BigDecimal b = new BigDecimal("0.1");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        BigDecimal c = new BigDecimal("10");
        BigDecimal d = new BigDecimal("3");
        System.out.println(c.divide(d,3, RoundingMode.HALF_UP));

    }
}
