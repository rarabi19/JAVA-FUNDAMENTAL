import java.util.Scanner;

public class NilaiIndexIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan huruf: ");
        String letterGrade = scanner.nextLine();

        if (letterGrade.equals("A")) {
            System.out.println("4.0");
        } else if (letterGrade.equals("B")) {
            System.out.println("3.0");
        } else if (letterGrade.equals("C")) {
            System.out.println("2.0");
        } else if (letterGrade.equals("D")) {
            System.out.println("1.0");
        } else if (letterGrade.equals("E")) {
            System.out.println("0");
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
        }
    }
}