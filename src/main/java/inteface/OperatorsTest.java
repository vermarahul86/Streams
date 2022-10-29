package inteface;

import java.util.Arrays;
import java.util.List;

public class OperatorsTest {
    public static void main(String[] args){

        List<Integer> values = Arrays.asList(1,1,2,2);

        int sum = values.stream()
                .reduce(1, (i1, i2) -> i1 + i2);

        System.out.println("Sum is ="+ sum);

        List<String> names = Arrays.asList("bob", "josh", "megan");
        names.replaceAll(String:: toUpperCase);
        System.out.println(names);

    }
}
