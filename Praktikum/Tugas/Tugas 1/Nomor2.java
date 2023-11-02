import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        // Program menentukan apakah a hasil modulo dari b (no 2)
        int a, nilai, pembagi = 0;
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan nilai awal : ");
        nilai = data.nextInt();

        while (pembagi == 0) {
            System.out.print("Masukkan nilai kedua : ");
            pembagi = data.nextInt();

            if (pembagi == 0)
                System.out.println("Angka kedua atau pembagi tidak bisa diberi angka 0");
        }

        System.out.print("Masukkan nilai yang dicari : ");
        a = data.nextInt();

        data.close();

        String awalan = "\nNilai a yang dicari : " + a +
                "\nNilai awal          : " + nilai +
                "\nNilai yang dibagi   : " + pembagi;

        if (nilai % pembagi == a) {
            String tambahan = "\nHasil " + nilai + " % " + pembagi + " = " + a +
                    "\nHasilnya sama dengan nilai a yang dicari";
            System.out.println(awalan + tambahan);
        } else {
            String tambahan = "\nHasil " + nilai + " % " + pembagi + " = " + (nilai % pembagi) +
                    "\nHasilnya tidak sama dengan nilai a yang dicari";
            System.out.println(awalan + tambahan);
        }
    }
}
