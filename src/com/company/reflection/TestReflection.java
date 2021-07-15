package com.company.reflection;

import com.company.comparator.Personage;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Personage personage = new Personage();

        Class personageClass = Personage.class;
        Class personageClass2 = personage.getClass();
        Class personageClass3 = Class.forName("com.company.comparator.Personage");

        Method[] methods = personageClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }
    }

}
