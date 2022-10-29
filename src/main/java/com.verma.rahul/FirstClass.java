package com.verma.rahul;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FirstClass {

    public static void main(String[] args)
    {

        //Stream of Array
        String[] arr = new String[]{"a", "b", "c", "a", "D"};
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(n -> System.out.println(n));

        System.out.println("Unique Element is " + Arrays.stream(arr) .distinct().count());

        //Stream Builder
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

        //Stream.iterate()
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(4);
        streamIterated.forEach(n -> System.out.println(n));


        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(n -> System.out.println(n));

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(n -> System.out.println(n));

        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(n -> System.out.println(n));

        Path path = Paths.get("C:\\data\\projects\\working\\vermarahul86\\Streams\\src\\main\\resources\\file.txt");
        try {
            Stream<String> streamOfStrings = Files.lines(path);
            streamOfStrings.forEach(n -> System.out.println(n));

            Stream<String> streamWithCharset =
                    Files.lines(path, Charset.forName("UTF-8"));
            streamWithCharset.forEach(n -> System.out.println(n));

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> list = Arrays.asList("abc1","abc2", "abc3");
        int counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });
        stream.forEach(n -> System.out.println(n));


    }
    private static long counter;

    private static void wasCalled() {
        counter++;
    }
}
