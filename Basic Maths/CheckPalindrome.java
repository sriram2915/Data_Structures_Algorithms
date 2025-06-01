public class CheckPalindrome {

    // Method to check if a number is a palindrome using arithmetic operations
    static boolean isPalindrome1(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            n /= 10; // Remove the last digit from n
        }
        return original == reversed; // Check if the original number is equal to the reversed number
    }

    public static void main(String[] args) {
        int N = 12321;
        System.out.println("Number: " + N);
        boolean isPalindrome = isPalindrome1(N);
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

//
// Output:
// Number: 12321
// Is Palindrome: true
// Time Complexity: O(d) where d is the number of digits in the number
// Space Complexity: O(1) as it uses a constant amount of space

// Leetcode Problem: https://leetcode.com/problems/palindrome-number/