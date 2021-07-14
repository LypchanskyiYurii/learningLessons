package com.company.annotations;

public class AddAnnotationsTest {

    @MethodInfo(author = "Yurii", dateOfCreation = 2021, purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello world");
    }

}
