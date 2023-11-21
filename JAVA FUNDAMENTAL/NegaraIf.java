import java.util.Scanner;

public class NegaraIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf): ");
        String countryCode = scanner.nextLine();

        if (countryCode.equals("ES")) {
            System.out.println("Spain");
        } else if (countryCode.equals("TN")) {
            System.out.println("TUNISIA");
        } else if (countryCode.equals("ID")) {
            System.out.println("INDONESIA");
        } else if (countryCode.equals("MM")) {
            System.out.println("Myanmar");
        } else if (countryCode.equals("IN")) {
            System.out.println("INDIA");
        } else {
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }
    }
}