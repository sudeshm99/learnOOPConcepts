package learnOOPConcepts.generics;

public class Guest {

	public static void main(String[] args) {
		
		/*Glass<Juice> glass = new Glass<Juice>();// Juice is type argument
		Juice juice = new Juice();
		glass.liquid = juice;
		
		Juice j = glass.liquid;
		
		Glass<Water> glassW = new Glass<Water>();// Water is type argument
		Water water = new Water();
		glassW.liquid=water;
		
		Water w = glassW.liquid;*/
		
		Bartender bartender = new Bartender();
		Water water = new Water();
		Juice juice = new Juice();
		
		R r = new R();
		G g = new G();
		B b = new B();
		
		Glass<Water> glass = new Glass<>();
		
		bartender.<Juice, Water>mix(juice, water);
		bartender.<Juice, Water>mix2(juice, water);
		Bartender.<Juice, Water>mix3(juice, water);		
		Color<R, G, B> color = new Color<>();
	}

}
