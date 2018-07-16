package learnOOPConcepts.Enumerations;

enum Mobile{
	APPLE(100),SAMSUNG(80),HTC(70);
	int price;
	int getPrice(){
		return price;
	}
	Mobile(){
		price=80;
		System.out.println("constructor");
	}
	
	Mobile(int price){
		this.price=price;
		System.out.println("constructor"+this.price);
	}	
}
/*
class Mobile{
	static final Mobile APPLE = new Mobile();
	
}*/

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Mobile.APPLE.getPrice());
	}

}
