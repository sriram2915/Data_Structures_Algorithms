public class ReverseNumber {

    // Method to reverse a number using arithmetic operations
    static int reverse2(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            n /= 10; // Remove the last digit from n
        }
        return reversed;
    }

    // Method to reverse a number using long to handle overflow and Integer limits
    static int reverse1(int x) {
        long sum=0; 
        while(x!=0)
        {
            sum= sum*10 + (x%10);
            x=x/10;
        }
        if(sum > Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        int N = 12345;
        System.out.println("Original Number: " + N);
        int reversedNumber1 = reverse1(N);
        int reversedNumber2 = reverse2(N);
        System.out.println("Reversed Number (Method 1): " + reversedNumber1);
        System.out.println("Reversed Number (Method 2): " + reversedNumber2);
    }
}

// Output:
// Original Number: 12345
// Reversed Number (Method 1): 54321
// Reversed Number (Method 2): 54321
// Time Complexity: O(d) for both methods, where d is the number of digits in the number
// Space Complexity: O(1) for both methods as they use a constant amount of space

// Leetcode Problem: https://leetcode.com/problems/reverse-integer/