public class RotateArrayWithFixed {
    public static void main(String[] args) {
        System.out.println(fixedRotate("56789"));
    }

    public static String fixedRotate(String str){

        char[] strArr = str.toCharArray();
        for (int i=0; i< strArr.length-1; i++){
            char num0 = strArr[0];
            for (int j=0; j<strArr.length-1; j++){
                strArr[j+i] = strArr[j+i+1];
            }
            strArr[strArr.length-1] = num0;
        }

        String strMod = new String(strArr);
        System.out.println(strMod);
        return strMod;
    }
}
