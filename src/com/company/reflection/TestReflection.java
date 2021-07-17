package com.company.reflection;

import com.company.comparator.Personage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Personage personage = new Personage();

        Class personageClass = Personage.class;
        Class personageClass2 = personage.getClass();
        Class personageClass3 = Class.forName("com.company.comparator.Personage");
//
//        Method[] methods = personageClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personageClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName() + ", " + field.getType());
//        }

        Annotation[] annotations = personageClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("Yes");
            }
        }
    }

}
