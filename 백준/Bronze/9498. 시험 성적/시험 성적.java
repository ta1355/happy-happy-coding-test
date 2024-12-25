import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();


        if (c < 60) {
            System.out.println("F");
        }else if (c < 70) {
            System.out.println("D");
        }else if (c < 80){
            System.out.println("C");
        }else if(c < 90){
            System.out.println("B");
        }else{
            System.out.println("A");
        }

    }
}
