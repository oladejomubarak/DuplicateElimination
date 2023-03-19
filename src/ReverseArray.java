import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }
    public static int[] reverseArray(int[] arr){
        int counter = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (counter > i){
                int temp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = temp;
                counter--;
            }
            else break;
        }
        return arr;
    }
}
