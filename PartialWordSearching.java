import java.util.ArrayList;
 import java.util.List;

public class PartialWordSearching {
    public static void main(String[] args) {
        String[] arrString = {"home", "milk", "Mercury", "fish"};
        System.out.println(findWord("me", arrString));
    }

    public static String[] findWord(String x, String[] y) {

        //convert each element of arr in lowercase
        String xLowerCase = x.toLowerCase();
        List<String> wordsFound = new ArrayList<>();
        //find conincidences
        for (String word : y) {
            if (word.toLowerCase().contains(word)) {
                wordsFound.add(word);
            }
        }

        if (wordsFound.isEmpty()) {
            return new String[]{"Empty"};
        } else {
            return wordsFound.toArray(new String[0]);
        }
    }
}
