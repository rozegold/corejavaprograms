package com.Java8.programs;


import java.util.Arrays;
import java.util.List;

public class FizzBuzz {


    public static void main(String[] args) {

//            IntStream.rangeClosed(1,20).mapToObj(i -> i%3==0?(i%5==0?"FizzBuzz":"Fizz"):(i%5==0?"Buzz":i)).forEach(System.out::print);


    FizzBuzz f = new FizzBuzz();
    f.countWithFourChar(Arrays.asList("shreya","hello","high","cool","way","rain"));
    }
    public void countWithFourChar(List<String> l){


        int count=0;

        for (String s: l) {

            if(s.length() == 4) {
                count++;
            }

        }
        System.out.println(count);

        //l.stream().forEach(s -> {if(s.length() == 4) count++;});
        System.out.println(l.stream().filter(s -> s.length() ==4 ).count());

}



}
