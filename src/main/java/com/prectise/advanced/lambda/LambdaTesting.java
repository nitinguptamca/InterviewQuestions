package com.prectise.advanced.lambda;

interface SMA {
    public void m1();
}

interface Interf {
    public int square(int x);
}

class Test {
    public static void main(String[] args) {
        Interf i = x -> x * x;
        System.out.println(i.square(5));
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

class Testing2{

    public static void main(String[] args) {
        Runnable m2 = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Parents Thread");
            }
        };
        Thread t = new Thread(m2);
        t.start();
        Thread t1 =new Thread(new MyRunnable());
        t1.start();
    }
}

public class LambdaTesting {
    int x = 10;

    public void m2() {
        int y = 20;
        SMA sma = () -> {
            System.out.println(this.x); //10
            System.out.println(y);// 20
            x = 888;
            //y = 999; //CE
        };
        // i.m2();
        /// y = 777;
    }

    //
    public static void main(String[] args) {
        LambdaTesting t = new LambdaTesting();
        t.m2();
    }
}
