package com.company.interfaces.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

            if (idx == 1)
                iterator.remove();

            idx++;
        }
        System.out.println(list);
    }

}
