/**
 * test1 Сравнить наибольшее подряд идущие 1
 */

public class test1 {

    public static void main(String[] args) {
        // System.out.println("Hello, Albert");

        int[] array = { 1, 1, 0, 1, 1, 1 };
        print(new int[] { 1, 1, 0, 1, 1, 1 }); // 2
        print(new int[] { 1, 0, 1, 1, 1, 1 }); // 4
        print(new int[] { 1, 1, 1, 1, 1, 1 }); // 6
        print(new int[] { 0, 0, 0, 1, 1, 1 }); // 3
        print(new int[] { 1, 1, 1, 1, 0, 0 }); // 4
    }

    private static void print(int[] arr) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                temp++;
            else {
                if (temp > count) {
                    count = temp;
                }
                temp = 0;
            }
        }
        if (temp > count) {
            count = temp;
        }
        System.out.println(count);
    }
}