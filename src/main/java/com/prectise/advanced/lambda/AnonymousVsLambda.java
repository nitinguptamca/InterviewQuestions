package com.prectise.advanced.lambda;

import java.io.*;

class AnonymousClass extends MyRunnable implements Serializable,Closeable{

    private int a=20;
    private int b;

    @Override
    public void close() throws IOException {

    }
    public void close1() throws IOException {

    }
    public void close2() throws IOException {

    }

    Runnable ss = () ->{
      int a=10;
        System.out.println(a);
        System.out.println(this.a);
    };
}

public class AnonymousVsLambda {
}
