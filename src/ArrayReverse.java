import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(array)));

    }

    public static int[] reverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        int increment = 0;
        for (int i = arr.length -1; i >= 0 ; i--) {
            reversedArray[increment] = arr[i];
            increment++;
        }
        return reversedArray;
    }
}
