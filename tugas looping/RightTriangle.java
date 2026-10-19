public class RightTriangle {
    public static void main(String[] args) {
        int N = 4;
        for (int baris = 1; baris <= N; baris++) {
            for (int bintang = 1; bintang <= baris; bintang++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}