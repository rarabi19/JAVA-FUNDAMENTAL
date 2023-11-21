import java.util.Scanner;

public class NilaiIndex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai yang anda dapatkan: ");
		String grade = input.nextLine();
		double value;
		switch (grade) {
			case "A": value = 4.0;
			break;
			case "B": value = 3.0;
			break;
			case "C": value = 2.0;
			break;
			case "D": value = 1.0;
			break;
			case "E": value = 0.0;
			break;
			
			default:
				System.out.print("Maaf Huruf yang anda masukkan salah ");
				return;
		}
		
			System.out.println("Nilai numerik: " +value);
	}
}