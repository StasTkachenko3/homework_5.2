import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        System.out.println("Задание №9");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Создание массива размерности n
        Random random = new Random();

        // Заполнение массива случайными цифрами от -2 до n
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(n + 3) - 2;
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        boolean hasNegativeLessThanMinusOne = false;

        // Проверка наличия отрицательных значений меньше -1
        for (int num : arr) {
            if (num < -1) {
                hasNegativeLessThanMinusOne = true;
                break;
            }
        }

        // Если есть отрицательные значения меньше -1, заменить их на квадраты
        if (hasNegativeLessThanMinusOne) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < -1) {
                    arr[i] = arr[i] * arr[i];
                }
            }
        }

        System.out.println("Результирующий массив: " + Arrays.toString(arr));
    }
}

