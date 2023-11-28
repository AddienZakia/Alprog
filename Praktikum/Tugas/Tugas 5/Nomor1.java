/*
* Buat program meminta inputan bilangan positif n, lalu jumlahkan semua
* bilangan prima yang kurang dari. Apabila jumlahan sudah melebih dari 5n,
* maka program akan berhenti. Output program berupa bilangan prima terakhir
* dari hasil jumlahannya
*/

import java.util.Scanner;

public class Nomor1 {
    static int prima(int bil) {
        int current = 0;

        for (int i = 2; i <= bil; i++) {
            boolean def = i == 2 || i == 3 || i == 5 || i == 7;
            boolean cek = i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0;
            if (def || !(cek))
                current = i;
        }

        return current;
    }

    static int jumlah(int bil) {
        int sum = 0;

        for (int i = 2; i <= bil; i++) {
            boolean def = i == 2 || i == 3 || i == 5 || i == 7;
            boolean cek = i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0;

            if (def || !(cek)) {
                if (sum + i > 5 * bil)
                    break;
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int bilangan = 0;
        do {
            System.out.print("Masukkan inputtan bilangan positif : ");
            bilangan = data.nextInt();

            if (bilangan < 0) {
                System.out.println("Bilangan yang kamu beri harus berupa bilangan positif");
            }
        } while (bilangan < 0);

        data.close();

        int bilPrima = prima(bilangan);
        int jumlahPrima = jumlah(bilangan);

        System.out.println("Bilangan prima terakhir : " + bilPrima);
        System.out.println("Hasil jumlahnya : " + jumlahPrima);
    }
}