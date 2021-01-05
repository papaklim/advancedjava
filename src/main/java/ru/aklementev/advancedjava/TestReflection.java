package ru.aklementev.advancedjava;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class personClass1 = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("ru.aklementev.advancedjava.Person");

        Method[] personMethods = personClass1.getMethods();
        for (Method method : personMethods) {
            System.out.println(method.getName() + ", " + method.getGenericReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("=====================");

        Field[] personFields = personClass2.getDeclaredFields();
        for (Field field : personFields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        System.out.println("=====================");

        Annotation[] annotations = personClass3.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author)
                System.out.println("Class has annotation \"Author\"");
        }

    }
}
