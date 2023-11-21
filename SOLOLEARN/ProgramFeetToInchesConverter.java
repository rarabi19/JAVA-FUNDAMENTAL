import java.util.Scanner;

public class ProgramFeetToInchesConverter {
    static double convert(double feet) {
        double inchest = feet * 12.0;
        System.out.println(inchest);
        return inchest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble(); 

        convert(num);
    }
}