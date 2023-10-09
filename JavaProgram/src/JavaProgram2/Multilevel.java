package JavaProgram2;

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C A1=new C();
		A1.display();
		A1.main();
		A1.coose();
	}

}
class V
{
	V(){
		System.out.println("this is a constructor");
	}
	void display() {
		System.out.println("this is a method");
	}
}
class G extends V
{
	G(){
		System.out.println("i am a constructor");
	}
	void main() {
		System.out.println("i am a method");
	}
}
class C extends G{
	C(){
		System.out.println("i am a 2 constructor");
	}
	void coose() {
		System.out.println("i am a 2 method");
	}
}