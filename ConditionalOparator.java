public class ConditionalOparator {
    public static void main(String[] args) {
        //Ternary operator
        int a = 3; 
        int b = 2; 
        int c = 1;
        
//     int largest = a>b?a:b; //largest of a && b
//     int largest1 = c>largest?c:largest;  
//     System.out.println("the large number is: " + largest1);

//     // we can write in one statement: 

//     int largest = c>(a>b?a:b)?c:(a>b?a:b);
//     }
//     int num = 90; 

// }

int result = c>(a>b?a:b)?c:(b>a?b:a); // if c is greater then (a>b) => c will return , else we go the last statement and then (b>a?b:a) this is the greatest. 
System.out.println("this number" + result); 

// a > b (If a > b then verify that a > c as well. if false then  

    }
}