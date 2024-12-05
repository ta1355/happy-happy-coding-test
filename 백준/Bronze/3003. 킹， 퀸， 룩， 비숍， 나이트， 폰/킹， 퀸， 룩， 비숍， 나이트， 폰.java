import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int king =1;

        int queen =1;

        int rook =2;

        int bishop =2;

        int knight =2;

        int pawn =8;


        king -=scanner.nextInt();
        queen -=scanner.nextInt();
        rook -=scanner.nextInt();
        bishop -=scanner.nextInt();
        knight -=scanner.nextInt();
        pawn -=scanner.nextInt();


        System.out.print(king+ " ");
        System.out.print(queen+ " ");
        System.out.print(rook+ " ");
        System.out.print(bishop+ " ");
        System.out.print(knight+ " ");
        System.out.print(pawn+ " ");

    }
}
