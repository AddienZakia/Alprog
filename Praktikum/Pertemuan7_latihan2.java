package Praktikum;

import java.util.Scanner;

public class Pertemuan7_latihan2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int n = data.nextInt();

        int besar = 1;
        int kecil = 1;

        for (int i = 0; i < n; i++) {

            int input = data.nextInt();

            if (i == 0) {
                besar = input;
                kecil = input;
            }

            if (input > besar)
                besar = input;
            else if (input < kecil)
                kecil = input;

        }

        data.close();

        System.out.println(besar + " " + kecil);
    }
}
