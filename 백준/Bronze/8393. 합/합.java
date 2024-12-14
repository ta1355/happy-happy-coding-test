import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        int answer = 0;

        for (int i = 1; i <= c; i++) {
            answer += i;
        }

        System.out.println(answer);


    }
}
