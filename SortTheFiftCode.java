import java.util.Arrays;

public class SortTheFiftCode {
    //"abcdef"                      -- => "abcdef"
//        "pqksuvy"                     -- => "kpqsuvy"
//        "zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"
    public static void main(String[] args) {
        System.out.println(sortGiftCode("pqksuvy"));

    }
    public static String sortGiftCode(String code) {
//        convert the string to a char array
        // Convertimos la cadena a un array de caracteres
        char[] charArray = code.toCharArray();

        // Implementamos el algoritmo de ordenamiento burbuja
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1 - i; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Intercambiamos los caracteres si están en el orden incorrecto
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convertimos el array ordenado de nuevo a una cadena
        return new String(charArray);
    }
}
