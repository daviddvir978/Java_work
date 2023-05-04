import javax.sound.sampled.SourceDataLine;

public class CountSumOfDigitsInNumber {
    public static void main(String[] args) {
        
        int num = 1234;
        int sum = 0;


        while(num>0)
            {
            sum=sum +num%10; //=> will extract the last digit
            num=num/10; //=> will take back a digit
            }
            System.out.println("The sume of digits in your number is: " + ' ' + sum);
    }
    
    
}