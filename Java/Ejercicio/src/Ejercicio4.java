package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio4 {

    public static String compare(int a, int b, int c) {
        int sum;
        sum = a + b;
        System.out.println(sum);
        System.out.println(c);
        System.out.println(sum == c);
        if (sum == c) {
            return "\n THE SUM OF " + a + " AND " + b + " EQUALS " + c + " \n";
        } else {
            return "\n THE SUM OF " + a + " AND " + b + " IS NOT EQUALS " + c + " \n";
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c = 0;
        System.out.println("please enter the value in A");
        a = keyboard.nextInt();
        System.out.println("please enter the value in B");
        b = keyboard.nextInt();
        System.out.println("please enter the value in C");
        c = keyboard.nextInt();
        System.out.println(compare(a, b, c));
        keyboard.close();
    }
}
