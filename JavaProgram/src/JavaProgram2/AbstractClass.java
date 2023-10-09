package JavaProgram2;

public class AbstractClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Draw A1=new Rectangle();
        A1.shape();
        A1.colour();
        A1.size();
  
	}

}
abstract class Draw{
	abstract void shape();
	void colour() {
		System.out.println("this is a draw");
	}
	void size() {
		System.out.println("This is a parent class method");
	}
}
class Rectangle extends Draw{
	void shape() {
		System.out.println("this is a rectangle");
	}
	void size() {
		System.out.println("This is a child class method");
	}
}

