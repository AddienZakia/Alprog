import java.util.Scanner;

class Alprog {
	public static void main(String[] args) {
		
		// Deret 1/2 + 1/3 + 1/4 + ... + 1/20
		/* double i = 2, hasil = 0;
		while (i <= 20) {
			hasil += 1 / i;
			i++;
		}
		System.out.println("Hasil akhir : " + hasil); */
		
		
		// Deret 1/2*3 + 2/3*4 + 3/4*5 + ... + n/(n+1) * (n+2)
		/* double i = 1, input, hasil = 0;
		Scanner data = new Scanner(System.in);
		
		System.out.print("Berikan nilai n : ");
		input = data.nextDouble();
		
		while (i <= input) {
			hasil += i / (i+1) * (i+2);
			i++;
		}
		System.out.println("Hasil akhir : " + hasil); */
		
		// Pengunaan for loop pada program di atas
		double hasil = 0, n;
		Scanner data = new Scanner(System.in);
		
		System.out.print("Masukkan nilai n : ");
		n = data.nextDouble();
		
		for (double i = 1; i <= n; i++) hasil += n / (n+1) * (n+2);
		System.out.println("Hasil akhir : " + hasil); 
	}
}