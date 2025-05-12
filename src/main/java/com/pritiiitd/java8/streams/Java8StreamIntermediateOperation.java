package com.pritiiitd.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Java8StreamIntermediateOperation {
    public static void main(String[] args) {

        //1. `**filter**`
        //*Question:* Fetch all numbers from a list that are greater than 5.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().filter(n -> n > 5)
                .collect(Collectors.toList());
        System.out.println(result); //[6, 7, 8, 9, 10]

        // 2.`**map**`
        //*Question:* Transform a list of strings into a list of their uppercase versions

        List<String> words = Arrays.asList("apple", "banana", "cherry", "pineapple");
        List<String> result1 = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result1); //[APPLE, BANANA, CHERRY, PINEAPPLE]

        //3. `**flatMap**`
        // *Question:* Given a list of lists of strings, flatten them into a single list of strings.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("three", "four")
        );
        List<String> result2 = listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(result2);    //[one, two, three, four]

        //4. `**distinct**`
        //*Question:* Remove duplicates from a list of integers.
     List<Integer> numbers1 = Arrays.asList(10,2,3,3,8,6,7,8,9,10);
       List<Integer> result3 = numbers1.stream()
                                   .distinct()
                                   .collect(Collectors.toList());
        System.out.println(result3); //[10, 2, 3, 8, 6, 7, 9]

        /*List<Integer> numbers2 = List.of(10, 2, 3, 3, 8, 6, 7, 8, 9, 10);
        Set<Integer> finalResult = numbers2.stream()
                .collect(Collectors.toSet());
        System.out.println(finalResult);*/

        //`**sorted**`
        //*Question:* Sort a list of names in reverse alphabetical order.
        List<String> names =  Arrays.asList("John","Jane","Alice","Bob","Priti");
        List<String> sortedResult = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedResult);
        
        // `**peek**`
        //*Question:* Print each element in a list while converting them to uppercase.
        List<String> peekWords =  Arrays.asList("apple","banana","cherry");
        List<String> peekRes = peekWords.stream().peek(e-> System.out.println("Original PeekWords : "+ e))
               // .map(e-> e.toUpperCase())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(peekRes);


        /***limit**`
        *Question:* Fetch the first 3 elements from a list of integers.*/
        List<Integer> limitNo = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> limitRes = limitNo.stream()
                .limit(3).collect(Collectors.toList());
        System.out.println(limitRes);

        //`**skip**`
        //*Question:* Skip the first 4 elements and fetch the remaining elements from a list of integers.
        List<Integer> skipNo = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> skipRes = limitNo.stream()
                .skip(3).collect(Collectors.toList());
        System.out.println(skipRes);


        //`**forEach**`
        //*Question:* Print each element of a list of strings with a prefix "Item: ".

        //`**collect**`//
        // *Question:* Collect a list of integers into a `Set`.

        //`**reduce**`
        //*Question:* Compute the product of all numbers in a list.

        //`**allMatch**`
        // The `allMatch` method in Java Streams is used to check if all elements in the stream satisfy a given predicate. It returns `true` if every element in the stream matches the predicate, and `false` otherwise.

    }
}