import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int answer =0;

        int[] arr= new int[N];

        for (int i = 0; i < N; i++) {
            arr[i]= scanner.nextInt();
        }

        int v= scanner.nextInt();

        for (int i = 0; i <N; i++) {

            if (arr[i] == v){
                answer++;
            }
        }


        System.out.println(answer);


    }
}
