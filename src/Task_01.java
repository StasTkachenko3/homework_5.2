import java.util.ArrayList;
import java.util.List;

public class Task_01 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");
        List<Integer> fibArray = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            fibArray.add(fibonacci(i));
        }
        for (int num : fibArray) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}


