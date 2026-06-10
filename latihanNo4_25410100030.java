public class latihanNo4_25410100030 {

    public static void cetakNaik(int n) {
        if (n == 0) {
            System.out.println("Selesai!!!");
            return;
        }

        cetakNaik(n - 1);
        System.out.println("nilai n: " + n);
    }

    public static void main(String[] args) {
        cetakNaik(5);
    }
}