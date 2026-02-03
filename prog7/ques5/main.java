
// WAP to detect whether a number entered by the user is interal or not.
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (sc.hasNextInt()) {
            int flag = sc.nextInt();
            System.out.println("The number you entered is an integer: " + flag);
        } else {
            System.out.println("The number you entered is not an integer: ");
        }

    }
}
