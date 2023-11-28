import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {

        /*
         * Buatlah program yang meminta inputan berupa bilangan x dan batas bilangan.
         * Program akan menampilkan semua bilangan dari 1 sampai batas yang tidak
         * habis dibagi oleh x, misal : x = 3 dan batas = 10, maka muncul
         * 1,2,3,4,5,7,8,10
         * 
         */

        Scanner data = new Scanner(System.in);

        int x = 0, batas = 0;
        do {

            System.out.print("Masukkan nilai x : ");
            x = data.nextInt();

            System.out.print("Masukkan nilai batas : ");
            batas = data.nextInt();

            if (x < 0 || batas < 0) {
                System.out.println("\nAngka bilangan yang diberi harus berupa bilangan positif\n");
            }

        } while (x < 0 || batas < 0);

        data.close();

        for (int i = 1; i <= batas; i++) {
            if (i % x == 0)
                continue;
            System.out.print(i + " ");
        }

    }
}
