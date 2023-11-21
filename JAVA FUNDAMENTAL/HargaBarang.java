import java.util.Scanner;

public class HargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems = 5, i = 1;
        double itemPrice, totalCost = 0;
		double item0 = 25000;
		double item1 = 30000;
		double item2 = 40000;
		double item3 = 50000;
		double item4 = 60000; 

        System.out.println("Masukkan Item Barang: ");
		Scanner Barang = input.nextInt();
		
        do {

			
            totalCost += itemPrice;
            System.out.println("Item " + itemPrice);
            i++;
        } while (i <= numItems);

        System.out.println("Total cost:\t$" + totalCost);
    }
}