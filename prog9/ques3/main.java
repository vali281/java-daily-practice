
// use comparision operators to findout whether a given number is greather than user's entered number
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 9;
        int user;
        System.out.println("Enter a Number: ");
        if (sc.hasNextInt()) {
            user = sc.nextInt();
            if (A > user) {
                System.out.println("Number is Bigger");
            } else {
                System.out.println("Number is Smaller");
            }
        } else {
            System.out.println("This is not a Integer Number!!");
        }

    }
}