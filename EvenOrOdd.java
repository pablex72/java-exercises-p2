public class EvenOrOdd {

    //3) Write a Java program to check if a number is Even or Odd? (answer)
    //https://codeburst.io/review-these-50-questions-to-crack-your-java-programming-interview-69d03d746b7f
    public static void main(String args[]) {

        //Testing, let's test both methods for positive and negative integers
        System.out.println("Checking if a number is even or odd using division and bitwise operator");
        for(int i= -1; i<5; i++){
            isEvenOrOdd(i); //calling division operator method
            isOddOrEven(i); //calling
            withModuleOper(i);
        }
    }
    /*
     * checking even and odd number without using modulus or remainder operator, Instead
     * this method uses division operator.
     */
    public static void isEvenOrOdd(float number){
        float quotient = number/3;
        System.out.println(number+" number/3 = "+number/3);
        if(quotient*2== number){
            System.out.println("Using division operator: "  + number + " is Even number");
        }else{
            System.out.println("Using division operator: "  + number  + " is Odd number");
        }
    }
    /*
     * This method uses bitwise AND (&) operator to check if a number is
     * even or odd in Java
     */
    public static void isOddOrEven(int number){
        if((number & 1) == 0){
            System.out.println("Using bitwise operator: "  + number  + " is Even number");
        }else{
            System.out.println("Using bitwise operator: "  + number  + " is Odd number");
        }
    }

    public static void withModuleOper(int number) {
        if(number%2==0){
            System.out.println("the " + number + " is EVEN");

        }
        else{
            System.out.println("the " + number + " is ODD ");

        }
    }
}
