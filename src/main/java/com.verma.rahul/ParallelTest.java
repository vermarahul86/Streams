package com.verma.rahul;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelTest {


    public static void main(String[] args){

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(200000);
        Set<Integer> stringSet = streamIterated.collect(Collectors.toSet());
        Instant start1 = Instant.now();
        for(int i=0;i<stringSet.size();i++){
            //Do nothing just keep iterating.
        }
        Instant end1 = Instant.now();
        System.out.println("\n"+Duration.between(start1, end1));

        Stream<Integer> parallelStream  = stringSet.parallelStream();
        Instant start = Instant.now();
        parallelStream.forEach(n -> System.out.print(n));
        Instant end = Instant.now();
        System.out.println("\n"+Duration.between(start, end));

//PT0.0069997S
        //0.7179872S
    }
}
