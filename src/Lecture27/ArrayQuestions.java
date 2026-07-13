package Lecture27;

import java.util.Arrays;

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


    // Question 2: Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];
        for (int i=0; i<size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }  // T.C. -> O(n), S.C. -> O(n)


    // Question 3: Search for an element in an Array {Linear Search}
    static boolean searchElement(int [] arr, int target){

        int size = arr.length;
        for(int i=0; i<size; i++){
            if (arr[i] == target){
                return true;
            }
        }
        // agar pura array travel ho chuka hai
        // and ek baar bhi target nhi mila
        // iska matlab target nhi mila , target false
        return false;
    }



    static void main() {
        // Question 1: Find the average of array elements
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println("The average is: " + getAverage(arr));


        // Question 2: Multiply each element of array by 10
        int [] arr2 = {2,3,4,5,6,7};
        int [] ans = multiplyBy10(arr2);
        System.out.println("The new array is: ");
        for (int i: ans){
            System.out.println(i);
        }


        // Question 3: Search for an element in an Array {Linear Search}
        int [] arr3 = {1,6,3,7,5,3,4,6};
        int target = 55;
        boolean ans2 = searchElement(arr3, 89);
        System.out.println(ans2);
    }
}
