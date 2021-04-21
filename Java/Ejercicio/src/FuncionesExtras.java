package Ejercicio.src;

public class FuncionesExtras {

    public Boolean foundString(String character, String charFound) {
        if ((character.equalsIgnoreCase(charFound.toUpperCase()))
                || (character.equalsIgnoreCase(charFound.toLowerCase()))) {
            return true;
        } else {
            return false;
        }

    }
}
