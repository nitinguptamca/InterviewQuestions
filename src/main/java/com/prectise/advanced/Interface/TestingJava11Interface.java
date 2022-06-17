package com.prectise.advanced.Interface;

import com.prectise.advanced.lambda.*;

/**
 * Default method vs multiple inheritance
 * Two interfaces can contain default method with same signature then there may be a chance of
 * ambiguity problem(diamond problem) to the implementation class.to overcome this problem
 * compulsory we should override default method in the implementation class otherwise we get
 * compiletime error.
 */
interface B {
    default void test1() {
        System.out.println(
                "We can’t override object class methods as default methods inside interface otherwise we get" +
                        "compile time error "
        );
    }
}

interface A {
    public static int sum(int a , int b){
        System.out.println("sum =" +a+b);
        return a+b;
    }

    default void test1() {
        System.out.println(
                "We can’t override object class methods as default methods inside interface otherwise we get" +
                        "compile time error "
        );
    }
    default void test2() {
        System.out.println(
                "We can’t override object class methods as default methods inside interface otherwise we get" +
                        "compile time error "
        );
    }
    //compile time error
   // Reason: object class methods are by-default available to every java class hence it’s not required to
   // bring through default methods.

   /* default int hashCode(){
        return 10;
    }*/
}


public class TestingJava11Interface implements A ,B{
    public static void main(String[] args) {
        TestingJava11Interface t = new TestingJava11Interface();
        t.test1();

       // t.sum(10, 20); //CE
      // Test.sum(10, 20); //CE
         A.sum(10, 20);
        /**
         * From 1.8version onwards in addition to default methods we can write static methods also inside
         * interface to define utility functions.
         * Interface static methods by-default not available to the implementation classes hence by using
         * implementation class reference we can’t call interface static
         * methods.we should call interface static methods by using interface name.
         */


    }

    @Override
    public void test1() {
        B.super.test1();
    }

    public void test2() {
        System.out.println(
                "We can’t override object class methods as default methods inside interface otherwise we get" +
                        "compile time error "
        );
    }


}
