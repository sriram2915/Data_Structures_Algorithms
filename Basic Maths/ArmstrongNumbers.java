public class ArmstrongNumbers {

    // Method to check if a number is an Armstrong number
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // Count the number of digits

        while (n > 0) {
            int digit = n % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of the number of digits and add to sum
            n /= 10; // Remove the last digit from n
        }

        return original == sum; // Check if the original number is equal to the sum
    }

    public static void main(String[] args) {
        int N = 153; // Example Armstrong number
        System.out.println("Number: " + N);
        boolean isArmstrong = isArmstrong(N);
        System.out.println("Is Armstrong: " + isArmstrong);
    }
}

//
// Output:
// Number: 153
// Is Armstrong: true
// Time Complexity: O(d) where d is the number of digits in the number
// Space Complexity: O(1) as it uses a constant amount of space
