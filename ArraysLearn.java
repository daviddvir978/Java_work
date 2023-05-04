import java.util.ArrayList;

public class ArraysLearn{
    public static void main (String []args){

        //Declare of Array list 
        ArrayList list = new ArrayList();
        //How to add elements into the ArrayLiat => 
        list.add("Cheers_Java_user");
        //Integer s = list.size();
        //System.out.println(s);
        
        //remove from list of arrays
        list.remove(0);
        System.out.println(list);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}