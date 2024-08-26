public class SumOfASequence {
    public static void main(String[] args) {
        int begin = 1;
        int end = 5;
        int step = 3;
        System.out.println(sequenceSum(begin, end, step));
    }

    public static int sequenceSum(int start, int end, int step) {

       if (start > end) {
            return 0;
        }

        int sumTotal = 0;
        int current = start;

        while (current <= end) {
            sumTotal += current;
            current += step;
        }

        return sumTotal;
    }
}
