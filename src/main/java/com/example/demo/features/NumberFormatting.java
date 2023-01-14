package com.example.demo.features;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {

    public static void formatNumber () {
        NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
        /*
            output :
            1K
            100K
            1M
         */

        NumberFormat fmt2 = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
        /*
            1 thousand
            100 thousand
            1 million
         */
        System.out.println(fmt.format(1000));
        System.out.println(fmt.format(100000));
        System.out.println(fmt.format(1000000));
    }
}
