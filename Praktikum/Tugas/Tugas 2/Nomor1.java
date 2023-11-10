import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang meminta inputan berupa biodata mahasiswa (nama,
         * nrp(int), kota asal) kemudian print atau display hasilnya
         * 
         */

        Scanner data = new Scanner(System.in);
        String nama, nama_lengkap, asal;
        long nrp;

        System.out.print("Berikan nama lengkap kamu : ");
        nama_lengkap = data.nextLine();

        System.out.print("Berikan nama panggilan kamu : ");
        nama = data.nextLine();

        System.out.print("Berikan kota asalmu : ");
        asal = data.nextLine();

        System.out.print("Berikan NRP mu : ");
        nrp = data.nextLong();

        data.close();

        String kata = "Biodata Mahasiswa " +
                "\nNama : " + nama_lengkap +
                "\nPanggilan : " + nama +
                "\nNomor NRP : " + nrp +
                "\nKota Asal : " + asal;

        System.out.println();
        System.out.println(kata);
    }
}