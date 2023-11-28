/*
* Write a method with the following header to display an integer in reverse order. 
*/

import java.util.Scanner;

public class Nomor3 {
    static String reverse(int number) {
        String kata = Integer.toString(number);
        boolean cekNegatif = false;

        if (kata.charAt(0) == '-') {
            kata = kata.substring(1);
            cekNegatif = true;
        }

        String hasil = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            hasil += kata.charAt(i);
        }

        return cekNegatif == true ? "-" + hasil : hasil;
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int num;

        System.out.print("Masukkan bilangan : ");
        num = data.nextInt();

        data.close();

        String result = reverse(num);
        System.out.println("bil : " + result);
    }
}