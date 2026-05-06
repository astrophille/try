//buatlah program untuk menentukan kelulusan peserta ujian pada sebuah pelatihan berdasarkan nilai minimum yang ditetatapkan. user perlu mengisi jumlah peserta ujian (minimal 5) dan nilai minimum ujian terlebih dahulu yang disimpan dalam sebuah variabel. kemudian, nama peserta dan nilai hasil ujian setiap peserta diisi dan disimpan menggunakan array 1 dimensi. setelah pengisian semua data, program harus membandingkan nilai hasil ujian peserta dengan nilai minimum yang sudah ditentukan agar mengetahui status lulus ujian atau tidak, sesuai dengan ketentuan berikut: 1. jika nilai ujian >= nilai minimum, maka status "LULUS". 2. Jika nilai ujian < nilai minimum, maka status "GAGAL". setelah mengetahui status hasil ujian, program harus dapat menghitung dan menampilkan berapa jumlah peserta yang lulus dan tidak lulus.
//NAMA: KAYLA CLEARESTALINA BALQIS
//NIM: 25410100030

import java.util.Scanner; // import Scanner untuk input

public class UTS_25410100030 { // class utama
    public static void main(String[] args) { // method utama
        Scanner input = new Scanner(System.in); // objek scanner

        System.out.print("Masukkan jumlah peserta ujian (minimal 5): ");
        int jumlahPeserta = input.nextInt(); // input jumlah peserta

        while (jumlahPeserta < 5) { // validasi minimal 5 peserta
            System.out.print("Jumlah peserta ujian harus minimal 5. Masukkan kembali: ");
            jumlahPeserta = input.nextInt();
        }

        System.out.print("Masukkan nilai minimum ujian (minimal 75): ");
        double nilaiMinimum = input.nextDouble(); // input nilai minimum

        while (nilaiMinimum < 75) { // validasi minimal 75
            System.out.print("Nilai minimum ujian harus minimal 75. Masukkan kembali: ");
            nilaiMinimum = input.nextDouble();
        }

        input.nextLine(); // buat bersihin enter biar input namanya ga ke skip

        String[] namaPeserta = new String[jumlahPeserta]; // array nama
        double[] nilaiUjian = new double[jumlahPeserta]; // array nilai
        String[] statusKelulusan = new String[jumlahPeserta]; // array status

        int jumlahLulus = 0; // penghitung bagian lulus
        int jumlahGagal = 0; // penghitung bagian gagal

        for (int i = 0; i < jumlahPeserta; i++) { // input data peserta

            System.out.print("Masukkan nama peserta ke-" + (i + 1) + ": ");
            namaPeserta[i] = input.nextLine(); // input nama

            System.out.print("Masukkan nilai ujian " + namaPeserta[i] + ": ");
            nilaiUjian[i] = input.nextDouble(); // input nilai

            input.nextLine(); // buat bersihin enter

            // nampilin membandingkan nilai hasil ujian dengan nilai minimum di terminal biar user bisa tau prosesnya
            System.out.println("Membandingkan " + nilaiUjian[i] + " dengan nilai minimum " + nilaiMinimum);

            if (nilaiUjian[i] >= nilaiMinimum) { // kondisi lulus
                statusKelulusan[i] = "LULUS";
                jumlahLulus++;
            } else { // kondisi gagal
                statusKelulusan[i] = "GAGAL";
                jumlahGagal++;
            }
        }

        System.out.println("\n===== HASIL UJIAN PESERTA =====");

        for (int i = 0; i < jumlahPeserta; i++) { // nampilin hasil
            System.out.println(namaPeserta[i] + " - Nilai: " + nilaiUjian[i] + " - Status: " + statusKelulusan[i]);
            // namaPeserta[i] = nama peserta ke-i
            // nilaiUjian[i] = nilai ujian peserta ke-i
            // statusKelulusan[i] = hasil perbandingan (LULUS/GAGAL)
        }

        System.out.println("\nJumlah Peserta Lulus: " + jumlahLulus); // total lulus
        System.out.println("Jumlah Peserta Gagal: " + jumlahGagal); // total gagal

        input.close(); // tutup scanner
    }
}