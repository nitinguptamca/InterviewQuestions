package com.prectise.advanced.predicate;

import java.util.*;
import java.util.function.*;

public class TestPredicate {
    public boolean test(Integer I) {
        if (I > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        IntFunction<Boolean> ss = (int i) -> {
            if (i > 10)
                return true;
            else
                return false;
        };

        Predicate<Integer> p = I -> (I > 10);
        System.out.println(p.test(100)); //true
        System.out.println(p.test(7)); //false

        Predicate<Collection> ssp = c -> c.isEmpty();
        /**
         * Predicate joining
         * It’s possible to join predicates into a single predicate by using the following methods.
         * and()
         * or()
         * negate()
         * these are exactly same as logical AND ,OR complement operator
         */

        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("The Numbers Greater Than 10:");
        m1(p1, x);
        System.out.println("The Even Numbers Are:");
        m1(p2, x);
        System.out.println("The Numbers Not Greater Than 10:");
        m1(p1.negate(), x);
        System.out.println("The Numbers Greater Than 10 And Even Are:â€");
        m1(p1.and(p2), x);
        System.out.println("The Numbers Greater Than 10 OR Even:â€ ");
        m1(p1.or(p2), x);
    }

    public static void m1(Predicate<Integer> p, int[] x) {
        for (int x1 : x) {
            if (p.test(x1))
                System.out.println(x1);
        }
    }
}

interface function<T, R> {
    public R apply(T t);
}

/**
 * Function
 * Functions are exactly same as predicates except that functions can return any type of result but
 * function should(can)return only one value and that value can be any type as per our requirement.
 * To implement functions oracle people introduced Function interface in 1.8version.
 * Function interface present in java.util.function package.
 * Functional interface contains only one method i.e., apply()
 */
class Test {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Durga"));
        System.out.println(f.apply("Soft"));
    }
}

