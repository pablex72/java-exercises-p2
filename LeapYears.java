public class LeapYears {
    //Tested years are in range 1600 ≤ year ≤ 4000.
    public static void main(String[] args) {
        System.out.println(isLeapYear(2100));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 4000 && year <= 1600) {
            throw new IllegalArgumentException("out of range");
        }

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4== 0) {
            return true;
        } else {
            return false;
        }
    }
}
