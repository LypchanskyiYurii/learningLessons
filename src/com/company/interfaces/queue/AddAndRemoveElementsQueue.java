package com.company.interfaces.queue;

import com.company.interfaces.Figure;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class AddAndRemoveElementsQueue {
    public static void main(String[] args) {
        Queue<Figure> figures = new ArrayBlockingQueue<>(10);
        figures.add(new Figure(3));
        figures.add(new Figure(2));
        figures.add(new Figure(4));
        figures.add(new Figure(1));

        System.out.println(figures);

        System.out.println(figures.remove());
        System.out.println(figures);

    }
}
