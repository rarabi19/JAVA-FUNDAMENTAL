import java.util.Scanner;

public class Study1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Selamat Datang Di Sistem Kami ");
		System.out.println("Boleh Saya Tau siapa Nama Anda Tuan?  ");
		String nama = input.nextLine();
		System.out.println( nama + "??? Salam Kenal Tuan,nama saya Lulu  ");
		System.out.println("-(Katakan Hello Kepada Lulu)-");
		
		Scanner keyboard = new Scanner(System.in); 
		char reply;
			do {
		System.out.println("--(y atau t)--");
		reply = keyboard.findWithinHorizon(".",0).charAt(0);
		// nextLine
			} while (reply != 'y' && reply != 't');
				
			 if (reply == 'y') {
					 System.out.println("Hallo juga tuan  ");
					 //nextLine
					System.out.println("Lulu sangat senang bisa bertemu dengan anda  ");
								
								System.out.println("Apakah Hari Ini Anda Akan Bermain Bersama Dengan Lulu? ");
								System.out.println("--(y atau t)--");
								String pilihan = input.nextLine();
									
									String jawaban;
									switch (pilihan) {
										case "y" :
											jawaban = ("Benarkah ??? Lulu sangat senang :) , Permainan Apa Yang Akan Kita Mainkan Tuan ? ");
											break;
										case "t" :
											jawaban = ("sayang sekali, Kalau Begitu Sampai Jumpa Lagi tuan :( ");
											break;
										default:
											System.out.println("Maaf Tuan Bahasa Anda Tidak Dapat Lulu Mengerti :( ");
										return;	
					}
						System.out.println(pilihan);
						System.out.println(jawaban);
						System.out.println("-(Sebutkan Permainan Yang Ingin Kamu Mainkan Bersama Sistem)-");
						String jawaban2 = input.nextLine();
						System.out.println(jawaban2 + " ??? Baik Mari Kita Mulai permainannya,..");
						// line break
						System.out.println(" Lulu Pasti Akan Menang Dalam Permainan " + jawaban2 + " ini ! ");
		}
	}
}
		
		
		