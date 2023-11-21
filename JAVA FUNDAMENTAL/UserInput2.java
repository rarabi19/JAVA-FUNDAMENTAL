import  java.io.*;

public class UserInput2 {
    public static void main (String[] args) throws IOException {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		
		String jariJariImputan = bfn.readLine();
		final double phi = 3.14;
		int luasLingkaran = (phi * jariJari * jariJari);
		
		System.out.println(luasLingkaran);	
    }
}