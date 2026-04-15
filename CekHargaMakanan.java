import java.util.Scanner;

public class CekHargaMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int budget = 20000;

        System.out.print("Masukkan harga makanan: ");
        int hargaMakan = input.nextInt();

        if (hargaMakan > budget) {
            System.out.println("Makanan yang kamu pilih terlalu mahal, uangmu tidak cukup.");
        } else {
            System.out.println("Makanan yang kamu pilih masih terjangkau, bisa kamu beli.");
        }

        input.close();
    }
}