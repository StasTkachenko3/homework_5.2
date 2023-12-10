import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.println("Задание №12");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSymmetric = checkSymmetry(arr);

        if (isSymmetric) {
            System.out.println("Yes"); // Если массив симметричный
        } else {
            System.out.println("No"); // Если массив несимметричный
        }
    }

    public static boolean checkSymmetry(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            if (arr[i] != arr[length - 1 - i]) {
                return false; // Если найдено несовпадение
            }
        }
        return true; // Если все элементы совпадают
    }
}


