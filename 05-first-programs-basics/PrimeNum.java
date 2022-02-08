import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int input= sc.nextInt();
        if(input<=1)
            System.out.println("Neither Prime nor Composite");
        int c=2;
        while(c*c<=input) {
            if (input % c == 0)
            {
                System.out.println("Not a Prime");
                return;
            }
        c++;
        }
        if (c * c > input) {
            System.out.println(input + " is a Prime Number");
            return;
        }
    }
}
