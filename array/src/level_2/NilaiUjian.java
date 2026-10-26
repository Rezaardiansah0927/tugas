package level_2;

public class NilaiUjian {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};

        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        
        double rata = (double) total / nilai.length;
        System.out.println("Rata-rata: " + rata);

        System.out.print("\nNilai > rata-rata: ");
        for (int n : nilai) {
            if (n > rata) {
                System.out.print(n + " ");
            }
        }

        int lulus = 0;
        for (int n : nilai) {
            if (n >= 70) {
                lulus++;
            }
        }
        System.out.println("\nJumlah lulus: " + lulus);
        double persen = (double) lulus / nilai.length * 100;
        System.out.println("Persentase lulus: " + persen + "%");
    }
}