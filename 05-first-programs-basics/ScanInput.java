import java.util.Scanner;

public class ScanInput {
    public static void main(String[] args) {
        System.out.println("Enter Student name and roll no");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        int id = sc.nextInt();
        System.out.println("Student name is : "+name);
        System.out.println("Student roll no is : "+id);
    }
}
