import java.util.Scanner;

public class Negara1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan ID Negara : ");
		String idNegara = input.nextLine();
		
		switch (idNegara) {
			case "ES" :
				System.out.println("Spanyol");
				break;
				
			case "ID" :
				System.out.println("Indonesia");
				break;
				
			case "IN" :
				System.out.println("India");
				break;
				
			case "PC" :
				System.out.println("Prancis");
				break;
				
			default :
				System.out.println("ID Tidak Diketahui");
				return;
		}
	}
}