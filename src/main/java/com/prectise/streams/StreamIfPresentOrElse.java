package com.prectise.streams;

import java.util.Optional;
import java.util.stream.Stream;

import static com.prectise.streams.Employee.SOME;

public class StreamIfPresentOrElse {

    public static void main(String[] args) {

        // The second argument to ifPresentOrElse must be a Runnable
        // Stream
        //     .of(0)
        //     .findAny()
        //     .or(
        //         () -> Optional.of(1)
        //     )
        //     .ifPresentOrElse(
        //         System.out::println,
        //         i -> System.out.println(i) );

        // Correct Form
        // prints '0'
        Stream
            .of(0)
            .findAny()
            .or(
                () -> Optional.of(1)
            )
            .ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Empty") );

        Stream.of(SOME).findAny().or( () -> Optional.of(new Employee("nitin",1)))
                .ifPresentOrElse(
                        System.out::println,
                        ()-> System.out.println("Empty")
                );

    }
}
