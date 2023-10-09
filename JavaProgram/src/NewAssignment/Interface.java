package NewAssignment;
interface displey{
	void phone();
}
interface shape{
	void phone();
}
 class circle implements displey,shape{
	 public void phone() {
		  int a=158;
		  int rev=0,rem=0;
		  int temp=a;
		  while(a>0) {
			  rem=a%10;
			  rev=rev*10+rem;
			  a=a/10;
		  }if(temp==a) {
			  System.out.println("number is pallindrome");
		  }else {
			  System.out.println("number is not pallindrome");
		  }
	  }
 }

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle a1=new circle();
		  a1.phone();
	}

}
