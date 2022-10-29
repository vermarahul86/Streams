package com.verma.rahul;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductTest {

    public static void main(String[] args){
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        List<String> collectorCollection =
                productList.stream().map(Product::getName).collect(Collectors.toList());

        //collectorCollection.forEach(n -> System.out.println(n));

        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(listToString);
    }
}
