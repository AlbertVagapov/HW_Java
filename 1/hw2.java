import java.util.Arrays;

// 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class hw2 {
    public static void main(String[] args) {
        print(new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 });
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}