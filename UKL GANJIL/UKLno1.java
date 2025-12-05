
import java.util.Scanner;
public class UKLno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah elemen
        System.out.print("Masukkan jumlah elemen deret Fibonacci: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        int genap = 0;
        int ganjil = 0;

        System.out.print("Deret Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            // Hitung ganjil / genap
            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            // Mengubah nilai untuk elemen berikutnya
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();
        System.out.println("Jumlah bilangan genap : " + genap);
        System.out.println("Jumlah bilangan ganjil: " + ganjil);
    }
}


