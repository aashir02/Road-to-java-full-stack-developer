//import java.util.Arrays;  // this is safe now, because our class is not called Arrays

public class ReverseDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = reverseArray(arr);  
        System.out.println("Reversed: " + Arrays.toString(reverse));
    }

    public static int[] reverseArray(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[input.length - 1 - i];
        }
        return result;
    }
}
