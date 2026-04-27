//nama: kayla clearestalina balqis
//nim: 25410100030
//kelas: P1
//mata kuliah: pemrograman dasar
//dosen: Bu Pradita

import java.util.Scanner;

public class SurabayaZoo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // untuk input

        // array untuk menyimpan data
        String[] kategori = new String[100];
        int[] harga = new int[100];
        int[] jumlah = new int[100];

        int n = 0; // jumlah kategori
        int pilihan; // menu

        do {
            // tampilan menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Input Kategori");
            System.out.println("2. Input Jumlah");
            System.out.println("3. Total Bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    // input jumlah kategori
                    System.out.print("Jumlah kategori: ");
                    n = input.nextInt();

                    // perulangan input kategori
                    for (int i = 0; i < n; i++) {

                        System.out.println("\nKategori ke-" + (i + 1));
                        System.out.println("1. Dewasa (50000)");
                        System.out.println("2. Anak-anak (30000)");
                        System.out.print("Pilih (1/2): ");
                        int pilihKategori = input.nextInt();

                        // menentukan kategori & harga
                        if (pilihKategori == 1) {
                            kategori[i] = "Dewasa";
                            harga[i] = 50000;
                        } else {
                            kategori[i] = "Anak-anak";
                            harga[i] = 30000;
                        }
                    }
                    break;

                case 2:
                    // cek apakah kategori sudah diisi
                    if (n == 0) {
                        System.out.println("Isi kategori dulu!");
                        break;
                    }

                    // input jumlah beli
                    for (int i = 0; i < n; i++) {
                        System.out.print("Jumlah " + kategori[i] + ": ");
                        jumlah[i] = input.nextInt();
                    }
                    break;

                case 3:
                    // cek data
                    if (n == 0) {
                        System.out.println("Data belum ada!");
                        break;
                    }

                    int total = 0;

                    // hitung total
                    for (int i = 0; i < n; i++) {
                        int subtotal = harga[i] * jumlah[i];

                        System.out.println(
                            kategori[i] + " = " +
                            jumlah[i] + " x " +
                            harga[i] + " = " + subtotal
                        );

                        total = total + subtotal;
                    }

                    System.out.println("Total = " + total);
                    break;

                case 4:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan salah");
            }

        } while (pilihan != 4);

        input.close();
    }
}