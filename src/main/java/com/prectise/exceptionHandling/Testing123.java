package com.prectise.exceptionHandling;

import java.io.*;

class Vehicle {
    String type="4W";
    int maxspeed =100;

    public Vehicle(String type, int maxspeed) {
        this.type = type;
        this.maxspeed = maxspeed;
    }

    public Vehicle() {
    }
}

class Car extends Vehicle{
    String tans;

    public Car(String tans) {
        this.tans = tans;
    }

    public Car(String type, int maxspeed, String tans) {
        super(type, maxspeed);
        this.tans = tans;
    }
}



public class Testing123 {
    public static void main(String[] args) {

        System.out.println(returnValue(1 ,0));

        System.out.println("main");

    }

    public static int returnValue(int v1, int v2){
        try{
            method();
        }
        catch(ArithmeticException e){
           throw new RuntimeException(e);
        }
        catch(RuntimeException e){
           throw  new RuntimeException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("testing");
        }
        return v1;
    }

    public static void method( ) throws NullPointerException, FileNotFoundException {
       throw new NullPointerException();
    }
}
