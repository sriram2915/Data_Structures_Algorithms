package BitManipulation;
import java.util.Scanner;

class IntegerToBinary {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter an integer: ");
    //     int number = scanner.nextInt();
    //     int f=0;
    //     for(int i = 31; i >= 0; i--) {
    //         long pow = power(2, i);
    //         if (number >= pow) {
    //             System.out.print("1");
    //             number -= pow;
    //             f=1;
    //         } else if(f==1) {
    //             System.out.print("0");
    //         }
            
    //     }
    //     scanner.close();
    // }

    // static long power(int base, int exp) {
    //     long result = 1;
    //     for (int i = 0; i < exp; i++) {
    //         result *= base;
    //     }
    //     return result;
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        StringBuilder binary = new StringBuilder();
        int flag = 0; // Flag to track if we have started printing bits
        
        for (int i = 31; i >= 0; i--) {
            int bit = (number >> i) & 1;
            if(bit == 1) {
                flag = 1; // We have started printing bits
            }
            if(flag == 1) {
                binary.append(bit);
            }
        }
        System.out.println("Binary representation: " + binary.toString());
        scanner.close();
    }
}