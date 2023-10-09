package Assignment;
abstract class a{
	abstract void disply();
	void phone(int h) {
		System.out.println("i am a phone method: "+h);
	}
}
class ah extends a{
	void disply(){
    System.out.println("i am a h method");
	}
}

public class Program2 {

	public static void main(String[] args) {
		ah d1 =new ah();
		d1.disply();
		d1.phone(26);
	}

}
