package learnOOPConcepts.generics;

public class Bartender {
	
	public <J,W> Cocktail mix(J j, W w){
		return new Cocktail();
	}
	
	public <J,W> void  mix2(J j, W w){
		
	}
	
	public static <J,W> void mix3(J j, W w){
		
	}

}
