import java.util.Scanner;

public class RelativelyPrime {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);  //Scanner to get user input

        //TODO
        //Complete the program
        int input1 = 0;
        while (input1 <= 0) {
            System.out.println("Enter a positive integer:");
            input1 = scnr.nextInt();
        }
        int input2 = 0;
        while (input2 <= 0) {
            System.out.println("Enter another positive integer:");
            input2 = scnr.nextInt();
        }
        int number = 0;
        System.out.println("Common divisors of " + input1 + " and " + input2 + ":");
        for (int divisor = 1; divisor <= Math.min(input1, input2); divisor++) {
            if (input1 % divisor == 0 && input2 % divisor == 0) {
                System.out.println(divisor);
                number++;
            }
        }
        if (number > 1) {
            System.out.println(input1 + " and " + input2 + " are not relatively prime.");
        }
        else {
            System.out.println(input1 + " and " + input2 + " are relatively prime.");
        }
    }
}





