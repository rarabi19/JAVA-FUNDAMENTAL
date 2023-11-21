import  java.util.Scanner;

public class ProgramBoiling {
    public static void main(String[] args) {
          //your code goes here
        Scanner sc = new Scanner(System.in);
        int temperatureCelsius = sc.nextInt();

         if (temperatureCelsius >= 100) {
           System.out.println("Boiling");
         } else { 
             System.out.println("Not boiling");       
       }
    }
}