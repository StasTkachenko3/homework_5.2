import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        System.out.println("Задание №7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Создание массива размерности n
        Random random = new Random();

        // Заполнение массива случайными цифрами от 3 до 13
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11) + 3;
        }

        // Подсчет количества вхождений каждой цифры
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // Вывод результатов
        System.out.println("Результаты подсчета:");
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            System.out.println("Цифра " + num + " встречается " + count + " раз(а)");
        }
    }
}

