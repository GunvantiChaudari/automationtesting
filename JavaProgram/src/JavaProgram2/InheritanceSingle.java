package JavaProgram2;

public class InheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        W A1=new W();
        A1.child();
        A1.display();
	}

}
class D{
	 void display(){
		System.out.println("this is a display");
	}
}
class W extends D{
	void child() {
		System.out.println("this is a child");
	}
}