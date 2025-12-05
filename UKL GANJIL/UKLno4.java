import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class UKLno4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
 Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1; // angka 1–100
        ArrayList<Integer> riwayatTebakan = new ArrayList<>();

        System.out.println("=== Permainan Tebak Angka (1 - 100) ===");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            int tebakan = input.nextInt();
            riwayatTebakan.add(tebakan);  // simpan ke arraylist

            if (tebakan > target) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (tebakan < target) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!");
                break;
            }
        }

        // Menampilkan semua tebakan di akhir
        System.out.println("\nRiwayat tebakan Anda:");
        for (int t : riwayatTebakan) {
            System.out.println("- " + t);
        }
    }
}
