//buatlah program untuk menentukan kelulusan peserta ujian pada sebuah pelatihan berdasarkan nilai minimum yang ditetatapkan. user perlu mengisi jumlah peserta ujian (minimal 5) dan nilai minimum ujian terlebih dahulu yang disimpan dalam sebuah variabel. kemudian, nama peserta dan nilai hasil ujian setiap peserta diisi dan disimpan menggunakan array 1 dimensi. setelah pengisian semua data, program harus membandingkan nilai hasil ujian peserta dengan nilai minimum yang sudah ditentukan agar mengetahui status lulus ujian atau tidak, sesuai dengan ketentuan berikut: 1. jika nilai ujian >= nilai minimum, maka status "LULUS". 2. Jika nilai ujian < nilai minimum, maka status "GAGAL". setelah mengetahui status hasil ujian, program harus dapat menghitung dan menampilkan berapa jumlah peserta yang lulus dan tidak lulus.
//NAMA: KAYLA CLEARESTALINA BALQIS
//NIM: 25410100030

import java.util.Scanner;
public class utsSoalE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPeserta=0, lulus=0, gagal=0, min=0;
        String status="";

        String[] nama;
        int[] nilaiUjian;

        do {
            System.out.print("Jumlah peserta ujian: ");
            jmlPeserta = sc.nextInt();
            if (jmlPeserta < 5) {
                System.out.println("Data minimal 5!");
            }
            sc.nextLine();
        } while (jmlPeserta < 5);
        
        System.out.print("Nilai minimal ujian: ");
        min = sc.nextInt();
        System.out.println();
        sc.nextLine();

        nama = new String[jmlPeserta];
        nilaiUjian = new int[jmlPeserta];

        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.print("Nama : ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai Ujian: ");
            nilaiUjian[i] = sc.nextInt();

            if (nilaiUjian[i] < min) {
                status = "Gagal";
                gagal++;
            } else if (nilaiUjian[i] >= min) {
                status = "LULUS";
                lulus++;
            }
            System.out.println("Status Ujian: "+status);
            System.out.println();
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Jumlah yang lulus: "+lulus);
        System.out.println("Jumlah yang gagal: "+gagal);

        sc.close();
    }
}