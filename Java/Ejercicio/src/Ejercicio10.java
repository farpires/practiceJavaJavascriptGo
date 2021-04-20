package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio10 {

    public static void exercise10_1(String stringTxtOne, String stringTxtTwo) {

        char allVowelsm[] = { 'a', 'e', 'i', 'o', 'u' };
        char allVowelsM[] = { 'A', 'E', 'I', 'O', 'U' };

        int contVowellsOne = 0;
        int contVowellsTwo = 0;

        for (int i = 0; i < stringTxtOne.length(); i++) {
            for (int j = 0; j < allVowelsm.length; j++) {
                if (stringTxtOne.charAt(i) == allVowelsm[j] || stringTxtOne.charAt(i) == allVowelsM[j]) {
                    contVowellsOne++;
                }
            }
        }

        for (int k = 0; k < stringTxtTwo.length(); k++) {
            for (int l = 0; l < allVowelsm.length; l++) {
                if (stringTxtTwo.charAt(k) == allVowelsm[l] || stringTxtTwo.charAt(k) == allVowelsM[l]) {
                    contVowellsTwo++;
                }
            }
        }

        if (contVowellsOne > contVowellsTwo) {
            System.out.println("the first word contains more vowels than the second \n");
        }

        if (contVowellsOne < contVowellsOne) {
            System.out.println("the second word contains more vowels than the first \n");
        }

    }

    public static void exercise10_2(String stringTxtOne, String stringTxtTwo) {
        boolean flagEqual = false;

        for (int l = 0; l < stringTxtOne.length(); l++) {
            if (stringTxtOne.charAt(l) != stringTxtTwo.charAt(l)) {
                flagEqual = true;
                break;
            }
        }

        if (!flagEqual) {
            System.out.println("the text strings are the equals \n");
        } else {
            System.out.println("the text strings are not the equals \n");
        }
    }

    public static void exercise10_3(String stringTxtOne, String stringTxtTwo) {
        boolean flagCapicua = false;
        for (int m = 0; m < stringTxtOne.length(); m++) {
            if (stringTxtOne.charAt(m) != stringTxtTwo.charAt((stringTxtOne.length() - 1) - m)) {
                flagCapicua = true;
            }
        }
        if (flagCapicua) {
            System.out.println("the text strings are not capicua \n");
        } else {
            System.out.println("the text strings are capicua \n");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the text string  =  ");
        String stringTxtOne = keyboard.nextLine();
        System.out.println("please enter the text string  =  ");
        String stringTxtTwo = keyboard.nextLine();
        exercise10_1(stringTxtOne, stringTxtTwo);
        exercise10_2(stringTxtOne, stringTxtTwo);
        exercise10_3(stringTxtOne, stringTxtTwo);
        keyboard.close();
    }
}
