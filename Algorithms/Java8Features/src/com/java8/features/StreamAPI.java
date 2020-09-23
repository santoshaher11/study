package com.java8.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
        //Calculate Sum
        System.out.println("********  sum using reduce *********");
        int sum = array.stream().reduce(0,(previous,current)->previous+current);
        System.out.println("Sum: "+sum);

        //Concatenate Strings
        System.out.println("********  Concatenate string using reduce *********");
        String[] stringArray = { "Geeks", "for", "Geeks", "is", "awesome" };
        Optional<String> combinedString = Arrays.stream(stringArray)
                .reduce((previousString, currentString)
                        -> previousString + "-*-*-" + currentString);
        combinedString.ifPresent(System.out::println);

        //Return longest String
        System.out.println("********  longest string using reduce *********");
        Optional<String> longestString = Stream.of(stringArray).reduce(
                (previous, current)-> previous.length() >= current.length() ?previous:current);
        if(longestString.isPresent())
            System.out.println(longestString.get());

        //Filter + reduce
        System.out.println("********  Filter + Reduce *********");
        Optional<String> filterReduce= Stream.of(stringArray).filter((String str)->str.length()>3).reduce((previous, current)->previous+current);
        filterReduce.ifPresent(System.out::println);

        //Map + collector
        System.out.println("********  Map +Collector *********");
        List<String> mapString= Stream.of(stringArray).map(current->current+"_"+current.length()).collect(Collectors.toList());
        System.out.println("Map String "+mapString);

        //sorted
        System.out.println("********  Sorting default *********");
        Arrays.asList(stringArray).stream().sorted().forEach(System.out::println);

        System.out.println("********  Sorting explicit *********");
        Arrays.asList(stringArray).stream().sorted(
                (first,second)-> first.compareTo(second)
        ).forEach(System.out::println);

        System.out.println("********  Sorting explicit lambda *********");
        Arrays.asList(stringArray).stream().sorted(
                String::compareTo
        ).forEach(System.out::println);


        System.out.println("********  Sorting reverse *********");
        Arrays.asList(stringArray).stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
