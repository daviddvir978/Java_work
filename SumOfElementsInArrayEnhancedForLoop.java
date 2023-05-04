import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SumOfElementsInArrayEnhancedForLoop {
    public static void main(String[] args) {
    int a [] = {1,2,3};
    int sum = 0;   
    // enhanced for loop 
    for (int value:a){ // a=1 => assign into value => sum =1; a=2 => assing into value => 2 + 1 = sum = 3 (stops when no value for a)
        
        sum=sum+value;
    }
    System.out.println(sum);
    
}
}
