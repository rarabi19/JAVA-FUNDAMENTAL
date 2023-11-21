import java.util.Scanner;

public class ProgramBot {

    public static void bot() {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Order confirmed");
        } else if (userInput == 2) {
            System.out.println("info@sololearn.com");
         } else {
            System.out.println("Try again");
         }

         scanner.close();
    }

    public static void main(String[] args) {
        bot();
    } 
}