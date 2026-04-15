import java.util.Scanner;

public class HitungIPSM3_25410100030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mata Kuliah 1
        System.out.print("Masukkan nama mata kuliah semester 1: ");
        String mk1 = input.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah semester 1: ");
        int sks1 = input.nextInt();

        System.out.print("Masukkan nilai (24 sks=3.50-4.00, 22 sks=3.00-3.49, 20 sks=2.00-2.99, 18 sks=1.00-1.99): ");
        double nilai1 = input.nextDouble();
        input.nextLine(); // buang enter

        // Mata Kuliah 2
        System.out.print("\nMasukkan nama mata kuliah semester 2: ");
        String mk2 = input.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah semester 2: ");
        int sks2 = input.nextInt();

        System.out.print("Masukkan nilai (24 sks=3.50-4.00, 22 sks=3.00-3.49, 20 sks=2.00-2.99, 18 sks=1.00-1.99): ");
        double nilai2 = input.nextDouble();
        input.nextLine(); // buang enter

        // Mata Kuliah 3
        System.out.print("\nMasukkan nama mata kuliah semester 3: ");
        String mk3 = input.nextLine();

        System.out.print("Masukkan jumlah SKS mata kuliah semester 3: ");
        int sks3 = input.nextInt();

        System.out.print("Masukkan nilai (24 sks=3.50-4.00, 22 sks=3.00-3.49, 20 sks=2.00-2.99, 18 sks=1.00-1.99): ");
        double nilai3 = input.nextDouble();
        input.nextLine(); // buang enter

        // Perhitungan IPS
        double totalBobot = (sks1 * nilai1) + (sks2 * nilai2) + (sks3 * nilai3);
        int totalSKS = sks1 + sks2 + sks3;
        double ips = totalBobot / totalSKS;

        // Penentuan SKS maksimal
        int sksMaks;
        if (ips >= 3.50) {
            sksMaks = 24;
        } else if (ips >= 3.00) {
            sksMaks = 22;
        } else if (ips >= 2.00) {
            sksMaks = 20;
        } else {
            sksMaks = 18;
        }

        // Output
        System.out.println("\nHASIL SKS YANG DIPEROLEH");
        System.out.println("IPS Mahasiswa: " + ips);
        System.out.println("SKS Maksimal yang dapat diambil semester selanjutnya: " + sksMaks);
    }
}