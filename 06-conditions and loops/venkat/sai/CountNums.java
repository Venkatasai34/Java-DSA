package venkat.sai;


import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter random number");
        int n = sc.nextInt();
        System.out.println("Enter a digit to find how many times it is repeated");
        int k= sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == k) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
    }
}