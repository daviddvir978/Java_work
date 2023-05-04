import java.util.Arrays;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        //first approach using .equals method
        // Check if two arrays are equal or not  using an algorithm

        //first approach:

        int a [] ={1,2,3};
        int b [] ={1,2,4};
        Arrays.equals(a,b);
        boolean status = Arrays.equals(a,b);
        if(status==true){
            System.out.println("Arrays are equal");
            
        }else{
            System.out.println("Arrays are not Equal");
        }
      
    }
    
}
