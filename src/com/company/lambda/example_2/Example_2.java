package com.company.lambda.example_2;

public class Example_2 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello");
                System.out.println("Goodbye");

                return x + y;
            }
        });

        runner.run((x, y) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");

            return y + x;
        });

        runner.run((x, y) -> x + y);
    }

}
