import java.util.Scanner;
public class UKLno7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
   Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int n = input.nextInt();
        input.nextLine(); // clear buffer

        String[] nama = new String[n];
        long[] biayaProduksi = new long[n];
        long[] hargaJual = new long[n];
        int[] jumlahEvent = new int[n];

        long[] totalBiaya = new long[n];
        long[] totalPendapatan = new long[n];
        long[] labaRugi = new long[n];

        long totalKeseluruhan = 0;
        long labaTertinggi = Long.MIN_VALUE;
        int indexLabaTertinggi = 0;

        // Input data paket
        for (int i = 0; i < n; i++) {
            System.out.println("\n=== Paket ke-" + (i + 1) + " ===");
            System.out.print("Nama paket: ");
            nama[i] = input.nextLine();

            System.out.print("Biaya produksi per event: ");
            biayaProduksi[i] = input.nextLong();

            System.out.print("Harga jual per event: ");
            hargaJual[i] = input.nextLong();

            System.out.print("Jumlah event terjual: ");
            jumlahEvent[i] = input.nextInt();
            input.nextLine(); // clear buffer

            // Hitung
            totalBiaya[i] = biayaProduksi[i] * jumlahEvent[i];
            totalPendapatan[i] = hargaJual[i] * jumlahEvent[i];
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];

            // Akumulasi total keseluruhan
            totalKeseluruhan += labaRugi[i];

            // Cari laba tertinggi
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                indexLabaTertinggi = i;
            }
        }

        // Output tabel
        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("Nama Paket        | Total Biaya     | Total Pendapatan | Laba/Rugi  | Status");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            String status;
            if (labaRugi[i] > 0) status = "Laba";
            else if (labaRugi[i] < 0) status = "Rugi";
            else status = "Impas";

            System.out.printf("%-17s | Rp%-13d | Rp%-15d | Rp%-9d | %s\n",
                    nama[i], totalBiaya[i], totalPendapatan[i], labaRugi[i], status);
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalKeseluruhan);
        System.out.println("Paket dengan Laba Tertinggi: " 
            + nama[indexLabaTertinggi] + " (Rp" + labaTertinggi + ")");
    }
}
