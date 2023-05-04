import java.util.Arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int sum = 0; 

        //sum of elements in Array - for loop 

        int array1 [] = {1,2,3};
        for(int i=0; i<array1.length;i++){
        sum = sum + array1[i];
        }
        System.out.println(sum);
    }
    
}
