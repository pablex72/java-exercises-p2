import java.util.HashMap;
import java.util.Map;

public class CheckTrheeAndTwo {
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'a', 'b', 'b' };
        System.out.println(checkThreeAndTwo(arr));
    }

    public static boolean checkThreeAndTwo(char[] chars) {

        boolean foundThree = false;
        boolean foundTwo = false;
        Map<Character, Integer> counterA = new HashMap<>();

        for (char ch : chars) {
            counterA.put(ch, counterA.getOrDefault(ch, 0) + 1);
        }

        for (int count : counterA.values()){
            if (count == 3){
                foundThree = true;
            }
            else if (count == 2){
                foundTwo = true;
            }
        }


        return foundThree&&foundTwo;
    }
}
