package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the value in pesos that you want to convert");
        double pesoArg = keyboard.nextInt();
        double dolar = 140;
        double euro = 120;
        double real = 12;
        double valueDolar = pesoArg / dolar;
        double valueEuro = pesoArg / euro;
        double valueReal = pesoArg / real;

        System.out.println("THE VALUE OF " + pesoArg + " PEOS ITS CORRESPONDING VALUE IN");
        System.out.println("DOLAR = " + valueDolar + "\n");
        System.out.println("EURO = " + valueEuro + "\n");
        System.out.println("REAL = " + valueReal + "\n");

        keyboard.close();
    }
}
