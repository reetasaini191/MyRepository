package com.reeta.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestColection {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println(al);

        ListIterator<Integer> itr = al.listIterator();
        while (itr.hasNext()) {
            if (itr.next() == 3) {
                itr.remove();
            }
        }
        System.out.println(al);
    }
}

