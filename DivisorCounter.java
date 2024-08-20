public class DivisorCounter {

    public static void main(String[] args) {
        System.out.println();
    }

    public static long numOfDivisors(int n) {
        long count = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { //checkea el i
                count++;
//                La condición if (i != n / i) evita contar dos veces el mismo divisor cuando i es la raíz cuadrada de n.
                if (i != n / i) { //checkea la division (n/i)
                    count++;
                }
            }
        }
        return count;
    }
}
