import java.util.HashMap;


public class UKLno5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
  int[] array = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        // Menghitung frekuensi
        for (int angka : array) {
            frekuensi.put(angka, frekuensi.getOrDefault(angka, 0) + 1);
        }

        // Menampilkan hasil
        for (int key : frekuensi.keySet()) {
            System.out.println(key + " muncul " + frekuensi.get(key) + " kali");
        }
    }
}