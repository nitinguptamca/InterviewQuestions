package com.prectise.basics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * JavaMethodOverriding
 */
public class JavaMethodOverriding {

    public static void main(String[] args) {
        AA aa = new BB();
        try {
            System.out.println(aa.hairy(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 1.
// Not a valid override
class AA {
    protected String hairy(int p) throws RuntimeException  { return null; }
}

class BB extends AA{
    @Override
     public String hairy(int p) throws NullPointerException  { return null;}
}

// END OF 1

class Animal {

    private void move() {
        // Animal moving code...
    }
   protected static void sleep() {
        // animal sleeping code...
    }
}

class Dog extends Animal {

    public void move() {
        // Dog moving code...
    }
   public static void sleep() {
        // Dog sleeping code...
    }
}