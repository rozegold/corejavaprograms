package com.comparable;

public class Math {


    public int add(Person a1, Person a2){

        synchronized (this) {
            return a1.age + a2.age;
        }
    }


}

class Person{
    String personName;
    int age;

    public Person() {
    }

    public Person(String personName, int age) {
        this.personName = personName;
        this.age = age;
    }

    @Override
    public String toString() {
        return personName;
    }


}
