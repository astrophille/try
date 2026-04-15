import java.util.Scanner; 

public class KasirWacoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan wacoan: ");
        String kasir = input.nextLine();

        //menu
        System.out.println("\n====== Menu Wacoan ======");
        System.out.println("1. Mie Goyang Dumang - Rp 15.000");
        System.out.println("2. Mie Hompimpa Sut Jreng - Rp 12.850");
        System.out.println("3. Mie Suit Batu - Rp 10.000");
        System.out.println("4. Mie Sate Padang - Rp 25.000");
        System.out.println("5. Ayam Goreng - Rp 18.009");
        System.out.println("6. Es Teh - Rp 5.000");
        System.out.println("7. Es Jeruk - Rp 6.000");
        System.out.println("8. Es Campur - Rp 10.030");
        System.out.println("9. Es Cincau - Rp 8.650");
        System.out.println("10. Es Doger - Rp 12.500");

        //input pilihan menu
        System.out.print("\nMasukkan menu yang ingin dipesan: ");
        String menu = input.nextLine(); 

        System.out.println("Masukkan harga menu yang dipilih: ");
        int harga = input.nextInt();

        System.out.println("Jumlah yang dibeli: ");
        int jumlah = input.nextInt();

        int total = harga * jumlah;

        input.nextLine(); // buat pindah garis setelah input jumlah

        //metode pembayaran kepada pelanggan wacoan
        System.out.println("\nMetode pembayaran: ");
        System.out.println("Tunai / Debit / Kredit / QRIS");

        System.out.println("pilih metode pembayaran: ");
        String metode = input.nextLine();

        //pembayaran
        System.out.println("masukkan jumlah uang yang dibayarkan: ");
        int bayar = input.nextInt();
        
        int kembalian = bayar - total;

        //print struk pembayaran
        System.out.println("\n====== Struk Pembayaran ======");
        System.out.println("Nama Pelanggan: " + kasir);
        System.out.println("Menu: " + menu);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: Rp " + total);
        System.out.println("Metode Pembayaran: " + metode);
        System.out.println("Jumlah Bayar: Rp " + bayar);
        System.out.println("Kembalian: Rp " + kembalian);

        System.out.println("\nTerima kasih telah berbelanja di Wacoan!");

        input.close();

    }
}
