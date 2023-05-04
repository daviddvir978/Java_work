import java.util.Scanner;

public class reverseString{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string to reverse it: ");
        String str1= scan.nextLine();
        String rev = "";
        int len = str1.length(); // = 5
        for(int i =len-1; i>=0; i--)
        {
        rev=rev+str1.charAt(i);
        }
        System.out.println(rev);
    }
}
