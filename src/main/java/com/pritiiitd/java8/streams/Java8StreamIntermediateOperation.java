package com.pritiiitd.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamIntermediateOperation {
    public static void main(String[] args) {
        //1. `**filter**`
        //*Question:* Fetch all numbers from a list that are greater than 5.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = numbers.stream().filter(n->n>5)
                .collect(Collectors.toList());
        System.out.println(result); //[6, 7, 8, 9, 10]

      // 2.`**map**`
      //*Question:* Transform a list of strings into a list of their uppercase versions

        List<String> words = Arrays.asList("apple","banana","cherry","pineapple");
        List<String> result1 = words.stream()
                .map(String :: toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result1); //[APPLE, BANANA, CHERRY, PINEAPPLE]

       //3. `**flatMap**`
       // *Question:* Given a list of lists of strings, flatten them into a single list of strings.
       List<List<String>> listOfLists = Arrays.asList(
               Arrays.asList("one","two"),
               Arrays.asList("three","four")
       );
       List<String> result2 = listOfLists.stream()
               .flatMap(Collection::stream)
               .collect(Collectors.toList());
        System.out.println(result2);    //[one, two, three, four]
    }
}
