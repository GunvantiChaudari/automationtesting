package JavaProgram2;

class A{
	A(){
		System.out.println("i am a constructor");
	}
	void red(){
		System.out.println("i am a method");
	}

}
class B extends A{
	B(){
		System.out.println("i am a B constructor");
	}
	void ref(){
		System.out.println("i am a  REf method");
	}

}
	
	
class Inheritance extends B{
	Inheritance(){
		System.out.println("i am a child class");
	}
	void ref() {
		System.out.println("i am a 2 ref method");
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
     Inheritance A1=new Inheritance();
      A1.red();
      A1.ref();
	B G1=new Inheritance();
	G1.ref();
} 
} 