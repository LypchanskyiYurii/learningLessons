package com.company.lambda;

public class Runner {
    public void run(Executable e) {
        int a = e.execute();
        System.out.println(a);
    }
}
