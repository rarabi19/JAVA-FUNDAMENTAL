import java.util.Scanner;

public class genapGanji {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalData;
		int[] array = new int[6];
		int jumlah, data;
		
		System.out.print("Jumlah Data Yang Ingin Anda Masukkan : ");
		totalData = sc.nextInt();
		System.out.println(" Masukkan Angka Yang Ingin Anda Kelompokkan : ");
		
		for (int i = 0; i < totalData; i++) {
			System.out.print("Data Ke- " + (i) + " : ");
			array[i] = sc.nextInt();
		}
		
		System.out.println("Menampilkan Pengelompokan Data : ");
		for (int j = 0; j < totalData; j++) {
			if (array[j] % 2 == 0) {
				System.out.println(" " + array[j] + " >>> GENAP");
			} else {
				System.out.println(" " + array[j] + " >>> GANJIL");
			}
		}
		jumlah = 0;
		for (int k = 0; k < totalData; k++) {
			jumlah = jumlah + array[k];
		}
		data = jumlah / totalData;
		System.out.println("Total Jumlah Data Anda : " + jumlah);
		System.out.println("Rata - Rata Data Anda : " + data);
	}
}