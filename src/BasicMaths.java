
public class BasicMaths {

    // Print digits of a number

//    static void printDigits(int num){
//        //agar mere num ki value 0 hogai to main rukjaunga
//        //agar mere num!=0 hogi to main processing krta hu
//
//        while  (num !=0 ){
//            int digit = num % 10;
//            System.out.println(digit);
//            num /= 10; // last digit removing process
//        }
//    }


    // Count digits of a number

//    static int countDigits(int num){
//        int count = 0;
//        while  (num !=0 ){
//            int digit = num % 10;
//            count++;
//            num /= 10; // last digit removing process
//        }
//        return count;
//    }


    // Sum of digits of a number

//        static int sumOfDigits(int num){
//        int sum = 0;
//        while  (num !=0 ){
//            int digit = num % 10;
//            sum += digit;
//            num /= 10; // last digit removing process
//        }
//        return sum;
//    }


    // Reverse a number

//    static int reverseNumber(int num) {
//        int reverse = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num /= 10;
//        }
//        return reverse;
//    }


    // Palindrome number

//    static boolean isPalindrome(int num) {
//        int originalNum = num;
//        int reversedNum = reverseNumber(num);
//        if (originalNum == reversedNum) {
//            System.out.println("It is a palindrome number");
//            return true;
//        } else {
//            System.out.println("It is not a palindrome number");
//            return false;
//        }
//    }



    // Prime Number

//    static boolean isPrime(int num) {
//        for (int i = 2; i*i<=num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }



    // GCD of a number

     static int getGCD(int a ,int b){
         // gcd (a, b) = gcd(b, a%b)
         while (b != 0){
             int oldValueofb = b;
             b = a%b;
             a = oldValueofb;
         }
         int ans = a;
         return ans;
     }

     static int getLCM( int a, int b){
         int gcd = getGCD(a,b);
         //gcd(18,12) == 6
         int prod = a*b;
         //prod(a,b) = 216
         int lcm = prod/gcd;
         // 216/6
         return lcm;
     }

     static boolean isArmstrongNumber(int num){
         int sum =0;
         int originalNum = num;

         while (num!=0){
             int digit = num %10;
             int cubeOfDigit = digit*digit*digit;
             sum = sum + cubeOfDigit;

             num = num / 10;
         }
         if (sum == originalNum){
             return true;
         }
         else {
             return false;
         }
     }


    static void main() {
        int num = 31;
//        printDigits(num);
//        int ans = countDigits(num);
//        System.out.println(ans);
//        int ans1 = sumOfDigits(num);
//        System.out.println(ans1);
//        int ans2 = reverseNumber(num);
//        System.out.println(ans2);
//          boolean ans = isPalindrome(num);
//          System.out.println(ans);
//          System.out.println(isPrime(num));
//        System.out.println(getLCM(18,12));
        System.out.println(isArmstrongNumber(155));

    }
}



