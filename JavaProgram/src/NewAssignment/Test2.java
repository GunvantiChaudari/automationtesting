package NewAssignment;

public class Test2 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dcb A1=new Dcb();
		A1.triple();
		A1.single();
		choice m1=new choice();
		System.out.println("private variable:" +m1.a);
		System.out.println("protected variable:"+m1.z);
	
	}

}
class Abc{
	Abc(){
	}
	void single() {
		System.out.println("this is a non static method:");
	}
}
class Dcb extends Abc{
	Dcb(){

	}
	void triple() {
		System.out.println("i am pihu");
	}
}