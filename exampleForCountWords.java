import java.util.Scanner;
public class exampleForCountWords {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your String: ");
        String s = scan.nextLine();
        int count = 1; 
        for (int i = 0; i< s.length()-1;i++)
        {
        if ((s.charAt(i)+1 != ' ') && (s.charAt(i) == ' '))
        {
        count++;
        }
        }
        System.out.println("count is" + count);
    }
}


