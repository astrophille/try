import java.util.Scanner;

public class Perkenalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jurusan: ");
        String jurusan = input.nextLine();

        System.out.println("\nHalo, perkenalkan nama saya " + nama + ".");
        System.out.println("Saya dari jurusan " + jurusan + ".");
        System.out.println("Senang bisa berkenalan dengan Anda!");

        input.close();
    }
}