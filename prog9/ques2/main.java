
// Write a java program to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = 80;
        int encrypt = marks + 8;
        int decrypt = encrypt - 8;
        System.out.println(decrypt);
    }
}