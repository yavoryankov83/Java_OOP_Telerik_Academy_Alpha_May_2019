package com.telerikacademy.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // 1. write the following anonymous class as a Lambda expression
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };

        // 2. write the everySecondChar static method from below as a lambda expression.
        // HINT: use Function<>
        UnaryOperator<String> everySecondChar = s -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0){
                    builder.append(s.charAt(i));
                }
            }

            return builder.toString();
        };

        // 3. Using the function from task 2, write code that will execute it with argument "1234567890"
        System.out.println(everySecondChar.apply("1234567890"));
        // 4. instead of executing lambdaSecondChar directly, suppose we want to pass it to a method. Write a method
        // called everySecondCharacter that accepts the function as a parameter and execute it with the argument "1234567890".
        // It should return the result of the function. For bonus points don't hardcode the argument string within the method.
        // 5. Using the new version of the method call it with argument "1234567890" and print the result
        String result = everySecondCharacter(everySecondChar, "1234567890");
        System.out.println(result);
        // 6. Write a lambda expression that maps to the java.util.Supplier interface.
        // This lambda should return the string "I love Java" and assign it to a variable called iLoveJava
        // Use the supplier to get its result in supplierResult variable, then print it on the screen
        Supplier<String> supplier = () -> "I love Java";
        String supplierResult = supplier.get();
        System.out.println(supplierResult);
        // 7. There are many interfaces in the Java SDK and sometimes we can use a lambda expression
        // instead of creating an instance that implements the interface that we want to use.
        // Given a specific interface how can we tell whether we can map a lambda expression to it.
        // What's the criteria that has to be met?
        //Solution
        //A functional interface should have only one method for implementation - like Comparable interface
        //with method int compareTo(T o);

        //8. Can we use a lambda expression to represent an instance of java.util.concurrent.Callable interface?
        // HINT: You'll have to read the documentation. As a java developer you have to be familiar with it.
        // https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html
        //Solution
        //Yes, we can use it, because it has only one method for implementation - V call(); It is functional interface.
        // 9. Is the java.util.Comparator a functional interface?
        //Solution
        //Yes, it is, because it han only one method we have to implement compare(), despite other methods.
        // 10. We have list with top female names for 2018.
        // Write code to print the items in the list in sorted order, and with the first letter in each upper-cased.
        // Use lambda expression when possible.
        // 10.1 Use streams for the same solution

        List<String> femaleNames = Arrays.asList(
                "Olivia",
                "Sophia",
                "amelia",
                "lily",
                "emily",
                "Ava",
                "Isla",
                "Aria",
                "mia",
                "Isabella"
        );

        Stream<String> resultStream = femaleNames.stream()
                .sorted()
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase());
        // 11. Print how many names start with letter 'A'
        // HINT1: You'll have to modify the stream chain
        // HINT2: You'll have to add another statement to print the number of items
        Stream<String> resultToPrint = resultStream.filter(n -> n.startsWith("A"));
        System.out.println(resultToPrint.count());
        // 12. Homework: Research peek() operation on streams. How to make it work in case we want
        // to see if capitalizeCase is working correctly?
        femaleNames.stream().peek(System.out::println);
    }

    //4. Solution
    private static String everySecondCharacter(UnaryOperator<String> everySecondChar, String value) {
        return everySecondChar.apply(value);
    }

    // 2. write the following method as a lambda expression.
    // HINT: use Function<>
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }
}












