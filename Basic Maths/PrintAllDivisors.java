                                
import java.util.ArrayList;

public class PrintAllDivisors {
    public static ArrayList<Integer> findDivisors(int n) {
        
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrtN; ++i) {
            // Check if i divides n
            // without leaving a remainder
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        ArrayList<Integer> divisors = findDivisors(number);

        System.out.print("Divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}

// Output: 
// Divisors of 12 are: 1 12 2 6 3 4
// Time Complexity: O(sqrt(n)), where n is the input number
// Space Complexity: O(d), where d is the number of divisors found
                            