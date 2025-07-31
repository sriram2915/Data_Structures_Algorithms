package BitManipulation;
public class BinaryToInteger {
    public static void main(String[] args) {
        String binaryString = "1101"; // Example binary string
        int decimalValue = binaryToInteger(binaryString);
        System.out.println("The decimal value of binary " + binaryString + " is: " + decimalValue);
    }

    static int binaryToInteger(String binaryString) {
        int decimalValue = 0;
        int base = 1; // 2^0

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char bit = binaryString.charAt(i);
            if (bit == '1') {
                decimalValue += base;
            }
            base *= 2;
        }
        return decimalValue;
    }
    // Alternative method using Integer.parseInt
    // static int binaryToInteger(String binaryString) {
    //     return Integer.parseInt(binaryString, 2);
    // }

}
