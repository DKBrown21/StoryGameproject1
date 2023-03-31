package com.skillstorm.project;

import java.util.Scanner;
import com.skillstorm.project.Game;

public class agentHouse {
	
	//Welcome Agent, we received a tip that illegal activities are occuring in the house on the hill.
	// playerName: I will look into the matter.
	//Agent arrives on the hill choose your path: game method
		Scanner input = new Scanner(System.in);
		
	
		public Playertypes scenarioAgent1(Scanner in) {
	
		
			boolean cont = false; //just a flag
			int choice;
			do{
				System.out.println("Welcome Agent, we received a tip that illegal activities are occuring in the house on the hill.");
				System.out.println("I will look into the matter.");
				System.out.println("Agent arrives at the house on the hill choose your path:");
				System.out.println("1. Badge: Knock on door identification ready.");
				System.out.println("2. Gun: Draw weapon ready to shoot.");
				System.out.println("3. Intelligence: Walk around the house looking for signs of inconspicous activity.");
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
					//Badge
					System.out.println("Knock on door and answered by a man wealthy man in late 40s of average height named Miles." );
					return agentScenerioB2(in);
				} else if (choice == 2) {
					//Gun
					System.out.println("Draw weapon and knock ready to shoot!");
					return agentScenarioG2final(in);
				}else if (choice == 3) {
					//Intelligence
					System.out.println("Intelligence: Walk around the house looking for signs of inconspicous activity.");
					return agentScenarioI2(in);				
				}
				
				return null;  	
		}
			public Playertypes agentScenerioB2(Scanner in) {

				boolean cont = false; //just a flag
				int choice;
				
				do{
					System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("Knock on door and answered by a man wealthy man in late 40s of average height named Miles.");
					System.out.println("Miles asks 'How can I help you, Agent?' ");
					System.out.println("1. Badge - Show badge and explain a report came from this area.");
					System.out.println("2. Gun - Draw weapon.");
					System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
					choice = Integer.parseInt(in.nextLine().trim());
					
					if(choice < 1 || choice > 3) {
						System.out.println("Please enter a 1 or 2 or 3");
						cont = true;
					}	else {
						cont = false;
					}
					} while(cont);
					
					if(choice == 1) {
						//Badge
						System.out.println("Show your badge and state that weird sounds were reported coming from the area.");
						return agentScenerioB3(in);
					} else if (choice == 2) {
						//Gun
						System.out.println("Draw weapon and point it at Miles");
						return agentScenarioB2Gfinal(in);
					}else if (choice == 3) {
						//Intelligence
						System.out.println("Intelligence - Explain arrival to the house for health and wellness check.");
						System.out.println();
						return agentScenarioB2I(in);
						
					}
					return null;  
			}
			public Playertypes agentScenerioB3(Scanner in) {

			boolean cont = false; //just a flag
			int choice;
			do{
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Show your badge and state that weird sounds were reported coming from the area.");
				System.out.println("Miles ensures you that nothing is going on and that you can come in for a quick "
						             + "look if you would like, but needs to be quick because he is on his way out.");
				System.out.println("You enter the home and faced with these choices:");
				System.out.println("1. Badge - Thank him, and ask him what could it had been");
				System.out.println("2. Gun - Draw weapon when you enter the house.");
				System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
				choice = Integer.parseInt(in.nextLine().trim());
				
				if(choice < 1 || choice > 3) {
					System.out.println("Please enter a 1 or 2 or 3");
					cont = true;
				}	else {
					cont = false;
				}
				} while(cont);
				
				if(choice == 1) {
					//Badge
					System.out.println("1. Badge - Thank him, and ask him what could it had been");
					return agentScenerioB4final(in);
				} else if (choice == 2) {
					//Gun
					System.out.println("Draw weapon and at Miles' back");
					return agentScenarioB3G1(in);
				}else if (choice == 3) {
					//Intelligence
					System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
					return agentScenarioB3I(in);
				}
				return null;
			}
			public Playertypes agentScenerioB4final(Scanner in) {
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("Thank him, and ask him what could it had been");
					System.out.println("Miles asks 'How can I help you, Agent?' ");
					System.out.println("You question Miles asking what could the noises reported have been.");
					System.out.println("Miles states that it could have been the tv and tells you to turn it out "
							          + " and see if it is too loud. You turn the tv and it roars!");
					System.out.println("At the same time as you go to cover your ears, there is a gun shot and"
							          + " you fade to black.");
					Game.gameover();
					return scenarioAgent1(in);
			}	
			public Playertypes agentScenarioG2final(Scanner in)	{		
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Shot at killed by assailant in the house. ");
				Game.gameover();
				return scenarioAgent1(in);
			}
			public Playertypes agentScenarioB2Gfinal(Scanner in) {
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Draw weapon push through man.");
				System.out.println("Miles calls your boss’s boss directly informs him of your behavior and you get the fired"
							           + "from the federal agency.");
				System.out.println("Gameover!");
				return scenarioAgent1(in);
				
			}
			public Playertypes agentScenarioB3G1(Scanner in) {
				boolean cont = false; //just a flag
				int choice;
				do{
					System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("Draw weapon when you enter the house.");
					System.out.println("Threaten to arrest Miles unless he tells you what is going on.");
					System.out.println("Miles glares and then says alright, I will show you!");
					System.out.println("Miles leads you down to the upstairs where there is a putrid smell, "
						               + "asking you if you think your making a good choice. ");
					System.out.println("Badge - Cuff him to steps");
					System.out.println("Gun - Continue following Miles with gun to his back.");
					System.out.println("Intelligence - Handcuff Miles and have him open up each door and"
				               + " moving methodically through upstairs.");
					choice = Integer.parseInt(in.nextLine().trim());
					
					if(choice < 1 || choice > 3) {
						System.out.println("Please enter a 1 or 2 or 3");
						cont = true;
					}	else {
						cont = false;
					}
					} while(cont);
					
					if(choice == 1) {
						//Badge
						System.out.println("Cuff him to steps");
						return agentScenarioB4G1final(in);
						
					} else if (choice == 2) {
						//Gun
						System.out.println("Continue following Miles with gun to his back.");
						return agentScenarioB3G2finalwin(in);
					}else if (choice == 3) {
						//Intelligence
						System.out.println("Handcuff Miles and have him open up each door and"
					               + " moving methodically through upstairs.");
						return agentScenarioB3I2final(in);
					}
					return null;
				}
			public Playertypes agentScenarioB4G1final(Scanner in) {
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Cuff him to steps then go through the house");
				System.out.println("Find out the smell is coming from dead animals in the tub.");
				System.out.println("Miles laughs and tell you that he is a hunter /n and tell you that your time as an agent are over!");
				System.out.println("You leave knowing your days are number!");
				Game.gameover();
				return scenarioAgent1(in);
			}
			public Playertypes agentScenarioB3G2finalwin(Scanner in) {
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Continue clearing the room following Miles at gunpoint.");
				System.out.println("When the last room is cleared, you hear a thump from the closet.");
				System.out.println("You force Miles to open the door.");
				System.out.println("Behind the door is the Cookie Monster who has been missing.");
				System.out.println("You tell Miles that he is going down for this");
				System.out.println("Miles yells I was saving the cookies!");
				Game.finalWinagent();
				return null;
			}
			public Playertypes agentScenarioI2(Scanner in) {
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Intelligence: Walk around the house looking for signs of inconspicous activity.");
				System.out.println("You notice some blue fur that looks out of place.");
				System.out.println("You hear the owner ask what you are doing from the window.");
				System.out.println("You tell him you will be right around to explain.");
				return agentScenerioB2(in);
			}
			public Playertypes agentScenarioB2I(Scanner in) {
				boolean cont = false; //just a flag
				int choice;
				do{
					System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("Agent replies that you were in the area doing a routine health and"
							+  "wellness check because neighbors said they haven’t seen you coming or going recently.");
					System.out.println("Miles states, 'That is very kind of them, as you see, I am alright.'");
					System.out.println("Agent replies, 'May I come in for a moment it has been a long trip out this way.'");
					System.out.println("Miles ensures you that nothing is going on and that you can come in for a quick "
							             + "look if you would like, but needs to be quick because he is on his way out.");
					System.out.println("You enter the home and faced with these choices:");
					System.out.println("1. Badge - Thank him, and ask him what could it had been");
					System.out.println("2. Gun - Draw weapon when you enter the house.");
					System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
					choice = Integer.parseInt(in.nextLine().trim());
					
					if(choice < 1 || choice > 3) {
						System.out.println("Please enter a 1 or 2 or 3");
						cont = true;
					}	else {
						cont = false;
					}
					} while(cont);
					
					if(choice == 1) {
						//Badge
						System.out.println("1. Badge - Thank him, and ask him why people could of thought something happened.");
						return agentScenarioB3tweak(in);
					} else if (choice == 2) {
						//Gun
						System.out.println("Draw weapon and at Miles' back");
						return agentScenarioB3G1(in);
					}else if (choice == 3) {
						//Intelligence
						System.out.println("3. Intelligence - Explain what a health and welness check is.");
						return agentScenarioB2I2(in);
						
			}
					return null;
}
			public Playertypes agentScenarioB2I2(Scanner in) {

				boolean cont = false; //just a flag
				int choice;
				do{
					System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("State that you were in the area doing a routine health"
					           + " and wellness check because neighbors said they haven’t"
					           + " seen you coming or going recently.");
					System.out.println("Casually you manuever through the living room taking in the sights. /n noticing"
										+ "an unsual amount of cookies and more blue fur.");
					System.out.println("You ask him if he has been away on business or been ill.");
					System.out.println("Miles states, 'Just been home no need to leave.'");
					System.out.println("You ask him where are you going today?");
					System.out.println("He states no where.");
					System.out.println("Then you hear a thump!");
					System.out.println("1. Badge - Ask if anyone else is here");
					System.out.println("2. Gun - Draw weapon when on him");
					System.out.println("3. Intelligence - Act as if you did not hear anything.");
					choice = Integer.parseInt(in.nextLine().trim());
					
					if(choice < 1 || choice > 3) {
						System.out.println("Please enter a 1 or 2 or 3");
						cont = true;
					}	else {
						cont = false;
					}
					} while(cont);
					
					if(choice == 1) {
						//Badge
						System.out.println("1. Badge - Thank him, and ask him what could it had been");
						return agentScenerioB4final(in);
					} else if (choice == 2) {
						//Gun
						System.out.println("Draw weapon and at Miles' back");
						return agentScenarioB3G1(in);
					}else if (choice == 3) {
						//Intelligence
						System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
			}
					return null;
}
			public Playertypes agentScenarioB3I(Scanner in) {
				boolean cont = false; //just a flag
				int choice;
				do{
					System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("Casually you manuever through the living room taking in the sights. /n noticing"
										+ "an unsual amount of cookies and more blue fur.");
					System.out.println("You ask him where are you going today?");
					System.out.println("He states no where.");
					System.out.println("Then you hear a thump!");
					System.out.println("1. Badge - Ask if anyone else is here");
					System.out.println("2. Gun - Draw weapon when on him");
					System.out.println("3. Intelligence - Act as if you did not hear anything.");
					choice = Integer.parseInt(in.nextLine().trim());
					
					if(choice < 1 || choice > 3) {
						System.out.println("Please enter a 1 or 2 or 3");
						cont = true;
					}	else {
						cont = false;
					}
					} while(cont);
					
					if(choice == 1) {
						//Badge
						System.out.println("1. Badge - Thank him, and ask him what could it had been");
						return agentScenerioB4final(in);
					} else if (choice == 2) {
						//Gun
						System.out.println("Draw weapon and at Miles' back");
						return agentScenarioB3G1(in);
					}else if (choice == 3) {
						//Intelligence
						System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
			}
					return null;
			}
			public Playertypes agentScenarioB3tweak(Scanner in) {
				boolean cont = false; //just a flag
				int choice;
				do{
					System.out.println("************************************** \n\n\n\n\n\n***********************************");

					System.out.println("State that you were in the area doing a routine health"
					           + " and wellness check because neighbors said they haven’t"
					           + " seen you coming or going recently.");
				
					System.out.println("You ask him if anyone other than him has been in the house");
					System.out.println("Miles states, 'No why would you ask'");
					System.out.println("You state maybe there were people coming not you and though something happened.");
					System.out.println("He states no one was coming and going just him.");
					System.out.println("Then you hear a thump!");
					System.out.println("1. Badge - Ask if anyone else is here");
					System.out.println("2. Gun - Draw weapon when on him");
					System.out.println("3. Intelligence - Act as if you did not hear anything.");
					choice = Integer.parseInt(in.nextLine().trim());
					
					if(choice < 1 || choice > 3) {
						System.out.println("Please enter a 1 or 2 or 3");
						cont = true;
					}	else {
						cont = false;
					}
					} while(cont);
					
					if(choice == 1) {
						//Badge
						System.out.println("1. Badge - Thank him, and ask him what could it had been");
						return agentScenerioB4final(in);
					} else if (choice == 2) {
						//Gun
						System.out.println("Draw weapon and at Miles' back");
						return agentScenarioB3G1(in);
					}else if (choice == 3) {
						//Intelligence
						System.out.println("3. Intelligence - Explain arrival to the house for health and welfare.");
			}
					return null;
			}
			public Playertypes agentScenarioB3I2final(Scanner in) {
				System.out.println("************************************** \n\n\n\n\n\n***********************************");

				System.out.println("Handcuff Miles and have him open up each door and"
			               + " moving methodically through upstairs.");
				System.out.println("You begin clearing rooms.");
				System.out.println("You enter the last room, open the closet");
				System.out.println("Boom, your hit over the head by Miles accomplice.");
				System.out.println("Fade to black!");
				Game.gameover();
				return scenarioAgent1(in);
			}
}
