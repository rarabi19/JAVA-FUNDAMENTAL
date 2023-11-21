import  java.io.*;

public class UserInput {
    public static void main (String[] args) throws IOException {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		
		String inputan = bfn.readLine();
		int pajang = bfn.readLine();
		System.out.println(inputan);
		
    }
}