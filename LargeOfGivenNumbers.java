import java.util.Scanner;

public class LargeOfGivenNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter First Number: ");
        int a = s.nextInt();
        System.out.println("Please enter Second Number: ");
        int b = s.nextInt();
        System.out.println("Please enter Third Number: ");
        int c = s.nextInt();

        if (a > b && a > c) {
            System.out.println(a + "is largest number");
        }
        else if (b > a && b > c) {
            System.out.println(b + "is largest number");
        }
        else
        {
            System.out.println(c + "is largest number");
        }
    }
}
