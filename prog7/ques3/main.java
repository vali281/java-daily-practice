
// WAP that asks user to enter his name and greet him with "Hello <name>, have a good day!"
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day!");
    }
}