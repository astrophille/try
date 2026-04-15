import java.util.Scanner;

public class HitungPoinSSKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // inisialisasi array dengan nilai default
        String[] kegiatan = {"-"}; 
        int poinSSKM = 0, total = 0;

        // perulangan input 5x
        for (int i = 0; i < 5; i++) {
            System.out.println("Data ke: " + i);

            System.out.print("Nama kegiatan : ");
            String namaKegiatan = input.nextLine();
            namaKegiatan = input.nextLine();

            System.out.print("Poin SSKM : ");
            String poinSSKMS = input.nextLine();
            System.out.println();
            input.nextLine();

            total += poinSSKM; //total = total + poinSSKM
                            //0 = 0+3
                            //3 = 3+5
                            //dst

            
        }

        input.close(); 
    }
}