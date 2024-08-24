import java.util.Arrays;

public class NumberToDigitTiers {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(createArrayOfTiers(561)));
    }

    /*
    420 should return ["4", "42", "420"]
     */
    public static String[] createArrayOfTiers(int num) {
//        int -->
        String numStr = String.valueOf(num);
        char[] arrNum = numStr.toCharArray();
        StringBuilder arrNew = new StringBuilder();

        String[] arrStr = new String[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrNew.setLength(0);

            for (int j = 0; j <= i; j++) {
                arrNew.append(arrNum[j]);
            }
            arrStr[i] = arrNew.toString();
        }
        return arrStr;
    }
}
