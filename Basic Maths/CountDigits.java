// This code demonstrates two methods to count the number of digits in a given integer N.
// The first method uses logarithmic properties, while the second method uses a loop to divide the number by 10 until it reaches zero.
// Count the number of digits in a number using two different methods

public class CountDigits {

    static int countDigits1(int n) {
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }

    static int countDigits2(int n) {
        int cnt = 0;
        while (n > 0) {
            n /= 10;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits1 = countDigits1(N);
        int digits2 = countDigits2(N);
        System.out.println("Number of Digits in N: " + digits1 + " and " + digits2);
    }
}
// Output:
// N: 329823
// Number of Digits in N: 6 and 6
// Time Complexity: O(log N) for countDigits1, O(d) for countDigits2 where d is the number of digits