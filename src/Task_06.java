import java.util.HashMap;
import java.util.Random;

public class Task_06 {
    public static void main(String[] args) {
        System.out.println("Задание №6");
        int[] arr = new int[10]; // Создание массива на 10 элементов
        Random random = new Random();

        // Заполнение массива случайными числами от -10 до +10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
        }

        // Подсчет уникальных значений и их индексов
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
                indexMap.put(num, i);
            }
        }

        // Вывод уникальных значений и их индексов
        System.out.println("Уникальные элементы и их индексы:");
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count == 1) {
                int index = indexMap.get(num);
                System.out.println("Значение: " + num + ", Индекс: " + index);
            }
        }
    }
}

