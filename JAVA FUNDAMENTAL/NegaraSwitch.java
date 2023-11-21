import java.util.Scanner;

public class NegaraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode negara (2 huruf): ");
        String countryCode = scanner.nextLine();

        switch (countryCode) {
            case "ES":
                System.out.println("Spain");
                break;
            case "TN":
                System.out.println("TUNISIA");
                break;
            case "ID":
                System.out.println("INDONESIA");
                break;
            case "MM":
                System.out.println("Myanmar");
                break;
            case "IN":
                System.out.println("INDIA");
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                break;
        }
    }
}