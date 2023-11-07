package Praktikum;

import java.util.Scanner;

public class Pertemuan4_latihan3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int num = data.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");

        int sum = 0;
        while (sum < num) {
            sum = a + b;

            System.out.print(sum + " ");
            int x = a;
            a = b;
            b = sum;
        }

        data.close();
    }
}
