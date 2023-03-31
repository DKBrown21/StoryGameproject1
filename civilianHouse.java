package com.skillstorm.project;

import java.util.Scanner;

public class civilianHouse {
Scanner input = new Scanner(System.in);

public Playertypes scenarioCiv(Scanner in) {
boolean cont = false; //just a flag
int choice;
do{
	System.out.println("Snuggles, your dog, sniffed around and caught the smell of money from a briefcase "
			           + "\n that seems to belong to the individual \n on the house on the hill.");
	System.out.println("How you would respond given these choices");
	System.out.println("1. Perception -  Leave Briefcase");
	System.out.println("2. Luck - Open Briefcase");
	System.out.println("3. Dog - Take Briefcase to owner of the home");
	choice = Integer.parseInt(in.nextLine().trim());
	
	if(choice < 1 || choice > 3) {
		System.out.println("Please enter a 1 or 2 or 3");
		cont = true;
	}	
	else {
		cont = false;
	}
	} while(cont);
	
	if(choice == 1) {
		System.out.println("1. Perception - Leave Briefcase");
		return ScenarioCivL(input);
	} else if (choice == 2) {
		//Gun
		System.out.println("2. Luck - Open Briefcase");
		return ScenarioCivPfinal(in);
	}else if (choice == 3) {
		//Intelligence
		System.out.println("3. Dog - Take briefcase to the owner of the house.");
		return ScenarioCivD(in);				
	}
	return scenarioCiv(in);  	
}
	public Playertypes ScenarioCivL(Scanner in) {
		boolean cont = false; //just a flag
	int choice;
	do{
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.println("Open Briefcase ");
		System.out.println("Finds ten thousand dollars and a note inside that says return to owner in "
				+ "         case lost. Owners address is house on top of the hill.");
		System.out.println("1. Perception -  Take briefcase home since know one saw you.");
		System.out.println("2. Luck - Take the money home and leave briefcase");
		System.out.println("3. Dog - Take Briefcase to owner of the home");
		choice = Integer.parseInt(in.nextLine().trim());
		
		if(choice < 1 || choice > 3) {
			System.out.println("Please enter a 1 or 2 or 3");
			cont = true;
		}	
		else {
			cont = false;
		}
		} while(cont);
		
		if(choice == 1) {
			System.out.println("1. Perception -  Take briefcase home since know one saw you.");
			return ScenarioCivLP2final(input);
		} else if (choice == 2) {
			//Gun
			System.out.println("2. Luck - Take the money home and leave briefcase");
			return ScenarioCivL2final(in);
		}else if (choice == 3) {
			//Intelligence
			System.out.println("3. Dog - Take Briefcase to owner of the home");
			return ScenarioCivD(in);				
		}
		return scenarioCiv(in);  	
}
	public Playertypes ScenarioCivPfinal(Scanner in) { 
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

	System.out.println("Leave Briefcase");
	System.out.println("Dog no longer trusts you");
	System.out.println("Dog runs away do to him sadness since you never listen to him.");
		Game.gameover();
		return scenarioCiv(in);
		
}	
	public Playertypes ScenarioCivLP2final(Scanner in){
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.println("Take the briefcase home.");
	System.out.println("Days later police knocking at your door. Briefcase was airtagged");
	System.out.println("Arrested for stealing the money!");
		Game.gameover();
		return scenarioCiv(in);
	
}
	public Playertypes ScenarioCivD(Scanner in) {
		boolean cont = false; //just a flag
		int choice;
		do{
			System.out.println("************************************** \n\n\n\n\n\n***********************************");

			System.out.println("You take briefcase to the owner with everything inside.");
			System.out.println("You knock on the door and Darryl, owner of the house, opens the door.");
			System.out.println("He notices his briefcase and says thank you and offers you to come in.");
			System.out.println("1. Perception -  Notice how dark the aura is around the house and leave.");
			System.out.println("2. Luck - Take the chance to see if he rewards you.");
			System.out.println("3. Dog - Snuggles is smelling something good so you go in.");
			choice = Integer.parseInt(in.nextLine().trim());
			
			if(choice < 1 || choice > 3) {
				System.out.println("Please enter a 1 or 2 or 3");
				cont = true;
			}	
			else {
				cont = false;
			}
			} while(cont);
			
			if(choice == 1) {
				System.out.println("1. Perception -  Notice how dark the aura is around the house and leave.");
				return ScenarioCivDP2final(input);
			} else if (choice == 2) {
				//Gun
				System.out.println("2. Luck - Take the chance to see if he rewards you.");
				return ScenarioCivDL2(in);
			}else if (choice == 3) {
				//Intelligence
				System.out.println("3. Dog - Snuggles is smelling something good so you go in.");
				return ScenarioCivDL2(in);	
			}
			return scenarioCiv(in);
}	
	public Playertypes ScenarioCivL2final(Scanner in) {
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.println("Take the money home and leave briefcase ");
		System.out.println("Dog is saddened from guilt!");
		System.out.println("Dog dies!");
		Game.gameover();
		return scenarioCiv(in);  
}
	public Playertypes ScenarioCivDP2final(Scanner in) {
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.print("You go home and find on the news that Darryl was a "
				+ "billionaire waiting for someone to do a kind act so he can give him his fortune");
		System.out.println("You fall into a deep depression!");
		Game.gameover();
	return scenarioCiv(input);
	
	}
	public Playertypes ScenarioCivDL2(Scanner in) {
	boolean cont = false; //just a flag
	int choice;
	do{
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.println("Take the chance and go in the house");
		System.out.println("Darryl states please put dog in the back");
		System.out.println("As you walk through the house you notice all the nice things and see more briefcases");
		System.out.println("1. Perception - think how many people have showed up with money briefcases time to go");
		System.out.println("2. Luck - take your chances with Darryl.");
		System.out.println("3. Dog - You tell Snuggles to attack Darryl and take all the money");
		choice = Integer.parseInt(in.nextLine().trim());
		
		if(choice < 1 || choice > 3) {
			System.out.println("Please enter a 1 or 2 or 3");
			cont = true;
		}	
		else {
			cont = false;
		}
		} while(cont);
		
		if(choice == 1) {
			System.out.println("1. Perception - think how many people have showed up with money briefcases then time to go");
			return ScenarioCivDP2final(input);
		} else if (choice == 2) {
			//Gun
			System.out.println("2. Luck - take your chances with Darryl.");
			return scenarioCivDL3final(in);
		}else if (choice == 3) {
			//Intelligence
			System.out.println("3. Dog - You tell Snuggles to attack Darryl and take all the money");
			return scenarioCiv(in);	
		}
		return scenarioCiv(in);
	}
	public Playertypes scenarioCivDL3final(Scanner in) {
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.println("Put dog in the back and after about an hour of chatting it up with Darryl, dinner is ready.");
		System.out.println("When you arrive at the table the meal is out in glorious fashion.");
		System.out.println("He says go head and try it you.");
		System.out.println("You taste it and says its pretty good what is it?");
		System.out.println("He says Snuggles!");
		Game.gameover();
		return scenarioCiv(in);
		
	}
	public Playertypes scenarioCivD2L3finalwin(Scanner in) {
		System.out.println("************************************** \n\n\n\n\n\n***********************************");

		System.out.println("The large amount of money and numerous briefcases tell you its scam.");
		System.out.println("So you command Snuggles to attack Darryl.");
		System.out.println("Snuggles attacks and you take as much money from the briefcases as you can carry and flea");
		System.out.println("Next day on the news you overhear that Darryl was keeping people captive at his house.");
		System.out.println("He died and the victim was able to escape.");
		System.out.println("You are a hero. Great job or shotty job");
		return null;
	}
}
