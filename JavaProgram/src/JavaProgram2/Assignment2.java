package JavaProgram2;
class taste{
	int num=20;
	double num2=8.6;
	public void sweet() {
		System.out.println("i am a sweet");
	}
}
	class soar extends taste{
		int num3=30;
		public void sweet() {
			super.sweet();
			System.out.println("i am a soar");
		}

	}
	public class Assignment2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			taste A1=new soar();
			A1.sweet();
		}

	}
