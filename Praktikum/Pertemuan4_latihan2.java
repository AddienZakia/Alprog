package Praktikum;

import java.util.Scanner;

public class Pertemuan4_latihan2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a = 0, b = 0, n = 0;

        do {
            System.out.print("Beri suku pertama : ");
            a = data.nextInt();

            System.out.print("Beri beda tiap suku : ");
            b = data.nextInt();

            System.out.print("Beri banyak suku : ");
            n = data.nextInt();

            if (a < 0 || b < 0 || n < 0) {
                System.out.println("\nAngka tidak bisa negatif\n");
            }
        } while (a < 0 || b < 0 || n < 0);

        for (int i = a; i <= (a + (n - 1) * b); i += b) {
            System.out.print(i + " ");
        }

        data.close();
    }
}
