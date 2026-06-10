import java.util.Scanner;

public class Latihan3 {

    static Scanner sc = new Scanner(System.in);

    static void cetakTabel(int angka) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();

        cetakTabel(angka);
    }
}