package com.skillstorm.project;

public class Agent extends Playertypes{
public Agent(String name, String utility, String utility2, String utility3) {
	 super(name, utility, utility2, utility3);
}
public void utility() {
	System.out.println("I have my federally issues service gun.");
}
public void utility2() {
	System.out.println("I carry my identification everywhere.");
}
public void utility3() {
	System.out.println("I have a high level of job intelligence!");
}
@Override
	public String toString() {
		return "I am a Federal " + getName() + " with a " + hasUtility() + ", " + hasUtility2()+ ", and "  + hasUtility3() ;
		
				
	}

}
