package NewAssignment;

import java.util.Arrays;

class fruit{
	void pineapple() {
		System.out.println("i am a pinepple");
	}
	void apple() {
		System.out.println("i am a apple2");
}
}
	class guava extends fruit{
		void pineapple() {
			System.out.println("i am a pineapple2");
		}
		void apple() {
			System.out.println("i am a apple");
		}
	}

	public class polymorphism1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			fruit a1=new fruit();
			a1.pineapple();
			a1.apple();
			fruit b1=new guava();
            b1.pineapple();
            b1.apple();
		}

	}
