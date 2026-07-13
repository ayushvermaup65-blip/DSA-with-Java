package BitwiseOperators;

import java.util.Scanner;

public class PracticeQuestions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(3<<2);
        System.out.println(16>>2);

        //ques 1: check if a number is even using bitwise
        int a = 10;
        if ((a&1) == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        int b = 4;
        int c = 5;
        System.out.println("Before Swapping:");
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Swapping using XOR
        b = b ^ c;
        c = b ^ c;
        b = b ^ c;

        System.out.println("After Swapping:");
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
