package BitwiseOperators;

public class PracticeQuestions {
    static void main(String[] args) {
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

    }
}
