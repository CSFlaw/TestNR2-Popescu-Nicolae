import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        } else if (a != b && b != c && a != c) {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Neither all are equal nor all are different.");
        }
    }
}
