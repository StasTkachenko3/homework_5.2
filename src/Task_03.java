import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean allEqual = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
