import javax.sound.sampled.SourceDataLine;

public class swappingTwoNumbers {
    public static void main(String[]args){
    // we want to swap two numbers
    // let us define two numbers

    int a = 10;
    int b = 20;
    System.out.println("Before swapping a and b are:"+ ' '+a +' '+"and"+' '+b);

    // Logic 1: we want to create object to obtain the third variable into the first variable and then to swap.

    int t = a;  // => t = 10 , a =10
    a=b; // a=10,b=10,t=10
    b=t; // b=10,t=10 
 
    
    }
}
