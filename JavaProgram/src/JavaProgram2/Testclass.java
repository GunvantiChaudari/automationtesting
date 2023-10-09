package JavaProgram2;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 A1 = new Demo2();
		A1.monkey();
		A1.animal();
	}

}
interface Demo {
	int age=18;
	int salary=25000;
	abstract void animal();
}
interface Demo1{
	void monkey();
}
class Demo2 implements Demo,Demo1{
	public void animal() {
		System.out.println("hello,print:"+Demo.age);
	}
	public void monkey() {
		System.out.println("hii:"+Demo.salary);
	}
}