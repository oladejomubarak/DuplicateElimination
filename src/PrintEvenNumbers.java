import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        printEven(new int[]{2, 5, 6, 7, 8, 10,4,7,9});

    }
    public static void printEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 < 1){
                System.out.printf("%d ", arr[i]);

            }

        }
    }
}
