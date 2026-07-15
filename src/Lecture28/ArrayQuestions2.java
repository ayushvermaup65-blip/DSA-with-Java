package Lecture28;

public class ArrayQuestions2 {

    //Question 1: Find the reverse of array
    static int[] reverseArray(int[] arr) {
        int size = arr.length;
        int start = 0;
        int end = size - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }  // T.C. -> O(n), S.C. -> O(1)

    static void main(String[] args) {


        //Question 1: Find the reverse of array
        int arr[] = {1,2,3,4,5};
        int[] ans = reverseArray(arr);
        for (int num : arr){
            System.out.println(num);
        }

    }
}
