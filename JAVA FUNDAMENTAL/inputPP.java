import java.util.Scanner;

public class inputPP {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("masukkan panjang persegi panjang : ");
		double panjang = input.nextDouble();
	
		System.out.print("masukkan lebar persegi panjang : ");
		double lebar = input.nextDouble();

		double keliling = (panjang + lebar) * 2;
		double luas = panjang * lebar;
		
		System.out.println("panjang : " + panjang);
		System.out.println("lebar : " + lebar);
		System.out.println("keliling : " + keliling);
		System.out.println("luas : " + luas);
	}
}