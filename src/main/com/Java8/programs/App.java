package com.Java8.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {


    public static void main(String[] args) {
        String prefix="Welcome ";
        System.out.println(process("Hello World!", String::toUpperCase));
        System.out.println(process2("Hello World!",5, String::substring));
        System.out.println(process("Hello World!", prefix::concat));


        String[] names = {"Mr Kaivalya", "Mr Taklu", "Ms Shreya"};

        Arrays.sort(names, Comparator.comparing(App::firstName));

        Arrays.sort(names, Comparator.comparing(App::xyz));

        System.out.println(Arrays.toString(names));
    }

    private static String xyz(String s1){
        return s1.split(" ")[1];
    }

    private static String process2(String s, int i, BiFunction<String, Integer, String> o) {
        return o.apply(s, i);
    }

    static String process(String text, Function<String, String> processor){
        return processor.apply(text);
    }

    public static String firstName(String name1){
        return name1.split(" ")[1];
    }

}
