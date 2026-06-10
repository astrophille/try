import java.util.Scanner;
public class prosedur {
    //blok class
    //membuat prosedur / function, serta variabel class-level

    //variabel class-level: static
    static Scanner scanner = new Scanner(System.in);

    //procedure input >> ada scanner
    static void inputData(){
        //nilai tugas, nilai uts, nilai uas
        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = scanner.nextInt();

        //panggil function
        nilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);
    }

    //function
    static int nilaiAkhir(int tugas, int uts, int uas){
        //NA = (30%  * tugas) + (30% * UTS) + (40% * UAS) [dibalik biar ga]
        int NA = (tugas*30/100) + (uts*30/100) + (uas*40/100);
        System.out.println("Nilai Akhir: " + NA);
        return NA;
    }

    public static void main(String[] args) {

        //perbedaan signifikan antara prosedur dan fungsi
        /* 
        1. prosedur: void, fungsi: tipe data & return
        2. Procedur tidak mengembalikan nilai, sedangkan fungsi mengembalikan nilai */

        //memanggil prosedur dan function
        inputData();

    }
    
}

