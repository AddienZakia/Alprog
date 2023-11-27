package Praktikum.Tugas.Tugas3;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang meminta inputan berupa 2 bilangan, dan 1 operator
         * kemudian gunakan switch untuk mengoperasikan bilangan tersebut
         * 
         */

        double bil1, bil2;
        String operator;

        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama : ");

        bil1 = data.nextDouble();
        System.out.print("Masukkan bilangan kedua : ");

        bil2 = data.nextDouble();
        Scanner op = new Scanner(System.in);

        System.out.print("Masukkan operator : ");
        operator = op.nextLine();

        op.close();
        data.close();

        double sum = 0;
        switch (operator) {
            case "+":
                sum = bil1 + bil2;
                break;
            case "-":
                sum = bil1 - bil2;
                break;
            case "*":
                sum = bil1 * bil2;
                break;
            case "/":
                sum = bil1 / bil2;
                break;
            default:
                System.out.println("Operator tidak ditemukan");
                return;
        }

        System.out.println("Hasil dari " + bil1 + " " + operator + " " +
                bil2 + " : " + sum);
    }
}
