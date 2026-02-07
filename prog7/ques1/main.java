
// Sum of 3 numbers
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        a = sc.nextInt();
        System.out.println("Enter Number1: ");
        b = sc.nextInt();
        System.out.println("Enter Number1: ");
        c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("The sum of the numbers is: " + sum);
    }
}