
// WAP to calculate CGPA using marks of 3 subjects
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3;
        int Max_marks = 300;
        System.out.println("Enter marks of subject1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter marks of subject2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter marks of subject3: ");
        sub3 = sc.nextInt();
        int sum_Marks = sub1 + sub2 + sub3;
        float percent = (sum_Marks * 100) / Max_marks;
        float CGPA = percent / 10;
        System.out.println("The CGPA is: " + CGPA);
    }
}
