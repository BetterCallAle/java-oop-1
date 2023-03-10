package org.lessons.java.shop;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Products orange = new Products("Arancia", "Buonissima arancia", 2.99, 4);

        orange.setPrice(3.99);

        System.out.println(orange.getCode());

        System.out.println(orange.getFullName());

        String decimalFormat = new DecimalFormat("0.00").format(orange.getFullPrice());
        System.out.println(decimalFormat);
    }
}
