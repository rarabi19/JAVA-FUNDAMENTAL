import java.util.Scanner;

public class NilaiIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        String grade = input.nextLine();

        double value;
        switch (grade) {
            case "A":
                value = 4.0;
                break;
            case "B":
                value = 3.0;
                break;
            case "C":
                value = 2.0;
                break;
            case "D":
                value = 1.0;
                break;
            case "E":
                value = 0.0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                return;
        }

        System.out.println("Nilai numerik: " + value);
    }
}