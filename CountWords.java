import java.util.Scanner;
public class CountWords{
    public static void main(String [] args){
        /*
          So in this problem we want the words to be count so the plan is by using
          1)Scanner class => extract data out of the user.
          2) create a variable to int count => count the words.
          3) build a condition so words will be taken only if => no spaces && next after "," is a char(at least a char).  
           */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        String s = scanner.nextLine(); // Add this string: Welcome to java
        int count = 0; 
        for(int i=0;i<s.length()-1;i++){
        if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
        {
         count++;
        }
        }
        System.out.println(count);
        }
    }