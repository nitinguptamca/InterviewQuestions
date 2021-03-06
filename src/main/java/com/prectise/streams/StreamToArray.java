package com.prectise.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamToArray {
    
    public static void main(String[] args) {
        

        // 1st toArray

        Object[] objs = Stream
                            .of( Employee.SOME )
                            .filter(e -> e.getSalary() < 2000 )
                            .toArray();

        
        // 2nd toArray

        Employee[] empObjs = Stream
                                .of( Employee.SOME )
                                .filter( e -> e.getSalary() < 2000 )
                                .toArray(Employee[]::new);
        System.out.println(Arrays.toString(empObjs));


    }

}
