public class Factorial {
    public static void main(String[] args) {
        int N = 5;
        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }

        System.out.println(N + "! = " + hasil);
    }
}