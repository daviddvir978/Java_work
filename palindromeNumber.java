import java.util.Scanner;

public class palindromeNumber {
    public static void main(String [] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number");
       int num = s.nextInt(); //we take number from the user into num variable (int)
       int org_num = num;
       int rev = 0;
       //we will use algorithm to reverse a number here => 
       while(num!=0)
       {
        rev=rev*10 + num%10;
        num=num/10;
        }
       if(org_num==rev){
        System.out.println("Your Palindrome number is: " + org_num);
       }
       else{
        
        System.out.println("Your number is not a Palindrome number: " + org_num);
       }
    }   

}
