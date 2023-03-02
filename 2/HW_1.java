// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш

public class HW_1 {

    public static boolean isPalindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Харама мар пурăнăçу: Пама, пама пуçăнăр, Упрама марах!"));
    }
}
