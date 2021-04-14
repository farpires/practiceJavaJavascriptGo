package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner keyboard = new Scanner(System.in);
        double a, b = 0;
        System.out.println("please enter the value in A");
        a = keyboard.nextDouble();
        System.out.println("please enter the value in B");
        b = keyboard.nextDouble();
        double sum = 0;
        double subtraction = 0;
        double multiply = 0;
        double divide = 0;

        sum = a + b;
        subtraction = a - b;
        multiply = a * b;

        if (b != 0) {
            divide = a / b;
            System.err.println("THE DIVIDE IS EQUAL TO = " + divide);
        } else
            System.out.println("Division by zero is undefined");
        System.err.println("THE SUM IS EQUAL TO = " + sum);
        System.err.println("THE SUBTRACTION IS EQUAL TO = " + subtraction);
        System.err.println("THE MULTIPLYCATION IS EQUAL TO = " + multiply);
        keyboard.close();
    }
}
