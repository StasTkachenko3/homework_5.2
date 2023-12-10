import java.util.HashSet;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Задание №4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean hasDuplicates = checkDuplicates(arr);
        if (hasDuplicates) {
            System.out.println("No"); // Если есть повторения
        } else {
            System.out.println("Yes"); // Если все значения различные
        }
    }

    public static boolean checkDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true; // Если найдено повторение
            }
            set.add(arr[i]);
        }
        return false; // Если все значения различные
    }
}

