import java.util.HashMap;
import java.util.Random;

public class Task_05 {
    public static void main(String[] args) {
        System.out.println("Задание №5");
        int[] arr = new int[10]; // Создание массива на 10 элементов
        Random random = new Random();

        // Заполнение массива случайными числами от -10 до +10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
        }

        // Подсчет повторяющихся значений
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        // Вывод повторяющихся элементов и количество повторений
        System.out.println("Повторяющиеся элементы и количество повторений:");
        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count > 1) {
                System.out.println(num + " - " + count + " повторений");
            }
        }
    }
}

