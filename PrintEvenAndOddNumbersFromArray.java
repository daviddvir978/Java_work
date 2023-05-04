import java.util.ArrayList;
import java.util.Arrays;

public class PrintEvenAndOddNumbersFromArray {
    //Print Even and Odd numbers from an Array of integers in this case I have used an array of objects into a list.


    public static void main(String[] args) {        
        int arr [] = {1,2,3,4,5};
        int even =0;
         ArrayList even1 = new ArrayList();
         ArrayList odd = new ArrayList();
        //for (int i =0; i <arr.length; i++){
            for(int element: arr){ // use arr[i] or a[i] 
                if(element %2 ==0)
                {
                even1.add(element);
                }
                if (element %2 !=0) 
                {
                odd.add(element);
                }
        }
        System.out.println("even numbers: "+ even1 + "odd numbers: " + odd);
    }
    
}
    
    
    
