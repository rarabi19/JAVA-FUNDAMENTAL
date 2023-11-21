import java.util.Scanner;

public class inputRumuslinkrn {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan Jari-Jari Lingkaran Anda : ");
	int jariJari = input.nextInt();
	double phi = 3.14;
	double keliling = 2 * jariJari * phi;
	double luas = jariJari * jariJari * phi;
	
	System.out.println("Jari-Jari : " + jariJari); 
	System.out.println("Phi : " + phi);
	System.out.println("Keliling : " + keliling);
	System.out.println("Luas : " + luas);
	}
}