package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pertemuan2 {
    public static void main(String[] args) {

        try {
            BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Masukkan huruf : ");
            String huruf = data.readLine();

            System.out.print("Masukkan angka : ");
            int angka = Integer.parseInt(data.readLine());

            System.out.println("Contoh huruf : " + huruf);
            System.out.println("Contoh angka : " + angka);

        } catch (IOException e) {

            System.out.println("Terjadi kesalahan saat membaca input.");

        } catch (NumberFormatException err) {

            System.out.println("Terjadi kesalahan saat konversi nomor");

        }

    }
}
