package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the base of the triangle");
        double base = keyboard.nextDouble();
        System.out.println("please enter the height of the triangle");
        double height = keyboard.nextDouble();

        double superface = base * height / 2;

        System.out.println("\n THE SURFACE OF SQUARE IS = " + superface + "\n`");

        keyboard.close();
    }
}
