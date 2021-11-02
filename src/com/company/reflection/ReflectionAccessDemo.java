package com.company.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionAccessDemo {

    public static void main(String[] args) {
        Student studentA = new Student(8, "alex", "gost");
        Student studentB = new Student(5, "yen", "in");
        Student studentC = new Student(2, "ann", "dam");

        try {
            Field privateField = Student.class.getDeclaredField("rating");
            System.out.println(privateField);
            privateField.setAccessible(true);
            int fieldRating = (int) privateField.get(studentA);
            System.out.println("value of private field: " + studentA.getRating());
            privateField.set(studentA, 10);
            System.out.println("value of private field: " + studentA.getRating());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

//        Class<?> box = Box.class;
//        Annotation[] annotations = box.getAnnotations();
//        for (Annotation annotation : annotations) {
//            if (annotation instanceof Reflectable) {
//                Reflectable mAnnotation = (Reflectable) annotation;
//                System.out.println("name: " + mAnnotation.name());
//                System.out.println("value: " + mAnnotation.value());
//            }
//        }

//        try {
//            Box box = new Box(1, 2, 3);
//
//            Field privateField = Box.class.getDeclaredField("type");
//            System.out.println(privateField);
//            privateField.setAccessible(true);
//            String fieldValue = (String) privateField.get(box);
//            System.out.println("value of private field = " + fieldValue);
//            privateField.set(box, "newType");
//            box.print();
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            System.out.println("error")
//        }

//        try {
//            Box box = new Box(1, 2, 3);
//
//            Class<?> boxClass = Box.class;
//            Method method = boxClass.getMethod("printNameWithPrefix", String.class);
//            method.invoke(box, "MyPrefix");
//
//            Method print = boxClass.getMethod("print");
//            print.invoke(box);
//
//        } catch (Exception ignored) {
//        }

//        Class<?> boxClass = Box.class;
//        try {
//            Method method = boxClass.getMethod("printNameWithPrefix", String.class);
//            System.out.println(method);
//
//            Class<?>[] parameterType = method.getParameterTypes();
//            Class<?> returnType = method.getReturnType();
//
//            System.out.println(Arrays.toString(parameterType));
//            System.out.println(returnType);
//        } catch (NoSuchMethodException ignored) {
//        }

//        Class<?> boxClass = Box.class;
//        try {
////            Method method = boxClass.getMethod("printNameWithPrefix", String.class);
////            System.out.println(method);
//
//            Method print = boxClass.getMethod("print");
//            System.out.println(print);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

//        Class<?> boxClass = Box.class;
//        Method[] methods = boxClass.getMethods();
//        Arrays.stream(methods).forEach(System.out::println);


//        try {
//            Class<?> boxClass = Box.class;
//            Field field = boxClass.getField("size");
//
//            Box box = new Box(1, 2, 3);
//
//            Object value = field.get(box);
//            System.out.println(value);
//
//            field.set(box, "small");
//            System.out.println(box.size);
//        } catch (NoSuchFieldException | IllegalAccessException ignored) {
//        }

//        Class<?> boxClass = Box.class;
//        Field[] fields = boxClass.getFields();
//        System.out.println(Arrays.toString(fields));
//
//        try {
//            Field field = boxClass.getField("size");
//            System.out.println(field);
//
//            // name
//            String fieldName = field.getName();
//            System.out.println(fieldName);
//
//            // run
//            Object fieldType = field.getType();
//            System.out.println(fieldType);
//        } catch (NoSuchFieldException ignored) {
//        }

//        try {
//            Constructor<?> constructor = Box.class.getConstructor(int.class, int.class);
//            Box box = (Box) constructor.newInstance(1, 2);
//            box.print();
//        } catch (Exception e) {
//        }
//
//        try {
//            Constructor<?> constructor = Box.class.getConstructor(int.class, int.class, int.class);
//            Box box = (Box) constructor.newInstance(1, 2, 3);
//            box.print();
//        } catch (Exception e) {
//        }

//        Class<?> boxClass = Box.class;
//        try {
//            Constructor<?> constructor = boxClass.getConstructor(int.class, int.class, int.class);
//            System.out.println(constructor);
//        } catch (NoSuchMethodException e) {
//        }

//        Class<?> boxClass = Box.class;
//        Constructor<?>[] constructors = boxClass.getConstructors();
//        System.out.println(Arrays.toString(constructors));
//
//        for (Constructor<?> c : constructors) {
//            Class<?>[] parameterTypes = c.getParameterTypes();
//            System.out.println(Arrays.toString(parameterTypes));
//        }

//        Class<?> boxClass = Box.class;
//        Class<?>[] boxClassInterfaces = boxClass.getInterfaces();
//        System.out.println(Arrays.toString(boxClassInterfaces));

//        Class<?> boxClass = Box.class;
//        Class<?> boxSuperClass = boxClass.getSuperclass();
//        System.out.println(boxSuperClass);

//        Class<?> boxClass = Box.class;
//        int boxClassModifiers = boxClass.getModifiers();
//        System.out.println("Box:");
//        System.out.println(Modifier.isPublic(boxClassModifiers));
//        System.out.println(Modifier.isStatic(boxClassModifiers));
//        System.out.println(Modifier.isAbstract(boxClassModifiers));
//        System.out.println(Modifier.isPrivate(boxClassModifiers));
//
//        System.out.println();
//        System.out.println("AbstractBox:");
//        Class<?> abstractBoxClass = AbstractBox.class;
//        int abstractBoxClassModifiers = abstractBoxClass.getModifiers();
//        System.out.println(Modifier.isPublic(abstractBoxClassModifiers));
//        System.out.println(Modifier.isStatic(abstractBoxClassModifiers));
//        System.out.println(Modifier.isAbstract(abstractBoxClassModifiers));
//        System.out.println(Modifier.isPrivate(abstractBoxClassModifiers));

//        Class<Box> boxClass = Box.class;
//        String fullName = boxClass.getName(); // with package
//        String name = boxClass.getSimpleName(); // without package
//        System.out.println(fullName);
//        System.out.println(name);

//        Class<AbstractBox> boxClass = AbstractBox.class;
//        System.out.println(boxClass);

//        try {
//            Class<?> boxClass = Class.forName("com.company.reflection.AbstractBox");
//            System.out.println(boxClass);
//        } catch (ClassNotFoundException ignored) {
//        }
    }
}
