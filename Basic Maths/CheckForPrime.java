                                
public class CheckForPrime {

    static boolean checkPrime(int n){ 
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){ 
            if(n % i == 0){ 
                cnt = cnt + 1;
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }
        if(cnt == 2){
            return true;
        }
        else{ 
            return false; 
        }
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

// Output:
// 1483 is a prime number.
// Time Complexity: O(sqrt(n)), where n is the input number
// Space Complexity: O(1) as it uses a constant amount of space