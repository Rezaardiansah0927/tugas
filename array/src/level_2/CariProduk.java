package level_2;

public class CariProduk {
    public static void main(String[] args) {
        int[] kodeProduk = {101, 105, 110, 115, 120, 125};
        
        int kodeDicari = 115; 
        
        boolean ditemukan = false;
        int indeks = -1;
        int jumlahCek = 0;
        
        for (int i = 0; i < kodeProduk.length; i++) {
            jumlahCek++;
            if (kodeProduk[i] == kodeDicari) {
                ditemukan = true;
                indeks = i;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Kode produk " + kodeDicari + " ditemukan di indeks: " + indeks);
        } else {
            System.out.println("Produk tidak tersedia");
        }
        System.out.println("Jumlah elemen yang diperiksa: " + jumlahCek);
    }
}