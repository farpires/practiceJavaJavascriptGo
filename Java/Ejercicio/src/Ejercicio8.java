package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio8 {

    public static void resultOperation(int number) {

        Double square = Math.pow(number, 2);
        Double squareRoot = Math.sqrt(number);
        Double cubeRoot = Math.pow(number, 1.0 / 3.0);

        System.out.println("\n tha oprationes of " + number + " are  \n");
        System.out.println("\n SQUARE IS = " + square + "\n");
        System.out.println("\n SQUARE ROOT IS = " + squareRoot + " \n ");
        System.out.println("\n CUBE ROOT IS = " + cubeRoot + "\n");
    }

    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the number = ");
        int number = keyboard.nextInt();

        resultOperation(number);
        keyboard.close();
    }
}
