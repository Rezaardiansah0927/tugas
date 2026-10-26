package level_4;

public class PolaData {
    public static void main(String[] args) {
        int[] penggunaan = {120,125,130,128,135,140,138,145};
        int kaliNaik = 0;
        for (int i = 1; i < penggunaan.length; i++) {
            if (penggunaan[i] > penggunaan[i-1]) {
                kaliNaik++;
            }
        }
        System.out.println("1. Jumlah kenaikan: " + kaliNaik + " kali");
        int saatIni = 0, terpajang = 0;
        for (int i = 1; i < penggunaan.length; i++) {
            if (penggunaan[i] > penggunaan[i-1]) {
                saatIni++;
                terpajang = Math.max(terpajang, saatIni);
            } else {
                saatIni = 0;
            }
        }
        System.out.println("2. Kenaikan berturut-turut terpajang" + " hari");
        int perubahanTerbesar = 0;
        for (int i = 1; i < penggunaan.length; i++) {
            int beda = Math.abs(penggunaan[i] - penggunaan[i-1]);
            perubahanTerbesar = Math.max(perubahanTerbesar, beda);
        }
        System.out.println("3. Perubahan terbesar: " + perubahanTerbesar + " kwh");
        boolean trenNaik = penggunaan[penggunaan.length-1] > penggunaan[0];
        System.out.println("4. Secara keseluruhan cenderung meningkat? " + (trenNaik ? "YA" : "TIDAK"));
    }
}
