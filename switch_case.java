import java.util.Scanner;

class belajar {
	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in);
		
		System.out.print("Masukkan kode hari : ");
		int kodeHari = data.nextInt();
		
		System.out.print("Masukkan jumlah hari : ");
		int jumlahHari = data.nextInt();
		
		String namaHari = "(tidak ditemukan)";
		switch((jumlahHari + kodeHari) % 7) {
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
		
		System.out.println("Sekarang ada di hari : " + namaHari);
		
	}
} 