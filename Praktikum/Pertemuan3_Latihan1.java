package Praktikum;

import java.util.Scanner;

public class Pertemuan3_Latihan1 {
    public static void main(String[] args) {
        int bil1, bil2;
        String operator;

        Scanner data = new Scanner(System.in);
        System.out.print("Tentukan bilangan 1 : ");
        bil1 = data.nextInt();

        System.out.print("Tentukan bilangan 2 : ");
        bil2 = data.nextInt();

        Scanner baca = new Scanner(System.in);
        System.out.print("Masukkan operator : ");
        operator = baca.nextLine();

        data.close();
        baca.close();

        int sum = 0;

        if (operator.equals("+"))
            sum = bil1 + bil2;
        else if (operator.equals("-"))
            sum = bil1 - bil2;
        else if (operator.equals("*"))
            sum = bil1 * bil2;
        else if (operator.equals("/"))
            sum = bil1 / bil2;
        else if (operator.equals("%"))
            sum = bil1 % bil2;

        System.out.println(bil1 + " " + operator + " " + bil2 + " = " + sum);
    }
}
