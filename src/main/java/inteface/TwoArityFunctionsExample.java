package inteface;

import java.util.HashMap;
import java.util.Map;

public class TwoArityFunctionsExample {

    public static void main(String[] args){
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((key, value) ->
                key.equals("Freddy") ? value : value + 10000);

        salaries.forEach((key, value) ->
        {System.out.println("[Key] : " + key + " [Value] : " + value);}
        ); //Consumers

    }
}
