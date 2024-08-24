import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));  // Output: 54421
        System.out.println(sortDesc(145263)); // Output: 654321
        System.out.println(sortDesc(123456789)); // Output: 987654321
    }

    public static int sortDesc(final int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];

        // Convertir cada carácter a un número entero y almacenarlo en un array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

         for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    int temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }

         StringBuilder sortedStr = new StringBuilder();
        for (int digit : digits) {
            sortedStr.append(digit);
        }

         return Integer.parseInt(sortedStr.toString());
    }
}
