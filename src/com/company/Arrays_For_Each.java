package com.company;

public class Arrays_For_Each {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "Prizvuwe";
        strings[1] = "Im9";
        strings[2] = "Pobatkovi";
        for (String dani : strings) {
            System.out.println(dani);
        }
        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        int sum = 0;
        int[] num = {1, 4, 3, 6, 7};
        for (int i : num) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println();
        int sum1 = 0;
        for (int i = 0; i < num.length; i++) {
            sum1 = sum1 + i;
        }
        System.out.println(sum);
    }
}
