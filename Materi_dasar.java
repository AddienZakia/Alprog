import java.util.Scanner; // Kode awal untuk membuat input

class Dasar {
	public static void main(String[] args) {

		// Variable
		int angka = 1;
		double desimal = 3.2;
		// char huruf = "a";
		String kalimat = "Hello world";
		boolean kebenaran = true; // true / false

		// Print / Output
		System.out.println("Hello world"); // output = Hello world, print -> buat baris baru

		System.out.print("Hello"); // Print tanpa buat baris baru
		System.out.print("World"); // output = HelloWorld

		String nama = "fulan";
		System.out.println(nama); // Print variable nama

		// Comment block
		/*
		 * berguna untuk memberi penjelasan pada sebuah kode,
		 * comment block tidak dapat berpengaruh pada kode
		 * sehingga jika dijalankan tidak terjadi apa-apa
		 */

		// Single line comment

		/*
		 * Multiple line comment
		 * comment dengan lebih dari 1 bari
		 */

		// Operasi matematika
		int penambahan = 10 + 5;
		int pengurangan = 12 - 4;
		int perkalian = 20 * 3;
		int modulo = 10 % 3; // 10 mod 3 = 1,

		int pembagian = 30 / 3; // hasil = 10, jika 5 / 2 = 2 karna tipe data pada variable adalah integer
		double pembagian_double = 15 / 3; // hasil = 5, jika 5 / 2 = 2.5 karna tipe data pada variable adalah double

		// Input / Output
		// Sebelum melakukan input, import terlebih dahulu
		Scanner data_awal = new Scanner(System.in);
		int input_angka = data_awal.nextInt();
		String input_string = data_awal.nextLine();
		double input_double = data_awal.nextDouble(); // hasil inputan akan tersimpan ke dalam variable

		System.out.println(input_angka); // outputnya = isi di dalam variable input_angka

		// Pengkondisian / if else
		int contoh = 10;
		if (contoh < 10)
			System.out.println("Angka di bawah 10");
		else if (contoh == 10)
			System.out.println("Angka bukan di bawah 10, melainkan sama dengan 10");
		else
			System.out.println("Angka bukan di bawah 10 dan sama dengan 10 ataupun keduanya");

		// Switch case
		String matkul = "fisika";
		switch (matkul) {
			case "matematika":
				System.out.println("Matkul matematika");
				break;
			case "fisika":
				System.out.println("Matkul bukan matematika, melainkan fisika");
				break;
			case "kimia":
				System.out.println("Matkul bukan matematika dan fisika, melainkan kimia");
				break;
			default:
				System.out.println("Matkul bukan ketiganya");
				break;
		}

		// looping

		// while loop
		int awal = 0;
		while (awal < 10) {
			System.out.println("angka belum mencapai 10, angka : " + awal);
			awal++;
		}
		System.out.println("angka sudah mencapai 10");

		// do while loop
		int awal_2 = 0;
		do {
			System.out.println("angka belum mencapai 10, angka : " + awal_2);
			awal_2++;
		} while (awal_2 < 10);
		System.out.println("angka sudah mencapai 10");

		// For loop
		for (int awal_looping = 0; awal_looping < 10; awal_looping++) {
			System.out.println("angka belum mencapai 10, angka : " + awal_looping);
		}
		System.out.println("angka sudah mencapai 10");

	}
}