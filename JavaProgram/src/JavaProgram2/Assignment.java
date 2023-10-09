package JavaProgram2;

public class Assignment {
      static int num=10;
      int num1=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("this is a number");
      Assignment A1=new Assignment(20,20);
      System.out.println("The num1 is:"+A1.num1);
      pallindrome();
      A1.addition();
      A1.substraction(30,20);
      
	}
   static {
	   System.out.println("this is static block");
   }
   {
	   System.out.println("this is non-static block");
   }
   private static void pallindrome() {
	   int num=141;
	   int sum=0,rem=0;
	   int temp=0;
	   while(num>0) {
	   rem=num%10;
	   sum=sum*10+rem;
	   num=num/10;
   }if (temp==num) {
	   System.out.println("num is a pallindrome");
   }else {
	   System.out.println("num is not a pallindrome");
   }
}
   void addition() {
	   int num=20,num2=30;
	  int result=this.num+num2;
	   System.out.println("addition of:"+result);
   }
   void substraction(int a,int b) {
	   int c=a-b;
	   System.out.println("sub of:"+c);
	   
   }
   Assignment(){
	   
	   
    System.out.println("this is a constructor");
   }
   Assignment(int d,int f){
	   this();
	   int g=d*f;
	   System.out.println("multipication of:"+g);
   }
}