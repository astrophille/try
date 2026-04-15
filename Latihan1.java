public class Latihan1 {
    public static void main(String[] args) {
        /*praktik:
        Jacob ingin belanja beberapa kebutuhan bahan pokok di alfamart. sebagai kasir, ada beberapa data yang harus dimasukkan ke dalam program dari belanjaan jacob.
        Data data tersebut adalah:
        - nama barang >> string
        - harga barang >> int
        - jumlah beli barang >> int
        - total harga barang >> int
        - tanggal pembelian barang >> string
        - ppn barang >> int
        - kembalian uang jacob >> int
         */

        //deklarasi variabel
        String namaBarang = "Sukro";
        int jumlahBeli = 2;
        int hargaBarang = 3000;
        int totalHarga = hargaBarang * jumlahBeli;
        
        //print/cetak hasil
        System.out.println("Nama Barang: " + namaBarang + "jumlah beli: " + jumlahBeli + "harga barang: " + hargaBarang + "total harga: " + totalHarga);

        //print dengan karakter escape |n >> new line
        System.out.println("Nama Barang: " + namaBarang + "\ntotal harga: " + totalHarga);
    }
}
