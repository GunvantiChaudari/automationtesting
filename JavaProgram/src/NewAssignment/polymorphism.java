package NewAssignment;
class git{
	void show() {
		System.out.println("i am show");
	}
	void display() {
		System.out.println("i am display");
	}
}
class sit extends git{
	void show() {
		System.out.println("i am a showq");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		git a1=new sit();//upcasting
		a1.show();
		a1.display();

	}

}
