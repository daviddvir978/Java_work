import java.util.Arrays;
import java.util.Comparator;

public class arraySortDesc{
public static void main(String[]args){
        // int [] array1 = {1,2,6,3,7};
        // Arrays.sort(array1, 0, 4);
        // for(int element: array1){
        //     System.out.println(element);
        // }
Integer [] array2 = {1,2,6,3,7};
Arrays.sort(array2,Comparator.reverseOrder());
System.out.println(Arrays.toString(array2));
//approach one:
// int a [] = {100,200,3,4,500,209,4011,70};
// //Arrays.parallelSort(a);
// Arrays.sort(a);
//System.out.println(Arrays.toString(a));
//for(int element : a){
    //System.out.println(element);
}
    }
    