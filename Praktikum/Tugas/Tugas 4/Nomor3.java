import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {

        /*
         * Buatlah program yang meminta input bilangan positif, lalu program
         * memberikan output faktor prima terkecil
         */

        Scanner data = new Scanner(System.in);

        int nilai;
        do {

            System.out.print("Masukkan nilai input : ");
            nilai = data.nextInt();

            if (nilai < 0) {
                System.out.println("\nAngka bilangan yang diberi harus berupa bilangan positif\n");
            }

        } while (nilai < 0);

        data.close();

        String hasil = "";

        int i = 2;
        int sum = nilai;
        while (i <= sum) {
            if (sum % i == 0) {
                hasil += i + " ";
                sum /= i;
            } else
                i++;
        }

        if (hasil.trim().equals(Integer.toString(nilai))) {
            System.out.println(nilai + " merupakan bilangan prima");
        } else {
            System.out.println("Faktor prima terkecil dari " + nilai + " adalah " + hasil);
        }
    }
}
