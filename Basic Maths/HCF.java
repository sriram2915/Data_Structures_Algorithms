public class HCF {
    // Method to calculate the HCF (Highest Common Factor) of two numbers using the Euclidean algorithm
    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Remainder
            a = temp; // Update a to the previous b
        }
        return a; // The HCF is stored in a
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf(num1, num2));
    }
}

//Euclidean algorithm is an efficient method for computing the HCF of two integers.
// It works by repeatedly replacing the larger number with the remainder of the division of the two numbers until one of them becomes zero.
// output:
// HCF of 48 and 18 is: 6
// Time Complexity: O(log(min(a, b))) where a and b are the two numbers
// Space Complexity: O(1) as it uses a constant amount of space

// Leetcode Problem: https://leetcode.com/problems/greatest-common-divisor-of-strings/