package com.skillstorm.project;

public class Civilian extends Playertypes{
 public Civilian(String name, String utility, String utility2, String utility3) {
	 super(name, utility, utility2, utility3);
	 
 	}
public void utility() {
	System.out.println("I have Luck on my side.");	
	}
public void utility2() {
	System.out.println("I have my trustee, Snuggles, my cane corso, best dog ever!");
	}
public void utility3() {
	System.out.println("I have think I have a great perception of things around me.");
	}
 
@Override
	public String toString() {
		
		return "I am a " + getName() + " with a " + hasUtility() + ", " + hasUtility2()+ ", and "  + hasUtility3() ;
		
	}
}
