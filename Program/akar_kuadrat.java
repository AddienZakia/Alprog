import java.util.Scanner;

// Materi Pengkondisian 
// Progam mencari akar persamaan kuadrat

public class akar_kuadrat {
	public static void main(String_praktek[] args) {

		double a, b, c, diskriminan, x1, x2;
		Scanner data = new Scanner(System.in);

		System.out.print("Masukkan nilai A = ");
		a = data.nextDouble();

		System.out.print("Masukkan nilai B = ");
		b = data.nextDouble();

		System.out.print("Masukkan nilai C = ");
		c = data.nextDouble();

		data.close();

		diskriminan = Math.pow(b, 2) - (4.0 * a * c);
		System.out.println("Nilai diskriminan adalah " + diskriminan);

		if (diskriminan > 0) {
			x1 = ((-b + Math.sqrt(diskriminan)) / (2.0 * a));
			x2 = ((-b - Math.sqrt(diskriminan)) / (2.0 * a));
			System.out.println("Nilai x1 adalah " + x1);
			System.out.println("Nilai x2 adalah " + x2);
		} else if (diskriminan == 0) {
			x1 = (-b / (2.0 * a));
			x2 = x1;
			System.out.println("Nilai x1 = x2 adalah " + x1);
		} else {
			// double d1, p1, q1;
			// d1 = Math.abs(diskriminan);
			// p1 = -b / (2.0 * a); // bagian real
			// q1 = Math.sqrt(d1) / (2.0 * a); // bagian imajiner
			// System.out.println("Nilai x1 = " + p1 + "+" + q1 + "i");
			// System.out.println("Nilai x2 = " + p1 + "-" + q1 + "i");

			System.out.println("Persamaan tidak memiliki akar-akar yang real");
		}

	}
}