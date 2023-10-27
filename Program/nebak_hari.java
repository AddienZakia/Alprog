import java.util.Scanner;

// Materi switch case
// Program untuk menebak beberapa hari kedepan

class nebak_hari {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

		System.out.print("Masukkan kode hari : ");
		int kodeHari = data.nextInt();

		System.out.print("Masukkan kode pasaran : ");
		int kodePasaran = data.nextInt();

		System.out.print("Masukkan lama hari : ");
		int jumlahHari = data.nextInt();

		data.close();

		String namaHari = "(tidak ditemukan)";
		switch ((jumlahHari + kodeHari) % 7) {
			case 0:
				namaHari = "Minggu";
				break;
			case 1:
				namaHari = "Senin";
				break;
			case 2:
				namaHari = "Selasa";
				break;
			case 3:
				namaHari = "Rabu";
				break;
			case 4:
				namaHari = "Kamis";
				break;
			case 5:
				namaHari = "Jumat";
				break;
			case 6:
				namaHari = "Sabtu";
				break;
			default:
				System.out.println("Kode tidak ditemukan");
				break;
		}

		String pasaran = "";
		switch ((jumlahHari + kodePasaran) % 5) {
			case 0:
				pasaran = "pon";
				break;
			case 1:
				pasaran = "wage";
				break;
			case 2:
				pasaran = "kliwon";
				break;
			case 3:
				pasaran = "legi";
				break;
			case 4:
				pasaran = "pahin";
				break;
			default:
				pasaran = "(Kode tidak ditemukan)";
				break;
		}

		System.out.println(jumlahHari + " Hari kedepan adalah hari " + namaHari + " dan hari " + pasaran);

	}
}