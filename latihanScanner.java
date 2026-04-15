//import class Scanner
import java.util.Scanner;
public class latihanScanner {
    public static void main(String[] args) {
        //deklrasi variabel scanner
        Scanner scanner = new Scanner(System.in);

        /*praktik:
        - nama barang >> string
        - harga barang >> int
        - jumlah beli barang >> int
        - total harga barang >> int
        - tanggal pembelian barang >> string
        - ppn barang >> int
        - kembalian uang jacob >> int
         */

        //deklarasi variabel
        String namaBarang = "";
        int jumlahBeli = 0, hargaBarang = 0, totalHarga = 0 ;

        //input
        System.out.print("Masukkan nama barang: ");
        namaBarang = scanner.nextLine(); //input string dengan method nextLine()
        System.out.print("Masukkan harga barang: ");
        hargaBarang = scanner.nextInt(); //input int dengan method nextInt()
        System.out.print("Masukkan jumlah beli barang: ");
        jumlahBeli = scanner.nextInt(); //input int dengan method nextInt()

        totalHarga = hargaBarang * jumlahBeli; //hitung total harga barang
        System.out.println("Total : " + totalHarga); //print hasil inputan dan perhitungan total harga barang

        //tutup scanner
        scanner.close();

    }
}
