import java.util.Scanner;

public class inputpp1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Panjang Persegi Pangjang ? " );
		int panjang = input.nextInt();
		
		System.out.print("Masukkan Lebar Persegi Panjang ? " );
		int lebar = input.nextInt();
		double keliling = (panjang + lebar) * 2;
		double luas = panjang * lebar;
		
		System.out.println("Tunggu Sebentar Jawaban Anda Sedang Di Olah");
		System.out.println("Berikut Merupakan Jawaban Anda : " );
		System.out.println("Panjang : " + panjang);
		System.out.println("Lebar : " + lebar);
		System.out.println("Luas : " + luas);
		System.out.println("Keliling : " + keliling);
	}
}
		