import java.util.Scanner;

public class LatihanNo3_25410100030 {
    public static void cetakBintang (int n) {
        if (n == 0) {
            System.out.println("Selesai!!!");
            return;
        }

        System.out.println("*");
        cetakBintang(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bintang yang kamu inginkan: ");
        int jumlahBintang = scanner.nextInt();

        cetakBintang(jumlahBintang);

        scanner.close();
    }
}