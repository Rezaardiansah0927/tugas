package level_1;
public class PersediaanBarang {
    public static void main(String[] args) {
        /// data array
        int[] stock = {12, 8, 15, 6};
        /// data pertama dan terkhir
        System.out.println("Produk pertama: " + stock[0]);
        System.out.println("Produk trakhir: " + stock[stock.length - 1]);
        ///diubah produk ke2 jadi 10
        stock[1] = 10;
        ///tampilan udah diubah
        System.out.println("\nStock setelah perubahan:");
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i]);
        }
        ///penjelasan indeks4
        System.out.println("\nPenjelasan: stock[4] akan ERROR karena indeks hanya sampai 3.");
        System.out.println("Array ada 4 elemen -> indek: 0,1,2,3");
    }
    
}
