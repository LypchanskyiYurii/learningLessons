package com.company.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class EvokeTheMethodOfOneObjectOnAnother {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method m = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.newInstance();
    }
}
