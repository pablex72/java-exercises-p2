public class StringReversal {

    public static void main(String[] args) {

    }

    public static String reverseAndOmitNonAlphabetic(String str) {

        //utilizamos stringbuilder para filtrar y crear la cadena la reves
        StringBuilder filteredStr = new StringBuilder();

        //recorremos la cadena original
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //solo anidimos los caracteres alfabeticos
            if (Character.isLetter(c)) {
                filteredStr.append(c);
            }
        }

        StringBuilder reversedStr = new StringBuilder();
        for (int i = filteredStr.length() - 1; i >= 0; i--) {
            reversedStr.append(filteredStr.charAt(i));
        }
//        invertimos la cadena
        return reversedStr.toString();
    }
}
