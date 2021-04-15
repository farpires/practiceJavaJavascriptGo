package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int n = 0;
        System.out.println("please enter the value in A");
        n = keyboard.nextInt();
        int number = n % 2;
        if (number == 0) {
            System.out.println("the number " + n + " is pair");
        } else {
            System.out.println("the number " + n + " is odd");
        }
        keyboard.close();
    }
}
