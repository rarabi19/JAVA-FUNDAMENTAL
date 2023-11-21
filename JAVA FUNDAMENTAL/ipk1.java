import java.util.Scanner;

public class ipk1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Anda : " );
		String nama = input.nextLine();
		
		System.out.print("Masukkan Nilai UTS Kalkulus Anda : ");
		int kalkulus = input.nextInt();
		
		System.out.print("Masukkan Niai UTS Sistem Digitl : ");
		int sistemDigital = input.nextInt();
		
		System.out.print("Masukkan Nilai UTS Pemprograman : ");
		int pemprograman = input.nextInt();
		
		System.out.print("Masukkan Nilai UTS PTIK : ");
		int ptik = input.nextInt();
		
		double total = (kalkulus + sistemDigital + pemprograman + ptik) / 4;
		double nilai = total / 25;
		
		String prediket;
		switch (nilai) {
			case "A" :
				prediket = 4.0;
				break;
				
			case "B" :
				prediket = 3.0;
				break;
				
			case "E" :
				prediket = 2.0;
				break;
				
			case "D" :
				prediket = 1.0;
				break;
				
			case  "E" :
				prediket = 0.0;
				break;
		
		System.out.println("Kalkulus : " + kalkulus);
		System.out.println("Sistem Digital : " + sistemDigital);
		System.out.println("Pemprograman : " + pemprograman);
		System.out.println("PTIK : " + ptik);
		System.out.println(prediket + " = " + nilai);
		}
	}
}