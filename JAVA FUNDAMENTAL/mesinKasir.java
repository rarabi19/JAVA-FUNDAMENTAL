import java.util.Scanner;

public class mesinKasir {
	public static void main(String[] args) {
				
		int[] hargaBarang = {2500, 3000, 4000, 5000, 6000 };
		int[] banyakBarang = new int[hargaBarang.length];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < hargaBarang.length; i++) {
			System.out.print("Masukkan Jumlah barang item-" + (i) + ": ");
			banyakBarang[i] = scanner.nextInt();
		}
		
		int totalBelanja = 0;
		
		System.out.println("\n****Struk Belanja Anda Hari Ini****");
		for (int i = 0; i < hargaBarang.length; i++) {
			int totalItem = hargaBarang[i] * banyakBarang[i];
			totalBelanja += totalItem;
			
			System.out.println("item-" + (i) + ": " + banyakBarang[i] + " Barang * Rp" + hargaBarang[i] + " =  Rp" + totalItem);
		}
		
		System.out.println("\nTotal Belanja : Rp " + totalBelanja);
		
		scanner.close();
	}
}