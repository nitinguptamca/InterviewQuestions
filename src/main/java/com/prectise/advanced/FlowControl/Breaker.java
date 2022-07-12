package com.prectise.advanced.FlowControl;

public class Breaker {
    static String o = "";

    public static void main1(String[] args) {
      //  z:  compile time error
        o = o + 2;
        z:
            for (int x = 3; x < 8; x++) {
                if (x == 4) break;
                if (x == 6) break z;
                o = o + x;
            }
        System.out.println(o);
    }

    public static void main(String[] args) {
        int x = 10;
        int count =0;
        do {
            System.out.println(count++);
             x--;
             } while (x <10);
    }
}
