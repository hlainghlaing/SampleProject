package com.scm.list.sample;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println("ArrayList Before Replacing");
        for (String f : fruits) {
            System.out.println(f);
        }

        fruits.set(0, "Apple");
        System.out.println("ArrayList After Replacing");

        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        LinkedList<String> names = new LinkedList<>();
        names.add("Hlaing");
        names.add("Mi Mi");
        names.add("Hnaung Hnaung");
        System.out.println("LinkedList Before Adding" + names);

        names.addFirst("Mon Mon");
        System.out.println("LinkedList After Adding" + names);
    }
}
