package com.prectise.advanced.FlowControl;

public class FlowControlTesting1 {

    static void foo(int... x) {
        //  A. foreach( x ) System.out.println(z);
        // B.
        for (int z : x) System.out.println(z);
        // C. while( x.hasNext() ) System.out.println( x.next() );
        // D.
        for (int i = 0; i < x.length; i++) System.out.println(x[i]);


    }


    public static void main1(String[] args) {
        FlowControlTesting1 flowControlTesting1 = new FlowControlTesting1();
        Object obj = new int[]{1, 2, 3};
        int[] someArray = (int[]) obj;
        for (int i : someArray) System.out.print(i + " ");
    }

    public static void go() {
        String o = "";
        z:
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 2; y++) {
                if (x == 1) break;
                if (x == 2 && y == 1) break z;
                o = o + x + y;
                System.out.println(o);
            }
        }
        System.out.println(o);
    }


    public static void main(String[] args) {
       // go();
        for (int i = 0; i <= 10; i++) {
            if (i > 6) break;
        }
        // System.out.println(i);//CE


    }
}
