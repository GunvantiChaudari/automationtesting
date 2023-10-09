package NewAssignment;
abstract class dev{
	abstract void display();

   public void print() {
	   System.out.println("i am aprint method");
   }
}
class gev extends dev{
	void display() {
		System.out.println("i am a display method");
	}
	void print(int num) {
		int rev=0,rem=0;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("reverse number: "+rev);
	}
}
public class Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gev a1=new gev();
		 a1.display();
		 a1.print();
		 a1.print(123);
	}

}
