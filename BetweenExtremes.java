import java.util.Arrays;

public class BetweenExtremes {
    public static void main(String[] args) {

        int[] arr = {1, 434, 555, 34, 112};
        System.out.println(betweenExtremes(arr));
    }

    public static int betweenExtremes(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max - min;
    }
    //adding commit aaa
    //adding commit bbb

}
