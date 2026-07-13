package Lecture27;

public class ArrayQuestions {

    // Question 1: Find the average of array elements
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i: arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }  // T.C. -> O(n), S.C. -> O(1)






    static void main() {
        // Question 1: Find the average of array elements
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println("The average is: " + getAverage(arr));

    }
}
