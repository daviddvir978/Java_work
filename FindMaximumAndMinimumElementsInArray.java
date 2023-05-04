public class FindMaximumAndMinimumElementsInArray {
    public static void main(String[] args) {
        //how to find mamimum values in array: 

     int a [] ={1,2};
        int max = a[1]; // 2 
        int min = a[0]; // 1
          for(int i = 0; i<a.length;i++){
            for(int element : a){
                if(max > a[i]?:max:a[i]){
                }
                if(min > a[element]){
                    System.out.println(min);
                }
                

            }

        }
        
    }



