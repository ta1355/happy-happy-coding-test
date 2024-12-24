import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        int c = scanner.nextInt();

        List<Integer> list = new ArrayList<>();


        for (int j = 0; j < i; j++) {
            list.add(scanner.nextInt());
        }


        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(c -1));


    }
}
