import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]args){
        // we want to reverse a number:

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give numbers"); // 123
        int num = scan.nextInt();


        // Using Algorithm => 
        int rev = 0;
        while (num!=0){ 
             rev = rev*10+ num%10; //21
            num=num/10; //0

        }
        System.out.println("Reverse number is: " + rev);
    }
    
}


