import java.util.Scanner;

public class cobaCoba {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int item0 = 20000;
		int item1 = 25000; 
		int item2 = 30000;
		int item3 = 35000;
		int item4 = 40000;
		int item5 = 60000;
		
		System.out.println("Selamat Datang Tuan Silahkan Masukkan Jumalah Barang yang anda Beli :");
		System.out.print("Harga Item 0 = Rp 20.000 = ");
		int B0 = input.nextInt(); 
		
		System.out.print("Harga Item 1 = Rp 25.000 = ");
		int B1 = input.nextInt(); 
		
		System.out.print("Harga Item 2 = Rp 30.000 = ");
		int B2 = input.nextInt(); 
		
		System.out.print("Harga Item 3 = Rp 35.000 = ");
		int B3 = input.nextInt(); 
		
		System.out.print("Harga Item 4 = Rp 40.000 = ");
		int B4 = input.nextInt(); 
		
		System.out.print("Harga Item 5 = Rp 60.000 = ");
		int B5 = input.nextInt(); 
		
		int total = ((item0 * B0) + (item1 * B1) + (item2 * B2) + (item3 * B3) + (item4 * B4) + (item5 * B5));
		System.out.println("Total Belanja Anda : " + "Rp" + total);
	}
}