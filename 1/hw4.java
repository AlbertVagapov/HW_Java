// Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class hw4 {
    public static void main(String[] args) {
        int[] array = { 6, 7, 2, 34, 9, 11 };
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}