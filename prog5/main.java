import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Taking input from the usre");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number2 : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the numbers is: ");
        System.out.println(sum);
    }
}