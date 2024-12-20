import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int K = scanner.nextInt();


        for (int i = 0; i < K; i++) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < K; i++) {
            if (list.get(i) == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(list.get(i));
            }
        }

        int sum = 0;
        for (int value : stack) {
            sum += value;
        }

        System.out.println(sum);
    }
}
