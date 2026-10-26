package level_1;
public class NilaiMahasiswa{
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 65, 85};

        System.out.println("Semua nilai:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }
        System.out.println("\nNilai indeks ke-2: " + nilai[2]);

        System.out.println("\nPenjelasan: Indeks array dimulai dari 0,sedangkan urutan bisa dimulai dari 1.");
        System.out.println("Jadi mahasiswa ke-1 = indeks 0, mahasiswa ke-3 = indeks 2");
    }
}