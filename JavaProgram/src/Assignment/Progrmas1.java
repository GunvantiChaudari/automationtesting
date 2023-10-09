package Assignment;

class abc {
	abc(int num){
		System.out.println("i am a fruit class constructor:"+num);	
	}
	public void apple() {
		System.out.println("i am a parent class method");
	}
}
class guava extends abc{
	guava(){
		super(26);
		System.out.println("i am a guava class constructor");
	}
	public void chiku() {
		System.out.println("i am a chiku method");
	}
}
class vegitable extends guava{
	vegitable(){
		System.out.println("i am a child class constructor");
	}
	public void bringle() {
		System.out.println("i am a child class method");
	}
}
public class Progrmas1 {

	public static void main(String[] args) {
		vegitable a1=new vegitable();
		a1.apple();
		a1.bringle();
		a1.chiku();
	}  

}
