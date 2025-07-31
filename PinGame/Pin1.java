import java.util.*;
public class Pin1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 3521; //sc.nextInt();
        int num2 = 2452; //sc.nextInt();
        int num3 = 1352; //sc.nextInt();
        int num4 = 38; //sc.nextInt();

        int ans = max(num1)*min(num1)*max(num2)*min(num2)*max(num3)*min(num3)- num4;
        System.out.print(ans);
        sc.close();
        
    }

    static int max(int num){
        int max = 0;
        while(num!=0){
            if(max<num%10){
                max = num%10;
            }
            num/=10;
        }
        return max;
    }

    static int min(int num){
        int min = 10;
        while(num!=0){
            if(min>num%10){
                min = num%10;
            }
            num/=10;
        }
        return min;
    }

}
