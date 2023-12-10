import java.util.Random;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Задание №10");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Создание массива размерности n
        Random random = new Random();

        // Заполнение массива случайными цифрами от 0 до 33
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(34);
        }

        System.out.println("Исходный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int index = findElement(arr);

        if (index != -1) {
            System.out.println("Индекс найденного элемента: " + index);
        } else {
            System.out.println("Найденный элемент не существует.");
        }
    }

    public static int findElement(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] % arr[i - 1] == 0 && arr[i] % arr[i + 1] == 0) {
                return i;
            }
        }
        return -1;
    }
}

