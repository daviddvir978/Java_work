public class FactorialNumber {
    public static void main(String[] args) {
        //Factorial number is:
        //5! = 1*2*3*4*5=120
        int num = 5;
        int sum = 1;
        for(int i =1; i<=num;i++){
            sum = sum * i;
 
        }
        System.out.println("Factorial Number for 5! is: "  +' '+ sum);

    }
}