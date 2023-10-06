
// Materi variable dasar
// Program mencari volume, luas bangun ruang dan bangun datar

class alpro {
	public static void main(String[] args) {
		// nilai phi
		double phi = 3.14;
		
		// Luas segitiga
		double alasSegitiga = 10, tinggiSegitiga = 3;
		double luasSegitiga;
		luasSegitiga = 0.5 * tinggiSegitiga * alasSegitiga;
		System.out.println("Luas segitiga : " + luasSegitiga);
		
		// Volume dan luas Permukaan balok
		double panjangBalok = 10, lebarBalok = 5, tinggiBalok = 3;
		double volumeBalok, luasBalok;
		volumeBalok = panjangBalok + tinggiBalok + lebarBalok;
		luasBalok = 2 * ((panjangBalok * lebarBalok) + (panjangBalok * tinggiBalok) + (lebarBalok * tinggiBalok));
		System.out.println("Volume balok : " + volumeBalok);
		System.out.println("Luas Permukaan balok : " +luasBalok);
		
		// Volume dan luas bola
		double jariBola = 10;
		double volumeBola, luasBola;
		volumeBola = (double)4/3 * phi * jariBola * jariBola * jariBola;
		luasBola = 4 * phi * jariBola * jariBola;
		System.out.println("Volume bola : " +volumeBola);
		System.out.println("Luas permukaan bola: " +luasBola);
		
		// volume dan luas tabung
		double tinggiTabung = 20, jariTabung = 10;
		double volumeTabung, luasTabung;
		volumeTabung = phi * jariTabung * jariTabung * tinggiTabung;
		luasTabung = 2 * phi * jariTabung + 2 * phi *jariTabung * jariTabung;
		System.out.println("Volume tabung : " +volumeTabung);
		System.out.println("Luas permukaan tabung: " +luasTabung);
		
	}
}