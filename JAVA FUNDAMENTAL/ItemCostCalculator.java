import java.util.Scanner;

public class ItemCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems, i = 1;
        double itemPrice, totalCost = 0;

        System.out.print("Enter the number of items: ");
        numItems = input.nextInt();

        System.out.println("Item\tPrice");
        do {
            System.out.print("Enter the price of item " + i + ": ");
            itemPrice = input.nextDouble();
            totalCost += itemPrice;
            System.out.println("Item " + i + "\t$" + itemPrice);
            i++;
        } while (i <= numItems);

        System.out.println("Total cost:\t$" + totalCost);
    }
}