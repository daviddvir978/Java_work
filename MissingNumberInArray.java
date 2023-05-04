import java.util.ArrayList;

public class MissingNumberInArray {
    public static void main(String[] args) {
        //Array should not have duplicates
        //Array No need to be sorted order
        //Values should be in range
        //1+2+4+5=12 sum1
        //1+2+3+4+5=15 sum2
        //Sum1-Sum2= 15-12 = 3 missing element in the array

       int b [] = {1,2,3,4,5};
        int a [] = {1,2,4,5}; //Here should be => a[2]==3
        int sum1=0;
        int sum2=0;
        for(int i=0; i<a.length; i++)
        { 
        sum1=sum1+a[i];
        }
        for(int i=0; i<b.length; i++)
        {
        sum2=sum2+b[i];        
        }
        System.out.println(sum2-sum1);
    }
    
}
