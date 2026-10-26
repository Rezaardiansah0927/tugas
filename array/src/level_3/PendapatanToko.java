package level_3;

public class PendapatanToko {
    public static void main(String[] args) {
        int[] pendapatan = {250,300,180,420,350,300,500,150,420,380};

        int total = 0;
        for (int p : pendapatan) total += p;
        double rata = (double) total / pendapatan.length;
        System.out.println("Total pendapatan: " + total + " ribu");
        System.out.println("Rata-rata: " + rata + " ribu\n");

        System.out.println("Pendapatan di atas rata-rata:");
        for (int i = 0; i < pendapatan.length; i++) {
            if (pendapatan[i] > rata) {
                System.out.println("Hari ke-" + (i+i) + ": " + pendapatan[i] + " ribu");
            }
        }
        int min = pendapatan[0], idxMin = 0;
        for (int i = 1; i < pendapatan.length; i++) {
            if (pendapatan[i] < min) {
                min = pendapatan[i];
                idxMin = i;
            }
        }
        System.out.println("\nPendapatan terendah: Hari ke-" + (idxMin+1) + " = " + min + " ribu");
        int max1 = 0, max2 = 0;
        for (int p : pendapatan) {
            if (p > max1) {
                max2 = max1;
                max1 = p;
            }
        }
        System.out.println("Dua tertinggi: " + max1 + " dan " + max2 + " ribu");
        int turun = 0;
        for (int i = 1; i < pendapatan.length; i++) {
            if (pendapatan[i] < pendapatan[i-1]) turun++;
        }
        System.out.println("Jumlah hari pendapatan turun: " + turun + " hari");
    }
}
    