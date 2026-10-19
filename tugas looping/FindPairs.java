public class FindPairs {
    public static void main(String[] args) {
        int[] angka = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;
        System.out.println("Output pasangan nilai:");

        for (int i =0; i < angka.length; i++) {
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] + angka[j] == target) {
                    System.out.println(angka[i] + " , " + angka[j]);
                }
            }
        }
    }
}