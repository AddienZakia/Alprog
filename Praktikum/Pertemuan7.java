package Praktikum;

import java.util.Scanner;

public class Pertemuan7 {
    public static void main(String[] args) {

        // Bilangan dua pangkat

        int index = 1;
        Scanner data = new Scanner(System.in);

        System.out.print("Contoh masukkan : ");
        int num = data.nextInt();

        data.close();

        while (Math.pow(2, index) <= num) {
            if (Math.pow(2, index) == num) {
                System.out.println("ya");
                return;
            }

            index++;
        }

        System.out.println("tidak");
    }
}
