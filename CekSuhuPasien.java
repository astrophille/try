//NAMA: KAYLA CLEARESTALINA BALQIS
//NIM: 25410100030
//KELAS: P1
//MATA KULIAH: PEMOGRAMAN DASAR

import java.util.Scanner;

public class CekSuhuPasien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // ini untuk ngebuat scanner nya

        double[] dataSuhu = new double[5]; // ini untuk ngebuat array nya, 5 itu jumlah data yang mau diinput

        //perulangan untuk input data suhu pasien
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan suhu pasien ke-" + (i + 1) + ": ");
            dataSuhu[i] = input.nextDouble(); // ini untuk nginput data suhu pasien ke array

            String kategoriSuhu; // ini untuk ngebuat variabel kategori suhu
            
            //Penentuan kategori suhu pasien
            if (dataSuhu[i] < 28.0) {
                kategoriSuhu = "Hipotermia berat, kondisi pasien sangat kritis!";
            } else if (dataSuhu[i] < 32.0) {
                kategoriSuhu = "Hipotermia sedang, segera tangani pasien";
            } else if (dataSuhu[i]<36.0) {
                kategoriSuhu = "Hipotermia ringan, perhatikan kondisi pasien secara berkala";
            } else if (dataSuhu[i] <= 37.5) {
                kategoriSuhu = "Suhu normal, kondisi pasien saat ini sudah stabil";
            } else if (dataSuhu[i] <= 38.5) {
                kategoriSuhu = "Demam ringan, berikan obat penurun panas dan perhatikan kondisi pasien";
            } else if (dataSuhu[i] <= 40.0) {
                kategoriSuhu = "Demam tinggi, segera konsultasikan dengan dokter";
            } else {
                kategoriSuhu = "Suhu terlalu tinggi, kondisi pasien sangat kritis. Segera panggil dokter!";
            }

            //output kategori suhu pasien setiap inputan
            System.out.println("Suhu ke-" + (i + 1) + ": " + dataSuhu[i] + "°C - " + kategoriSuhu);
            System.out.println(); // ini untuk buat jarak antar inputan suhu pasien
        }

        //Catatan Akhir
        System.out.println("\nCatatan: Pastikan untuk selalu memantau suhu pasien secara berkala dan segera konsultasikan dengan tenaga medis jika suhu pasien menunjukkan tanda-tanda kritis.");

        for (int i = 0; i < 5; i++) {
            System.out.println("Suhu pasien ke-" + (i + 1) + ": " + dataSuhu[i] + "°C");
            System.out.println(); // ini untuk buat jarak antar output suhu pasien
        }

        System.out.println("\nTerima kasih banyakk telah menggunakan program Cek Suhu Pasien. Semoga informasi ini bermanfaat untuk memantau kondisi pasien dengan lebih baik.");
    }
}