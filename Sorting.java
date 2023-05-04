import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int nums [] = {1,100,33,344};
        // in this method we print the sort via Arrays class and parallelSort || Arrays.sort(arrayName, index [], index[]) || Arrays.sort(arrayName)
        //Arrays.sort(nums, 0, 3);
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
