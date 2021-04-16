package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the value in pesos that you want to convert");
        int pesoArg = keyboard.nextInt();
        int dolar = 140;
        int euro = 120;
        int real = 12;
        int valueDolar = pesoArg / dolar;
        int valueEuro = pesoArg / euro;
        int valueReal = pesoArg / real;

        System.out.println("THE VALUE OF " + pesoArg + " PEOS ITS CORRESPONDING VALUE IN");
        System.out.println("DOLAR = " + valueDolar + "\n");
        System.out.println("EURO = " + valueEuro + "\n");
        System.out.println("REAL = " + valueReal + "\n");

        keyboard.close();
    }
}
