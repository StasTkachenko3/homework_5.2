import java.util.Random;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Задание №11");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        String[] arr = new String[n]; // Создание массива размерности n
        Random random = new Random();

        // Заполнение массива словами, разделенными пробелами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateRandomWord();
            int spaces = random.nextInt(5) + 1;
            for (int j = 0; j < spaces; j++) {
                arr[i] += " ";
            }
        }

        // Вывод массива на экран
        System.out.println("Массив:");
        for (String word : arr) {
            System.out.print(word);
        }
        System.out.println();

        // Подсчет общего количества слов в массиве
        int wordCount = countWords(arr);
        System.out.println("Общее количество слов: " + wordCount);
    }

    public static String generateRandomWord() {
        Random random = new Random();
        int length = random.nextInt(10) + 1; // Длина слова от 1 до 10 символов
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char letter = (char) (random.nextInt(26) + 'a'); // Случайная строчная латинская буква
            word.append(letter);
        }
        return word.toString();
    }

    public static int countWords(String[] arr) {
        int count = 0;
        for (String word : arr) {
            String[] words = word.split(" ");
            count += words.length;
        }
        return count;
    }
}

