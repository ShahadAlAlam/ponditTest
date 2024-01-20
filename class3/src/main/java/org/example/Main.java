package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(hammingWeight(00000000000000000000000000001011));
        int n = 0010011;

        String s = Integer.toBinaryString(n);
        System.out.println(s);
        System.out.println(n & 1);
        n = n >> 1;
        s = Integer.toBinaryString(n);
        System.out.println(s);
    }

    public static int hammingWeight(int n) {
        int sumInt = 0;
        String s =  Integer.toBinaryString(n).replace("0","");
        for (char a: s.toCharArray()) {
            sumInt += Integer.parseInt(String.valueOf(a));
        }
        return sumInt;
    }
}