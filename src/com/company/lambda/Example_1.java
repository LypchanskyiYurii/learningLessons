package com.company.lambda;

public class Example_1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello");
                System.out.println("Goodbye");
                return 1;
            }
        });

        runner.run(() -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return 5;
        });
    }
}
