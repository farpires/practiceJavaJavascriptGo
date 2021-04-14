package Plus.src;

public class anagram {

    public static String genAnagrams(String p1, String p2) {
        int cont = p1.length();
        if (p1.length() != p2.length()) {
            return "no es Anagrams";
        }

        String p1Aux = p1.replaceAll("(.)\\1", "$1");
        String p2Aux = p2.replaceAll("(.)\\1", "$1");

        for (int i = 0; i < p1Aux.length(); i++) {
            for (int j = 0; j < p2Aux.length(); j++) {
                if (p1Aux.charAt(i) == p2Aux.charAt(j)) {
                    cont = cont - 1;
                }
            }
        }
        if (cont == 0) {
            return "es Anagrams";
        } else {
            return "no es Anagrams";
        }
    }

    public static Boolean compareTwoElementsArray(String param1, String param2) {
        boolean result = false;
        int cont = param1.length();
        if (param1.length() != param2.length()) {
            result = false;
        }

        String p1Aux = param1.replaceAll("(.)\\1", "$1");
        String p2Aux = param2.replaceAll("(.)\\1", "$1");

        for (int i = 0; i < p1Aux.length(); i++) {
            for (int j = 0; j < p2Aux.length(); j++) {
                if (p1Aux.charAt(i) == p2Aux.charAt(j)) {
                    cont = cont - 1;
                }
            }
        }
        if (cont == 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static Boolean searchElement(String[] cadenaText, String text) {
        boolean result = false;
        if (cadenaText[0] == null) {
            result = false;
        } else {
            for (int i = 0; i < cadenaText.length; i++) {
                if (cadenaText[i] != null) {
                    if (cadenaText[i].equals(text)) {
                        result = true;
                    }
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

    public static String[] anagramsArray(String[] ArrayString) {
        String[] ArrayStringAux;
        int cont = 0;
        ArrayStringAux = new String[ArrayString.length];
        for (int i = 0; i < ArrayString.length + 1; i++) {
            System.out.println(ArrayString[i] + " comparar con " + ArrayString[i + 1]);
            if (compareTwoElementsArray(ArrayString[i], ArrayString[i + 1])) {
                if (!searchElement(ArrayStringAux, ArrayString[i])) {
                    ArrayStringAux[cont] = ArrayString[i];
                    cont = cont + 1;
                }
                ArrayString[i + 1] = ArrayString[i];
            } else {
                ArrayStringAux[cont] = ArrayString[i + 1];
                cont = cont + 1;
            }

        }
        return ArrayStringAux;
    }

    public static void main(String[] args) throws Exception {
        // String[] ArrayString;
        // ArrayString = new String[5];
        // ArrayString[0] = "more";
        // ArrayString[1] = "rome";
        // ArrayString[2] = "emor";
        // ArrayString[3] = "crypto";
        // ArrayString[4] = "crypto";

        // System.out.println("resultado" + anagramsArray(ArrayString));

        String Pstring1 = "Hola";
        String Pstring2 = "olaH";
        System.out.println("string: " + genAnagrams(Pstring1, Pstring2));
    }
}
