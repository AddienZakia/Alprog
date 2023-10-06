import java.util.Scanner;

// Materi input output
// Program menghitung nilai akhir 

class Konversi {
	public static void main(String[] args) {
		
		String Nama_Mhs;
		double tugas, kuis1, kuis2, ets, eas, nilai_akhir;
		Scanner data = new Scanner(System.in);
		
		System.out.print("Masukkan nama mahasiswa : ");
		Nama_Mhs = data.nextLine();
		System.out.print("Masukkan nilai tugas    : ");
		tugas = data.nextDouble();
		System.out.print("Masukkan nilai kuis 1   : ");
		kuis1 = data.nextDouble();
		System.out.print("Masukkan nilai kuis 2   : ");
		kuis2 = data.nextDouble();
		System.out.print("Masukkan nilai ETS      : ");
		ets = data.nextDouble();
		System.out.print("Masukkan nilai EAS      : ");
		eas = data.nextDouble();
		
		nilai_akhir = (0.2 * tugas) + (0.15 * kuis1) + (0.15 * kuis2) + (0.25 * ets) + (0.25 * eas);
		
		System.out.println("");
		System.out.println("Nama Mahasiswaa : " + Nama_Mhs);
		System.out.println("Nilai tugas 	: " + tugas);
		System.out.println("Nilai kuis 1 	: " + kuis1);
		System.out.println("Nilai kuis 2 	: " + kuis2);
		System.out.println("Nilai ETS 	: " + ets);
		System.out.println("Nilai EAS 	: " + eas);
		System.out.println("Nilai akhir 	: " + nilai_akhir);
	}
}