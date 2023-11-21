import java.util.Scanner;

public class HargaBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print(" 1 : " + item1);
		System.out.print(" 2 : " + item2);
		System.out.print(" 3 : " + item3);
		System.out.print(" 4 : " + item4);
        int numItems, i = 1;
        double itemPrice, totalCost = 0;

        System.out.print("Enter the number of items: ");
        numItems = input.nextInt();
		String[] items = new String[numItems];
        double[] prices = new double[numItems];

        System.out.println("Enter the items and their prices:");
        do {
            System.out.print("Item " + i + ": ");
            items[i-1] = input.next();
            System.out.print("Price: ");
            prices[i-1] = input.nextDouble();
            totalCost += prices[i-1];
            i++;
        } while (i <= numItems);

        System.out.println("Item\tPrice");
        for (int j = 0; j < numItems; j++) {
            System.out.println(items[j] + "Rp" + prices[j]);
        }

        System.out.println("Total Biaya" + totalCost);
    }
}