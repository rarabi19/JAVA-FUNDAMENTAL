import  java.util.Scanner;

public class ProgramBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();

        int boxNumber;

        switch (color) {
            case "red":
                boxNumber = 1;
                break;
            case "green":
                boxNumber = 2;
                break;
            case "black":
                boxNumber = 3;
                break;
            default:
                boxNumber = -1; // Handle unknown colors
                break;
     }

     if (boxNumber != -1) {
        System.out.println(boxNumber);
         } else {
        System.out.println("Unknown color");
        }

    }
}