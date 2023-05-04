import javax.sound.sampled.SourceDataLine;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int num = 12345;
        int odd = 0;
        int even = 0;

        while(num>0) 
            {
            int rem = num%10; // =>  this will give us the last digit to check the odd/even and count them into a string.
            if(rem%2==0)
            {
            odd++;
            }
            else
            {
            even++;
            } 
            num = num/10;   
        }    
        System.out.println("the number of evens is: "+ ' ' + even + "the number of odd is: " + ' ' + odd ); 
    }
}
