
// Calculate percentage of a given student in cbse board exam . his marks from 5 subjects must be taken as input from the keyboard 
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int OutOf;
        System.out.println("Marks are out of: ");
        OutOf = sc.nextInt();
        int Max_marks = 5 * OutOf;
        int sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter marks of subject1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter marks of subject2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter marks of subject3: ");
        sub3 = sc.nextInt();
        System.out.println("Enter marks of subject4: ");
        sub4 = sc.nextInt();
        System.out.println("Enter marks of subject5: ");
        sub5 = sc.nextInt();
        int sum_Marks = sub1 + sub2 + sub3 + sub4 + sub5;
        int percent = (sum_Marks * 100) / Max_marks;
        System.out.println("The Percentage is: " + percent);
    }
}
