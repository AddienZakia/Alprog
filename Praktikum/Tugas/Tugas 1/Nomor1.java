import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        // Tugas praktikkum Senin, 9 oktober 2023

        // // Program rumus volume dan luas permukaan tabung (no 1)
        double jari_jari, tinggi, volume, luas;
        Scanner data = new Scanner(System.in);

        System.out.print("Masukkan jari jari pada alas tabung : ");
        jari_jari = data.nextDouble();

        System.out.print("Masukkan tinggi tabung : ");
        tinggi = data.nextDouble();

        data.close();

        volume = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        luas = 2 * Math.PI * jari_jari * (jari_jari + tinggi);

        String tulisan = "\nJari jari alas        : " + jari_jari +
                "\nTinggi tabung         : " + tinggi +
                "\nVolume tabung         : " + volume +
                "\nLuas permukaan tabung : " + luas;
        System.out.println(tulisan);

    }
}
