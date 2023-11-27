package Praktikum.Tugas.Tugas3;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {

        /*
         *
         * Buatlah program yang meminta inputan berupa jari-jari dan tinggu, lalu
         * program menawarkan angka 1-4 dimana 1 menampilkan switch lingkaran, 2
         * menampilkan switch tabung, 3 menampilkan switch kerucut dan 4 switch bola.
         * Masing-masing switch akan menampilkan pilihan lagi, mulai dari lingkaran
         * menampilkan pilihan 1 untuk luas dan 2 untuk keliling, sedangkan tabung
         * menampilkan 1 untuk volume dan 2 untuk luas, dst.
         * 
         */

        double jari_jari, tinggi = 0;

        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan jari jari lingkaran : ");
        jari_jari = data.nextDouble();

        System.out.print("Masukkan tinggi bangun : ");
        tinggi = data.nextDouble();

        int opsi1, opsi2;
        Scanner opsi = new Scanner(System.in);
        String pilihan = "\n1. Lingkaran" +
                "\n2. Tabung" +
                "\n3. Kerucut" +
                "\n4. Bola";

        String kata1 = "\nPilih bangun yang ingin dicari : ";
        System.out.print(pilihan + kata1);
        opsi1 = opsi.nextInt();

        String rumus_datar = "\n1. Keliling" +
                "\n2. Luas";
        String rumus_ruang = "\n1. Volume" +
                "\n2. Luas Permukaan";
        String kata2 = "\nPilih opsi rumus : ";
        System.out.print((opsi1 == 1 ? rumus_datar : rumus_ruang) +
                kata2);

        opsi2 = opsi.nextInt();
        opsi.close();
        data.close();

        double sum = 0;
        switch (opsi1) {
            case 1:
                switch (opsi2) {
                    case 1:
                        sum = 2 * Math.PI * jari_jari;
                        break;
                    case 2:
                        sum = Math.PI * jari_jari * jari_jari;
                        break;
                    default:
                        System.out.println("Nomor pilihan rumus yang kamu pilih tidak tersedia");
                        return;
                }
                break;
            case 2:
                switch (opsi2) {
                    case 1:
                        sum = Math.PI * Math.pow(jari_jari, 2) * tinggi;
                        break;
                    case 2:
                        sum = 2 * Math.PI * jari_jari * (jari_jari +
                                tinggi);
                        break;
                    default:
                        System.out.println("Nomor pilihan rumus yang kamu pilih tidak tersedia");
                        return;
                }
                break;
            case 3:
                switch (opsi2) {
                    case 1:
                        sum = (1.0 / 3) * Math.PI * Math.pow(jari_jari,
                                2) * tinggi;
                        break;
                    case 2:
                        double pelukis = Math.sqrt(Math.pow(jari_jari, 2)
                                + Math.pow(tinggi, 2));
                        sum = Math.PI * jari_jari * (jari_jari +
                                pelukis);
                        break;
                    default:
                        System.out.println("Nomor pilihan rumus yang kamu pilih tidak tersedia");
                        return;
                }
                break;
            case 4:
                switch (opsi2) {
                    case 1:
                        sum = (4.0 / 3) * Math.PI * Math.pow(jari_jari,
                                3);
                        break;
                    case 2:
                        sum = 4 * Math.PI * Math.pow(jari_jari, 2);
                        break;
                    default:
                        System.out.println("Nomor pilihan rumus yang kamu pilih tidak tersedia");
                        return;
                }
                break;
            default:
                System.out.println("Nomor pilihan bangun yang kamu pilih tidak tersedia");
                return;
        }

        String pilihan_rumus;
        if (opsi1 == 1) {
            if (opsi2 == 1)
                pilihan_rumus = "Keliling";
            else
                pilihan_rumus = "Luas";
        } else {
            if (opsi2 == 1)
                pilihan_rumus = "Volume";
            else
                pilihan_rumus = "Luas permukaan";
        }

        String jenis[] = { "Lingkaran", "Tabung", "Kerucut", "Bola" };
        String hasil = "\nRumus " + pilihan_rumus + " " + jenis[opsi1 -
                1] +
                "\nJari-jari lingkaran : " + jari_jari +
                "\nTinggi bangun : " + (opsi1 == 1 ? 0 : tinggi) +
                "\nHasil akhir : ";

        System.out.print(hasil);
        System.out.printf("%.2f", sum);
        System.out.println("\n");
    }
}