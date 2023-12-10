import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        int[] array = new int[30];
        Random random = new Random();

        // заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(121) - 70; // от -70 до 50
        }

        // поиск минимального и максимального элементов
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
        // вывод результатов
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}

