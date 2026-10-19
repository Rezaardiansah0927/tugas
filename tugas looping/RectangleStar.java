import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan R: ");
        int R = input.nextInt();
        System.out.print("Masukan C: ");
        int C = input.nextInt();

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                System.out.println();
            }
            System.out.println();
        }
        input.close();
    }
}