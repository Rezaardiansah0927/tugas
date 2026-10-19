import java.util.Scanner;

public class Soal5_EvenNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: N = ");
        int N = input.nextInt();
        int sum = 0; 
        for (int i = 1; i <= N; i++) {
            
            if (i % 2 == 0) {
                sum += i; 
            }
        }
        System.out.println("Output: Sum of even numbers = " + sum);

        input.close();
    }
}