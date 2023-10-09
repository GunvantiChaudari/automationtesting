package JavaProgram2;

public class Hairarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     learn A1=new learn();
     choice B1=new choice();
     A1.rate();
     A1.range1();
     B1.rate();
     B1.range();
     
	}

}
class Choose {
	Choose(int i){
		System.out.println("I am gunvanti:"+i);
	}
	void rate() {
		System.out.println("i am a sanjiv");
	}
}
class choice extends Choose{
	choice(){
		super(20);
		System.out.println("i am chaudhari");
	}
	void range() {
		System.out.println("i am a pihu");
	}
}
class learn extends Choose{
	learn(){
		super(30);
		System.out.println("i am a aadi");
		
	}
	void range1() {
		System.out.println("i am a aadi chaudhari");
	}
}