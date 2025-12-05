import java.util.Scanner;
public class UKLno3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat: ");
        int n = input.nextInt();

        long faktorial = 1;

        // Menghitung faktorial
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        // Menampilkan hasil
        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
    }
}