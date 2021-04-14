package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner keyboard = new Scanner(System.in);
        int amount = 0;
        System.out.println("enter the amount of day");
        amount = keyboard.nextInt();
        int hours = 0;
        hours = amount * 24;
        int minutes = hours * 60;
        int second = minutes * 60;

        System.err.println(amount + "day has" + hours + " hour has " + minutes + " minutes with " + second + " second");
        keyboard.close();
    }
}
