package com.prectise.advanced.inheritance;

class Animal {
    void jump() { System.out.println("Animal"); }
}
class Cat extends Animal {
    void jump(int a) { System.out.println("Cat"); }
}
class Rabbit extends Animal {
    void jump() { System.out.println("Rabbit"); }
}
class Circus {
    public static void main(String args[]) {
        Animal cat = new Cat();
        Rabbit rabbit = new Rabbit();
        Cat caaaa= new Cat();
        int a =10;
        cat.jump();
     //   cat.jump(a);  /CE
        caaaa.jump(a);
        rabbit.jump();
    }
}


class Vehicle{
    String type ="4W";
    int maxSpeed =100;
    Vehicle(String type , int maxSpeed){
        this.maxSpeed=maxSpeed;
        this.type=type;
    }
    Vehicle(){}
}
class Car extends Vehicle{
    String trans;

    public Car(String trans) {
        this.trans = trans;
    }

    public Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this.trans = trans;
    }
}
public class Tersting {
    public static void main(String[] args) {
        Car c1 = new Car("sdfs");
        Car c2 = new Car("ds",234,"sd");
    }
}


class Flower {
    public void fragrance() {System.out.println("Flower"); }
}
class Rose {
    public void fragrance() {System.out.println("Rose"); }
}
class Lily {
    public void fragrance() {System.out.println("Lily"); }
}
class Bouquet {
    public void arrangeFlowers() {
        //Flower f1 = new Rose();  //CE
      //  Flower f2 = new Lily();  //CE
      //  f1.fragrance();
    }
}

interface Movable {
    void move();
}

class Person implements Movable {
    public void move() { System.out.println("Person move"); }
}
class Vehicle1 implements Movable {
    public void move() { System.out.println("Vehicle move"); }
}
class Test {
    void walk(Person movable) {
 movable.move();
}
}