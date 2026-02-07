
// WAP to convert KM to miles
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("***************Kilo Meters to Miles converter***************");
        Scanner sc = new Scanner(System.in);
        double km;
        System.out.println("Enter Length in KM: ");
        km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Length in Miles: " + miles);
        System.out.println("************************************************************");

    }
}