import java.util.Scanner;

// Materi looping

class Alprog {
	public static void main(String[] args) {
		
		/*
			Looping
			1. While loop
			2. Do While loop
			3. For loop
		*/
		
		// While loop
		// Program menghitung deret 1/2 + 1/3 + 1/4 + ... + 1/20
		double i = 2, hasil = 0;
		while (i <= 20) {
			hasil += 1 / i;
			i++;
		}
		System.out.println("Hasil akhir : " + hasil);
		
		
		// Do While loop
		// Program menghitung deret 1/2*3 + 2/3*4 + 3/4*5 + ... + n/(n+1) * (n+2)
		double j = 1, input, hasil_2 = 0;
		Scanner data_2 = new Scanner(System.in);
		
		System.out.print("Berikan nilai n : ");
		input = data_2.nextDouble();
		
		do {
			hasil_2 += j / (j+1) * (j+2);
			j++;
		} while (j <= input);
		
		System.out.println("Hasil akhir : " + hasil_2);
		
		
		// While loop
		// Program menghitung deret 1/2*3 + 2/3*4 + 3/4*5 + ... + n/(n+1) * (n+2)
		double k = 1, input_3, hasil_3 = 0;
		Scanner data_3 = new Scanner(System.in);
		
		System.out.print("Berikan nilai n : ");
		input_3 = data_3.nextDouble();
		
		while (k <= input_3) {
			hasil_3 += k / (k+1) * (k+2);
			k++;
		}
		System.out.println("Hasil akhir : " + hasil_3);
		
		
		// For loop
		// Pengunaan for loop pada program di atas
		double hasil_4 = 0, n;
		Scanner data_4 = new Scanner(System.in);
		
		System.out.print("Masukkan nilai n : ");
		n = data_4.nextDouble();
		
		for (double x = 1; x <= n; x++) {
			hasil_4 += n / (n+1) * (n+2);
		}
		System.out.println("Hasil akhir : " + hasil_4); 
		
		
	}
}