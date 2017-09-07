package com.comparable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestNotComparable {

    @Test
    public void testNotComparable() {
        final List<NotComparable> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new NotComparable(i));
        }

        try{
            Arrays.sort(list.toArray());
            Arrays.toString(list.toArray());
            System.out.println(Arrays.toString(list.toArray()));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
