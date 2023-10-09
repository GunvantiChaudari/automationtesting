package NewAssignment;
abstract class addition{
	abstract void add();
	void sun() {
		System.out.println("i am a sun");
	}
	
}
class num extends addition{
	void add () {
		System.out.println("i am a addition of two digit");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num a1=new num();
		a1.add();
		a1.sun();

	}

}
