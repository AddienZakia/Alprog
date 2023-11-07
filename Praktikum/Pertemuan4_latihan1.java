package Praktikum;

import java.util.Scanner;

public class Pertemuan4_latihan1 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan angka faktorial : ");
        int num = data.nextInt();

        data.close();

        int sum = 1;
        for (int i = 1; i <= num; i++)
            sum *= i;

        System.out.println("Hasil faktorial : " + sum);

    }
}
