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
class volume{
	public static final int LOW = 20;
	public static final int MEDIUM = 50;
	public static final int HIGH = 100;
	private int vol;
	public void setVol(int vol){
		this.vol=vol;
		System.out.println("set vol");
		System.out.println(this.vol);
	}
	public int getVol(){
		System.out.println(this.vol);
		return this.vol;
	}
}

enum VolumeEnum{
	 LOW(10),MEDIUM(50),MAX(100);
	 int vol;
	 private VolumeEnum(int vol) {
		// TODO Auto-generated constructor stub
		 this.vol=vol;
	 }
}

public class MainClass {
	public void changeVol(VolumeEnum vol){
		System.out.println(vol);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*System.out.println(Mobile.HTC.getPrice());
		System.out.println(volume.HIGH);
		new volume().setVol(1000);
		System.out.println(new volume().getVol());// reason is not working new key word because  you are using two different object for setter and getter
*/	}

}
