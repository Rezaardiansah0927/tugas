package level_4;
public class NilaiMudah {
    public static void main(String[] args) {
        int[] nilai = {85, 70, 95, 60, 75, 85, 90, 55, 85, 78};
        int batasLulus = 60;
        
        // 1. Rata-rata, Terkecil, Terbesar
        int total = 0;
        int min = nilai[0];
        int maks = nilai[0];
        
        for (int n : nilai) {
            total += n;
            if (n < min) min = n;
            if (n > maks) maks = n;
        }
        double rata = (double) total / nilai.length;
        
        System.out.println("Rata-rata: " + rata);
        System.out.println("Terendah: " + min);
        System.out.println("Tertinggi: " + maks);
        
        // 2. Lulus & Tidak Lulus
        int lulus = 0, tidakLulus = 0;
        for (int n : nilai) {
            if (n >= batasLulus) lulus++;
            else tidakLulus++;
        }
        System.out.println("\nLulus: " + lulus + " orang");
        System.out.println("Tidak Lulus: " + tidakLulus + " orang");
    }
}
