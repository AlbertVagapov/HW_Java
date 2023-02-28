import java.util.Arrays;

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
 * заменить 0 на 1, 1 на 0;
 */
public class hw1 {
    public static void main(String[] args) {
        // int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        print(new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 1 });
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                if (arr[i] == 1) {
                    arr[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
