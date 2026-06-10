/*  
1. procedure InputData Penjualan dengan variabel namaBarang, jumlahBarang, hargaBarang
2. function hitungTotal dengan parameter harga dan jumlah bertipe int
3. procedure outputData untuk menampilkan data barang dan total pembayaran
4. total pembayaran diprosess pada procedure input
*/

import java.util.Scanner;
public class latpros2 {
        
        static Scanner scanner = new Scanner(System.in);

            static String namaBarang;
            static int jumlahBarang;
            static int hargaBarang;
            static int totalPembayaran;
            static void inputData(){
            //namaBarang, jumlahBarang, hargaBarang
            System.out.println("Masukkan nama barang: ");
            String namaBarang = scanner.nextLine();

            System.out.println("Masukkan jumlah barang: ");
            int jumlahBarang = scanner.nextInt();

            System.out.println("Masukkan harga barang: ");
            int hargaBarang = scanner.nextInt();

            // total pembayaran diproses pada procedure input
            totalPembayaran = totalPembayaran(hargaBarang, jumlahBarang);
      

            // panggil procedure output
            outputData(namaBarang, jumlahBarang, hargaBarang, totalPembayaran);
        }

        static int totalPembayaran(int harga, int jumlah){
        int total = harga * jumlah;
        return total;
        }

        // procedure outputData
        static void outputData(String namaBarang, int jumlahBarang, int hargaBarang, int totalPembayaran){
            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Jumlah Barang: " + jumlahBarang);
            System.out.println("Harga Barang: " + hargaBarang);
            System.out.println("Total Pembayaran: " + totalPembayaran);
        }

        public static void main(String[] args) {
            inputData();
    }

}