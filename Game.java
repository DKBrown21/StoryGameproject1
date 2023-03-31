package com.skillstorm.project;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Playertypes playertypes = new Playertypes(null, null, null, null);
		
		Intro.intro();
		playertypes.playType(input);
				
	}
			
	public static void gameover() {
		System.out.println("How unforntuate!");
		System.out.println("GAME OVER!");
		System.out.println("How about you try again!");
		System.out.println("************************************** \n\n\n\n\n\n***********************************");
		
	}
	public static void finalWinagent() {
		System.out.println("Good work agent! You caught Cookie Monster Bandit!");
		System.out.println("Way to handle this situation with great intelligence and good fundamentals for investigation.");
		System.out.println("************************************** \n\n\n\n\n\n***********************************");
		System.out.println("Congrats you made it to a positive outcome!");
		
	}
		
	
	
	
	
}

		


			
