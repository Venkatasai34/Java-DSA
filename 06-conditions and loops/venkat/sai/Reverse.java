package venkat.sai;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter a num to see reverse of it ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println(ans);
    }
}
}