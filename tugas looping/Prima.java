public class Prima {
    public static void main(String[] args) {
        int N = 20;
        System.out.print("Bilangan prima: ");

        for (int angka = 2; angka <= N; angka++) {
            boolean prima = true;

            for (int bagi = 2; bagi <= Math.sqrt(angka); bagi++) {
                if(angka % bagi == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(angka + " ");
            }
        }
    }
}