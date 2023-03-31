package com.skillstorm.project;

import java.util.Scanner;


public class Playertypes extends Game{
	private String name;
	private String utility;
	private String utility2;
	private String utility3;
	Scanner in = new Scanner(System.in);
	
public Playertypes(String name, String utility, String utility2, String utility3) {
		this.name = name;
		this.utility = utility;
		this.utility2 = utility2;
		this.utility3 = utility3;
}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUtility(String utility) {
		this.utility = utility;
	}
	public String hasUtility() {
		return this.utility;
		
	}
	public void setUtility2(String utility2) {
		
}
	public String hasUtility2() {
		return this.utility2;
	}
	public void setUtility3(String utility3) {
		this.utility3 = utility3;
	}
	public String hasUtility3() {
		return this.utility3;
}
	
	public Playertypes playType(Scanner input) {
		boolean cont = false; // just a flag
		int choice; // need this scoped outside of my while loop so i can use it later
		Agent agent = new Agent("Agent", "Gun", "Badge", "Intelligence");		
		Civilian civilian = new Civilian("civilian", "Luck", "Perception", "Dog");
		
		do{
			
			System.out.println("Choose your playtype:");
			System.out.println("1. " + agent);
			System.out.println("2. " + civilian);
			choice = Integer.parseInt(in.nextLine().trim());
			
			if (choice < 1 || choice > 2) {
			System.out.println("Please enter a 1 or a 2");
			cont = true;
			} else {
			cont = false;
			}
			} while(cont);
	
		
		if (choice == 1) {
		
		return newAgent(input);
		
		} else {
		
		return newCivilian(input);
	}
	}
		public static Playertypes newAgent(Scanner in) {
			System.out.print("What is your name, Agent?: ");
			String name = in.nextLine();
			String gun = "gun";
			String intelligence = "intelligence";
			String badge = "badge";
			Agent player = new Agent(name, gun, badge, intelligence);
			System.out.println("Welcome to the Agency, " + player.getName() + "!");
			agentHouse agentHouse = new agentHouse();
			agentHouse.scenarioAgent1(in);

			return player;
}
		public static Playertypes newCivilian(Scanner in) {
			System.out.print("What is your name, Sir / Madam?: ");
			String name = in.nextLine();
			String perception = "Perception";
			String luck = "Luck";
			String dog = "Dog Cane Corso";
			Civilian player2 = new Civilian(name, "Perception", "Luck", "Cane Corso");
			System.out.println("Welcome to the neighborhood, " + player2.getName() + "!");
			civilianHouse civilianHouse = new civilianHouse();
			civilianHouse.scenarioCiv(in);
			return player2;
		}
}
	
