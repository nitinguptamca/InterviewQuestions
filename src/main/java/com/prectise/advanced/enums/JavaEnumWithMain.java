package com.prectise.advanced.enums;

// Can have a main method as well
// and it will work as well
public enum JavaEnumWithMain {

    JAVA, SCRIPT;

    // can also have a main method
    public static void main(String[] args) {
        System.out.println(JavaEnumWithMain.JAVA);
        System.out.println("Complicated Enum");
    }
}
