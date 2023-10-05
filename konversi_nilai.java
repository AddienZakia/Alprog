import java.util.Scanner;

class Konversi {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai Angka : ");
		int angka = data.nextInt();
		
		String nilaiHuruf;
		if (angka >= 86) nilaiHuruf = "A";
		else if (angka >= 76) nilaiHuruf = "AB";
		else if (angka >= 66) nilaiHuruf = "B";
		else if (angka >= 61) nilaiHuruf = "BC";
		else if (angka >= 56) nilaiHuruf = "C";
		else if (angka >= 41) nilaiHuruf = "D";
		else nilaiHuruf = "E";
		
		System.out.println("Nilai angka : " + angka);
		System.out.println("Nilai huruf : " + nilaiHuruf);
	}
}