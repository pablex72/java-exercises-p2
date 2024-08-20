public class EmailObfuscator {
    public static void main(String[] args) {
        String email = "fewa@fre.fre";
        System.out.println(obfuscate(email));
    }

    /* Resolver
    af.5134@borchmore.edu
    => af.5134 [at] borchmore [dot] edu
     */
    public static String obfuscate(String email) {
        StringBuilder newEmail = new StringBuilder("");
        char[] emailArr = email.toCharArray();
        boolean afterAt = false;
        for (int i = 0; i < emailArr.length; i++) {
            if (emailArr[i] == '@') {
                newEmail.append(" [at] ");
                afterAt = true;
            } else if (emailArr[i] == '.' && afterAt) {
                newEmail.append(" [dot] ");
            } else {
                newEmail.append(emailArr[i]);
            }
        }
        return newEmail.toString();

    }
}
