package Lecture27;

public class Homework {

    // Question1: Swap Alternate Elements in an array
    static int[] swapAlternate(int []arr){
        int size = arr.length;
        for (int i = 0; i<size; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }  // T.C. -> O(n), S.C. -> O(1)







    static void main() {

        // Question1: Swap Alternate Elements in an array
        int arr[] = {10,20,30,40,50,60};
        System.out.println("Array after swapping alternate elements: ");
        for (int num : swapAlternate(arr)){
            System.out.println(num + " ");
        }
    }
}
