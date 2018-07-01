package learnOOPConcepts.inheritance;

public interface Runner extends Walker, Athlete{
		
		int speed();// public abstract int speed();
		double distance=10;// public final static double distance;
}
