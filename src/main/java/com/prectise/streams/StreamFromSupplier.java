package com.prectise.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFromSupplier {

    public static void main(String[] args) {
        Random rand = new Random();
        Stream<Integer> empStream = Stream.generate( rand::nextInt ).limit(4);
        empStream.forEach(System.out::println);
    }
}
