import java.util.Scanner;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan listrik (A, B, C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        int pemakaian = input.nextInt();

        int tarif = 0;

        // Menentukan tarif berdasarkan golongan
        switch (golongan) {
            case 'A':
                tarif = 1200;
                break;
            case 'B':
                tarif = 1500;
                break;
            case 'C':
                tarif = 1800;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        // Hitung total sebelum tambahan
        double totalSebelum = pemakaian * tarif;

        double tambahan = 0;

        // Jika pemakaian lebih dari 500 kWh → tambah 10%
        if (pemakaian > 500) {
            tambahan = totalSebelum * 0.10;
        }

        double totalAkhir = totalSebelum + tambahan;

        // Output
        System.out.println("\n=== Rincian Tagihan Listrik ===");
        System.out.println("Nama pelanggan          : " + nama);
        System.out.println("Golongan listrik        : " + golongan);
        System.out.println("Pemakaian listrik (kWh) : " + pemakaian);
        System.out.println("Total sebelum tambahan  : Rp " + (int)totalSebelum);
        
        if (tambahan > 0) {
            System.out.println("Biaya tambahan 10%      : Rp " + (int)tambahan);
        } else {
            System.out.println("Biaya tambahan 10%      : -");
        }

        System.out.println("Total tagihan akhir     : Rp " + (int)totalAkhir);
    }
}