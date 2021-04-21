package Ejercicio.src;

import java.util.Scanner;

public class Ejercicio9 extends FuncionesExtras {

    public static void exercise9_1(String textString) {
        int longTxt = textString.length();
        System.out.println("\n 1_ the length of the string is  " + longTxt + "\n");

    }

    public static void exercise9_2(String textString) {
        char firstCharacter = textString.charAt(0);
        System.out.println("\n  2_ the first character of the string is " + firstCharacter + "\n");
    }

    public static void exercise9_3(String textString) {
        char latestCharacter = textString.charAt(textString.length() - 1);
        System.out.println("\n  3_ the latest character of the string is " + latestCharacter + "\n");
    }

    public static void exercise9_4(String textString) {
        System.out.println("\n 4_ print each character in the string -------------------- \n");
        for (int i = 0; i < textString.length(); i++) {
            System.out.println("character in position " + i + " is = " + textString.charAt(i) + "\n");
        }
    }

    public static void exercise9_5(String textString) {

        System.out.println("\n 5_determine how many times letters A and E are repeated \n");
        int contCharacterA = 0;
        int contCharacterE = 0;
        for (int i = 0; i < textString.length(); i++) {
            if (textString.charAt(i) == 'A' || textString.charAt(i) == 'a') {
                contCharacterA++;
            }
            if (textString.charAt(i) == 'E' || textString.charAt(i) == 'e') {
                contCharacterE++;
            }
        }
        if (contCharacterA > contCharacterE) {
            System.out.println("the letter A appears more than the letter E\n");
        } else {
            if (contCharacterA < contCharacterE) {
                System.out.println("the letter E appears more than the letter A\n");
            } else if (contCharacterA == contCharacterE) {
                System.out.println("the letter A and the letter B appear in the equal amount\n");
            }

        }
    }

    public static void exercise9_6(String textString) {
        StringBuilder reverseString = new StringBuilder(textString);
        for (int j = 0; j < textString.length(); j++) {
            reverseString.setCharAt(textString.length() - (j + 1), textString.charAt(j));
        }
        System.out.println("6_ print string txt reverse \n ");
        System.out.println(reverseString);
    }

    public static void exercise9_7(String textString) {
        boolean flag = false;
        int contFound = 0;

        for (int k = 0; k < textString.length(); k++) {
            if (textString.charAt(k) == 'o' || textString.charAt(k) == 'O') {
                contFound++;
                if (contFound == 2) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("\n I found the second letter O and I'm going to stop \n");
        }
    }

    public static void exercise9_8(String textString) {
        char allVowelsm[] = { 'a', 'e', 'i', 'o', 'u' };
        char allVowelsM[] = { 'A', 'E', 'I', 'O', 'U' };
        int contVowells = 0;
        for (int l = 0; l < textString.length(); l++) {
            for (int m = 0; m < allVowelsm.length; m++) {
                if (textString.charAt(l) == allVowelsm[m] || textString.charAt(l) == allVowelsM[m]) {
                    contVowells++;
                }
            }
        }

        if (contVowells == allVowelsm.length) {
            System.out.println("\n this phrase has all five vowels present\n");
        }
    }

    public static void exercise9_9(String textString) {
        int contB = 0;
        int contC = 0;
        int contA = 0;
        int acumB = 0;
        int acumA = 0;
        int acumC = 0;
        int acumTotal = 0;
        for (int n = 0; n < textString.length(); n++) {
            if (textString.charAt(n) == 'A' || textString.charAt(n) == 'a') {
                contA++;
                acumA = 10 + acumA;
                acumTotal = 10 + acumTotal;
            }
            if (textString.charAt(n) == 'C' || textString.charAt(n) == 'c') {
                contC++;
                acumC = 15 + acumC;
                acumTotal = 15 + acumTotal;
            }
            if (textString.charAt(n) == 'B' || textString.charAt(n) == 'b') {
                contB++;
                acumB = 20 + acumB;
                acumTotal = 20 + acumTotal;
            }
        }
        System.out.println("\n The scores for times found by letter is: \n");
        System.out.println("\n A = " + acumA + " , the times it appeared were: " + contA + " \n");
        System.out.println("\n C = " + acumC + ", the times it appeared were: " + contC + " \n");
        System.out.println("\n B = " + acumB + ", the times it appeared were: " + contB + " \n");
        System.out.println("\n the total score is = " + acumTotal + " \n");
    }

    public static void exercise9_10(String textString) {
        FuncionesExtras p1 = new FuncionesExtras();
        boolean flagG = false;
        boolean flagO = false;
        boolean flagL = false;
        for (int o = 0; o < textString.length(); o++) {
            if ((flagG == true) && (flagL == false)) {
                if (flagO == true) {
                    if (flagL == false) {
                        if (p1.foundString(Character.toString(textString.charAt(o)), "L")) {
                            flagL = true;
                            break;
                        } else {
                            if (p1.foundString(Character.toString(textString.charAt(o)), "G") == false) {
                                flagO = false;
                            }
                        }
                    }
                } else {
                    flagO = p1.foundString(Character.toString(textString.charAt(o)), "O");
                    if (flagO == false) {
                        if (p1.foundString(Character.toString(textString.charAt(o)), "G") == false) {
                            flagG = false;
                        }
                    }
                }
            } else {
                System.out.println(p1.foundString(Character.toString(textString.charAt(o)), "G"));
                flagG = p1.foundString(Character.toString(textString.charAt(o)), "G");
            }
        }

        if (flagG && flagO && flagL) {
            System.out.println("\n If found, the word \n");
        }

    }

    public static void exercise9_11(String textString) {

        boolean flagStringC = false;
        boolean flagStringD = false;
        boolean flagStringF = false;

        char characterToFound[] = { 'C', 'D', 'F' };
        for (int p = 0; p < textString.length(); p++) {
            for (int q = 0; q < characterToFound.length; q++) {
                if ((textString.charAt(p) == characterToFound[0]) && !flagStringC) {
                    flagStringC = true;
                }
                if ((textString.charAt(p) == characterToFound[1]) && flagStringC) {
                    flagStringD = true;
                }
                if ((textString.charAt(p) == characterToFound[2]) && flagStringD) {
                    flagStringF = true;
                }
            }
        }

        if (flagStringC && flagStringD && flagStringF) {
            System.out.println("\n If found, the characters C D F \n");
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter the text string  =  ");
        String textString = keyboard.nextLine();

        exercise9_1(textString);
        exercise9_2(textString);
        exercise9_3(textString);
        exercise9_4(textString);
        exercise9_5(textString);
        exercise9_6(textString);
        exercise9_7(textString);
        exercise9_8(textString);
        exercise9_9(textString);
        exercise9_10(textString);
        exercise9_11(textString);

        keyboard.close();
    }
}
