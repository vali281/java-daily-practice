import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String st = sc.nextLine(); // next: takes only one word, nextLine : takes whole line
        System.out.print(st);
    }
}