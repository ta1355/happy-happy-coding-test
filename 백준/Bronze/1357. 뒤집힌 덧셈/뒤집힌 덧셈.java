import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];

        int reverse = Integer.parseInt(builder.append(a).reverse().toString());
        builder.setLength(0);

        int reverse2 = Integer.parseInt(builder.append(b).reverse().toString());
        builder.setLength(0);

        int add = reverse + reverse2;
        int answer = Integer.parseInt(builder.append(String.valueOf(add)).reverse().toString());

        System.out.println(answer);

        scanner.close();
    }
}