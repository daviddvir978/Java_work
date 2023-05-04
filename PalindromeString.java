import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class PalindromeString {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your sting to verify if this is palindrome or not: ");
        String str = scan.nextLine();
        String org_string = str;
        String rev = "";
        int len = str.length();

        // here we should reverse the string taken from the user by using the algorithm

        for(int i = len-1; i >=0;i--){
            rev=rev+str.charAt(i);
        }
        if(org_string.equals(rev))
        {
            System.out.println("this is a palindrome string " + org_string);
        }else{
            System.out.println("This is not a palindrom string: " + org_string);
        }

        }
    
        
}
