import java.util.Scanner;

// Materi input dan output
// Program menukar 2 buah data dari in

class Alprog {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Program untuk menukar 2 buah data");
		System.out.println(" ");
		
		System.out.print("Masukkan data 1 = ");
		int data_1 = data.nextInt();
		
		System.out.print("Masukkan data 2 = ");
		int data_2 = data.nextInt();
		
		System.out.println("");
		System.out.println("Data 1 yang lama = " + data_1);
		System.out.println("Data 2 yang lama = " + data_2);
		System.out.println("");
		
		int data_baru = data_1;
		data_1 = data_2;
		data_2 = data_baru;
		
		System.out.println("Data 1 yang baru = " + data_1);
		System.out.println("Data 2 yang baru = " + data_2);
	}
}