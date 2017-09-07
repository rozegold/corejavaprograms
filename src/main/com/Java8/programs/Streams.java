package com.Java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {


    public static void main(String[] args) throws Throwable {


       // Stream.of("a1","a2","a3").findFirst().ifPresent(System.out::println);

       // Stream.of(1,2,3).mapToLong(n -> n*2 +1).average();
        //Arrays.stream(new int[]{}).map(n -> n * 2+1).average().orElseThrow(() -> new Exception("no average"));
/*
        Stream.of("a1","v2","b3","c2","a5").map(s -> {
            System.out.println("map : "+s);
            return s.toUpperCase();
        }).anyMatch(s-> {
            System.out.println("anyMatch: "+s);
            return s.startsWith("A");
        });

        System.out.println("----------------");

        Stream.of("d1","a2","b3","c2","a5").map(s -> {
            System.out.println("--map : "+s);
            return s.toUpperCase();
        }).filter(s-> {
            System.out.println("--filter: "+s);
            return s.startsWith("A");
        }).forEach(System.out::println);

        System.out.println("----------------");

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });*/


        List<Person> persons = Arrays.asList(new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12));

        Map<Integer, String> map = persons.
                stream()
                .collect(Collectors.toMap(p -> p.age,
                p -> p.personName,(n1,n2) -> n1+","+n2));



        System.out.println(map);

    }

}

class Person{
    String personName;
    int age;

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    @Override
    public String toString() {
        return personName;
    }


}
