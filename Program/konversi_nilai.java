import java.util.Scanner;

// Materi Pengkondisian
// Program konversi nilai angka (NA) menjadi nilai huruf (NH)

class konversi_nilai {
	public static void main(String_praktek[] args) {
		Scanner data = new Scanner(System.in);

		System.out.print("Masukkan Nilai Angka : ");
		int angka = data.nextInt();

		data.close();

		String nilaiHuruf;
		if (angka >= 86)
			nilaiHuruf = "A";
		else if (angka >= 76)
			nilaiHuruf = "AB";
		else if (angka >= 66)
			nilaiHuruf = "B";
		else if (angka >= 61)
			nilaiHuruf = "BC";
		else if (angka >= 56)
			nilaiHuruf = "C";
		else if (angka >= 41)
			nilaiHuruf = "D";
		else
			nilaiHuruf = "E";

		System.out.println("Nilai angka : " + angka);
		System.out.println("Nilai huruf : " + nilaiHuruf);
	}
}