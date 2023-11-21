import java.util.Scanner;

public class Negara2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan ID Negara : ");
		String idNegara = input.nextLine();
		
			if (idNegara.equals("ES")) {
				System.out.println("Spanyol");
				
			} else if (idNegara.equals("ID")) {
				System.out.println("Indonesia");
				
			} else if (idNegara.equals("IN")) {
				System.out.println("India");
				
			} else if (idNegara.equals("PC")) {
				System.out.println("Prancis");
				
			} else {
				System.out.println("ID Tidak Diketahui");
		}
	}
}