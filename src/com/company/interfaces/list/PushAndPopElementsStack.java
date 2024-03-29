package com.company.interfaces.list;

import java.util.Stack;
import java.util.stream.Collectors;

public class PushAndPopElementsStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        while (!stack.empty()) {
//            System.out.println(stack.pop());
//        }
        System.out.println("________________");

        stack.stream().filter(a -> a > 2).forEach(System.out::println);
    }

}
