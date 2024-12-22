import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listA = new ArrayList<>();

        List<Integer> listB = new ArrayList<>();

        int n =scanner.nextInt();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            listA.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            listB.add(scanner.nextInt());
        }

        Collections.sort(listA);

        Collections.sort(listB, Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            answer += listA.get(i) * listB.get(i); 
        }


        System.out.println(answer);

        
    }
}
