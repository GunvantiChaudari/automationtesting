package JavaProgram2;

public class staticblock {
     static {
    	 System.out.println("this is a first static block");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        staticblock A1=new staticblock();
        A1.substraction();
        addition();
	}
  static void addition() {
	  int a=20,b=30;
	  int c=a+b;
	  System.out.println("addition of a and b:"+c);
  }
  static{
	  System.out.println("this is a static block");
  }
  {
	  System.out.println("this is anon static block");
  }
  void substraction() {
	  int a=20,b=10;
	  int c=a-b;
	  System.out.println("substraction:"+c);
  }
}
