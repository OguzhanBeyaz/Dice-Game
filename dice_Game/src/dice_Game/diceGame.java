package dice_Game;

import java.util.Scanner;

public class diceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int player;
		int computer;
		int PCscore = 0;
		int Pscore = 0;
		
		while(true) {
		
		System.out.println("Başlatmak İçin Ok Yazın = ");
		String start = scan.nextLine();
		System.out.println("");
		
		 player = (int)(Math.random()*6);
		 computer = (int)(Math.random()*6);
		 
		 
		 if(player == computer) {
			 System.out.println("Berabere Kaldınız...");
			 
			 System.out.println("");
			 
			 System.err.println("Oyuncunun Sonucu = " + player);
			 System.err.println("PC Sonucu = " + computer);
			 
			
			 
			 PCscore++;
			 Pscore++;
			 System.out.println("Oyuncu Skor = " + Pscore +" PC Skor = " + PCscore);
			 System.out.println("");
		 }
		 else if(player < computer) {
			 System.out.println("PC Kazandı...");
			 
			 System.out.println("");
			 
			 System.err.println("Oyuncunun Sonucu = " + player);
			 System.err.println("PC Sonucu = " + computer);
			 
			 
			 PCscore+=3;
			 System.out.println("Oyuncu Skor = " + Pscore +" PC Skor = " + PCscore);
			 System.out.println("");
		 }
		 else if(player > computer) {
			 System.out.println("Oyuncu Kazandı...");
			 
			 System.out.println("");
			 
			 System.err.println("Oyuncunun Sonucu = " + player);
			 System.err.println("PC Sonucu = " + computer);
			 
			 
			 Pscore+=3;
			 System.out.println("Oyuncu Skor = " + Pscore +" PC Skor = " + PCscore);
			 System.out.println("");
		 }
		 
		 if(Pscore >= 10) {
			 System.out.println("Oyun Bitti Oyuncu Kazandı");
			 System.out.println("");
			 System.err.println("Sonuç = " + "Oyuncu : " + Pscore +" PC : " + PCscore);
			 break;
		 }
		 else if(PCscore >= 10) {
			 System.out.println("Oyun Bitti PC Kazandı");
			 System.out.println("");
			 System.err.println("Sonuç = " + "Oyuncu : " + Pscore +" PC : " + PCscore);
			 break;
		 }

	}
	}
}
