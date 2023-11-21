import java.util.Scanner;

public class beBelajar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Jumlah Modal Anda : ");
		long modal = input.nextLong();
		
		System.out.print("Masukkan Jumlah Laba : ");
		long laba = input.nextLong();
		
		System.out.println("modal : " + modal);
		System.out.println("Laba : " + laba);
	}
}