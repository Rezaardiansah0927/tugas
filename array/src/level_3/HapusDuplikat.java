package level_3;

public class HapusDuplikat {
    public static void main(String[] args) {
        int[] nomor = {101, 102, 101, 103, 102, 104, 105, 103};
        
        int[] unikSementara = new int[nomor.length];
        int jumlahUnik = 0;
        boolean sudahAda;
        
        for (int i = 0; i < nomor.length; i++) {
            sudahAda = false;
            for (int j = 0; j < jumlahUnik; j++) {
                if (nomor[i] == unikSementara[j]) {
                    sudahAda = true;
                    break;
                }
            }
            if (!sudahAda) {
                unikSementara[jumlahUnik] = nomor[i];
                jumlahUnik++;
            }
        }
        
        int[] hasilUnik = new int[jumlahUnik];
        for (int i = 0; i < jumlahUnik; i++) {
            hasilUnik[i] = unikSementara[i];
        }
        
        System.out.println("Nomor peserta unik:");
        for (int n : hasilUnik) {
            System.out.print(n + " ");
        }
        System.out.println("\nJumlah peserta unik: " + jumlahUnik);
    }
}
