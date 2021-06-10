package com.company.pattern;

public class Circle {
    public static void main(String[] args) {
        int r = 10;
        for (int y = 0; y <= 2 * r; y += 2) {
            int x = (int) Math.round(r - Math.sqrt(2 * r * y - y * y));
            int len = 2 * (r - x);

            for (int i = 0; i <= x; i++) {
                System.out.print(' ');
            }
            System.out.print('*');

            for (int j = 0; j <= len; j++) {
                System.out.print(' ');
            }
            System.out.println('*');

        }
    }
}
