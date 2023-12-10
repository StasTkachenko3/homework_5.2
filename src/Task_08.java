import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        System.out.println("Задание №8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        char[] arr = new char[n]; // Создание массива размерности n
        Random random = new Random();

        // Заполнение массива случайными строчными латинскими буквами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (random.nextInt(26) + 'a');
        }

        // Подсчет количества вхождений каждой буквы
        Map<Character, Integer> countMap = new HashMap<>();
        for (char letter : arr) {
            if (countMap.containsKey(letter)) {
                countMap.put(letter, countMap.get(letter) + 1);
            } else {
                countMap.put(letter, 1);
            }
        }

        // Вывод самого массива на экран
        System.out.println("Массив: ");
        for (char letter : arr) {
            System.out.print(letter + " ");
        }

        System.out.println();

        // Вывод букв, которые встречаются больше 3 раз
        System.out.println("Буквы, которые встречаются больше 3 раз:");
        for (char letter : countMap.keySet()) {
            int count = countMap.get(letter);
            if (count > 3) {
                System.out.println(letter + " - " + count + " раз(а)");
            }
        }
    }
}


