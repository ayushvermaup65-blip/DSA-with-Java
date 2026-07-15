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



    // Question 2: Shift array elements by 1 position
    static void shiftBy1(int []arr){
        int size = arr.length;

        // last element to temp me store karo
        int temp = arr[size-1];

        //value ko 1 place aage shift karo
        for (int i = size-1; i>0; i--){
            arr[i] = arr[i-1];
        }

        // temp ko 0 index pe rakh do
        arr[0] = temp;
    }  // T.C. -> O(n), S.C. -> O(1)


    static void main(String[] args) {


        //Question 1: Find the reverse of array
        int arr[] = {1,2,3,4,5};
        int[] ans = reverseArray(arr);
        for (int num : arr){
            System.out.println(num);
        }



        // Question 2: Shift array elements by 1 position
        int arr2[] = {1,2,3,4,5};
        shiftBy1(arr2);
        for (int a: arr2){
            System.out.println(a + " ");
        }
        System.out.println();
    }
}
