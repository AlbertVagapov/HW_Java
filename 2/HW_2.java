
// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.
import java.io.*;

public class HW_2 {
    public static void main(String args[]) {
        try {
            // Возьмите файл
            File f = new File(
                    "C:\\Users\\mI\\OneDrive\\Документы\\GeekBrains\\1. Lessons\\3. Java\\HW\2\\HW_2.java\\example.txt");
            // Создайте новый файл
            // Убедитесь, что он не существует
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}