import java.util.Scanner;

public class ProgramCelsiusToFahrenheit {
    // Define the fahr() method to convert Celsius to Fahrenheit
    static double fahr(double Celsius) {
        double fahrenheit = 1.8 * Celsius +32;
        return fahrenheit;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c)); // call the fahr() method and print the resvlt
    }
}